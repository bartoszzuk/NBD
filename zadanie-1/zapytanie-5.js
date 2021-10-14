result = db.people.find(
    { "birth_date": { "$gte": "2000-01-01T00:00:00Z" }},
    { "_id": false, "first_name": true, "last_name": true, "location.city": true }
).toArray()
printjson(result)