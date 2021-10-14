result = db.people.find({ "$and": [{ "nationality": "Germany" }, {"sex": "Male"}] }).toArray()
printjson(result)
