var cursor = db.people.deleteMany({ height: { $gt: "190" }})
printjson(cursor)