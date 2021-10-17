var cursor = db.people.find({ weight: { $gte: "68", $lt: "71.5" } });
printjson(cursor.toArray());


