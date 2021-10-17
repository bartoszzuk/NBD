const cursor = db.people.updateMany(
    { first_name: "Antonio" },
    { $set: { hobby: "pingpong" }}
)
printjson(cursor)