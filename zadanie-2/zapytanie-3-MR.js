// Or you could just use db.people.distinct('job')
db.people.mapReduce(
    function () { emit(this.job, null) },
    function (key, values) { return key },
    { out: "result" }
);

// Just to have only id's
const cursor = db.result.find({}, { value: false });

printjson(cursor.toArray());

// Cleanup
db.result.drop();
