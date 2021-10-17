const cursor = db.people.find({ $and: [{ nationality: "Germany" }, { sex: "Male" }] });
printjson(cursor.toArray());
