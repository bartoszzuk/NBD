const mapFunction = function () {
    const key = this.sex;
    const value = { weight: parseFloat(this.weight), height: parseFloat(this.height) };
    emit(key, value);
};

const reduceFunction = function (key, values) {
    const reducedObject = { averageWeight: 0, averageHeight: 0 };
    values.forEach(value => {
        reducedObject.averageWeight += value.weight;
        reducedObject.averageHeight += value.height;
    });
    reducedObject.averageWeight /= values.length;
    reducedObject.averageHeight /= values.length;
    return reducedObject;
};

const result = db.people.mapReduce(
    mapFunction,
    reduceFunction,
    { out: { inline: 1 } }
);

printjson(result.results)