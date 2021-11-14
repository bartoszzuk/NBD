import argparse
import json
import os
from typing import Dict, Any

from riak import RiakClient, RiakBucket, RiakObject


def load_json_data(path: str) -> Dict[str, Any]:
    if not path.endswith('.json'):
        raise AttributeError()
    if not os.path.exists(path):
        raise FileNotFoundError()
    with open(path, 'r') as file:
        return json.load(file)


def create(bucket: RiakBucket, data: Dict[str, Any], key: str) -> RiakObject:
    bucket.new(key, data).store()
    print(f'Successfully uploaded data with key {key} to bucket {bucket.name}')
    fetched = bucket.get(key)
    print(f'Response: {fetched.data}', end='\n\n')
    return fetched


def update(bucket: RiakBucket, fetched: RiakObject, key: str) -> RiakObject:
    fetched.data['addedField'] = 'I was added programmatically'
    fetched.store()
    print(f'Successfully updated data with key {key} in bucket {bucket.name}')
    fetched = bucket.get(key)
    print(f'Response: {fetched.data}', end='\n\n')
    return fetched


def delete(bucket: RiakBucket, fetched: RiakObject, key: str) -> None:
    fetched.delete()
    print(f'Successfully deleted data with key {key} in bucket {bucket.name}')
    fetched = bucket.get(key)
    if not fetched.exists:
        print(f'Data with key {key} does not exist')
        print(f'Response: {fetched.data}')


def main(bucket: RiakBucket, path: str, key='dummy') -> None:
    try:
        data = load_json_data(path)
        print(f'Successfully loaded data from file {path}', end='\n\n')
        fetched = create(bucket, data, key)
        fetched = update(bucket, fetched, key)
        delete(bucket, fetched, key)
    except AttributeError:
        print(f'File {path} is not JSON')
    except FileNotFoundError:
        print(f'File {path} seems to not exist')


if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument('--json', type=str, help='JSON file path to upload')
    parser.add_argument('--bucket', type=str, help='Riak bucket name', default='s18174')
    parser.add_argument('--key', type=str, help='Assigned bucket key for JSON data', default='schwarzenegger')
    arguments = parser.parse_args()

    client = RiakClient(protocol='http', http_port=8098)
    main(bucket=client.bucket(arguments.bucket), path=arguments.json, key=arguments.key)
