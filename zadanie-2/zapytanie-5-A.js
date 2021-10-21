const cursor = db.people.aggregate([
    { $match: { nationality: "Poland", sex: "Female" } },
    { $unwind: "$credit" },
    { $group: {
            _id: "$credit.currency",
            sumBalance: {$sum: {$toDouble: "$credit.balance"}},
            averageBalance: {$avg: {$toDouble: "$credit.balance"}}
    }}
]);

printjson(cursor.toArray());