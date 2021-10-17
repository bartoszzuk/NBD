const cursor = db.people.aggregate([
    { $unwind: "$credit" },
    {
        $group:
            {
                _id: "$credit.currency",
                totalBalance: { $sum: { $toDouble: "$credit.balance" } },
            }
    }
])
printjson(cursor.toArray())