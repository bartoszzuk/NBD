var cursor = db.people.updateMany(
    { job: "Editor" },
    { $unset: { email: "" }}
)
printjson(cursor)