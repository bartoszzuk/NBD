var cursor = db.people.updateMany(
    { "location.city": "Moscow" },
    { $set: { "location.city": "Moskwa" }}
)
printjson(cursor)