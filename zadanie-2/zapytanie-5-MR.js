const mapFunction = function () {
    this.credit.forEach(element => {
        const key = element.currency
        const value =  parseFloat(element.balance);
        emit(key, value);
    })
};

const reduceFunction = function (key, values) {
    const reducedObject = { sumBalance: 0, averageBalance: 0 };
    reducedObject.sumBalance = Array.sum(values);
    reducedObject.averageBalance = reducedObject.sumBalance / values.length;
    return reducedObject;
};

const cursor = db.people.mapReduce(
    mapFunction,
    reduceFunction,
    {
        out: { inline: 1 },
        query: { nationality: "Poland", sex: "Female" }
    }
);

printjson(cursor.results)