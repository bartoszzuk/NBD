const cursor = db.people.aggregate([
    {
        $group:
            {
                _id: "$sex",
                averageWeight: { $avg: { $toDouble: "$weight" } },
                averageHeight: { $avg: { $toDouble: "$height" } }
            }
    }
])
printjson(cursor.toArray());