result = db.people.find({ "$and": [{ "nationality": "Germany" }, {"sex": "Male"}] })
printjson(result)
