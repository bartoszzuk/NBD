const cursor = db.people.findOne({ $and: [{ nationality: "China" }, { sex: "Female"}] });
printjson(cursor);
