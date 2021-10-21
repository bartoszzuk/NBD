const cursor = db.people.aggregate([
    {
        $addFields: {
            bmi: {
                $divide: [
                    { $toDouble: "$weight" },
                    { $multiply: [
                        { $toDouble: "$height" }, 0.01, // Convert cm to m
                        { $toDouble: "$height" }, 0.01  // Convert cm to m
                    ] }
                ]
            }
        }
    },
    {
        $group: {
            _id: "$nationality",
            averageBmi: {$avg: "$bmi"},
            minimumBmi: {$min: "$bmi"},
            maximumBmi: {$max: "$bmi"}
        }
    }
])

printjson(cursor.toArray())