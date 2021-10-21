const mapFunction = function () {
    const weight = parseFloat(this.weight);
    const height = parseFloat(this.height) * 0.01; // Convert cm to m
    const bmi = weight / (height * height);
    emit(this.nationality, bmi);
};

const reduceFunction = function (key, values) {
    const reducedObject = { averageBmi: 0, minimumBmi: 0, maximumBmi: 0 };
    reducedObject.averageBmi = Array.sum(values) / values.length;
    reducedObject.minimumBmi = Math.min(...values);
    reducedObject.maximumBmi = Math.max(...values);
    return reducedObject;
};

const cursor = db.people.mapReduce(
    mapFunction,
    reduceFunction,
    { out: { inline: 1 } }
);

printjson(cursor.results)