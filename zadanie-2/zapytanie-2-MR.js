const mapFunction = function () {
    this.credit.forEach(element => {
        const key = element.currency
        const value =  parseFloat(element.balance);
        emit(key, value);
    })
};

const reduceFunction = function (key, values) {
    return Array.sum(values);
};

const cursor = db.people.mapReduce(
    mapFunction,
    reduceFunction,
    { out: { inline: 1 } }
);

printjson(cursor.results)