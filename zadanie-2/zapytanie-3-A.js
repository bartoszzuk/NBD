// Or you could just use db.people.distinct('job')
const cursor = db.people.aggregate([
    { $group: { _id: null, uniqueJob: { $addToSet: "$job" } } },
    { $project: { _id: false,  uniqueJob: true } },
    { $unwind: "$uniqueJob" }
])
printjson(cursor.toArray())