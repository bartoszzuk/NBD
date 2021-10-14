result = db.people.deleteMany({ "height": { "$gt": "190" }})
printjson(result)