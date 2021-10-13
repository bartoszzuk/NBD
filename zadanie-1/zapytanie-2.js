result = db.people.findOne({ "$and": [{ "nationality": "China" }, {"sex": "Female"}] })
printjson(result)
