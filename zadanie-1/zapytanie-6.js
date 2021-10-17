const cursor = db.people.insertOne({
    birth_date: "1998-06-05T16:00:00Z",
    credit: {
        type: "jcb",
        number: "4017957170327",
        currency: "PLN",
        balance: "0.00"
    },
    description: "Student",
    email: "s18174@pjwstk.edu.pl",
    first_name: "Bartosz",
    last_name: "Zuk",
    height: "182.2",
    job: "Student",
    location: {
        city: "Warsaw",
        address: {
            streetname: "Downing Street",
            streetnumber: "10"
        }
    },
    nationality: "Poland",
    sex: "Male",
    weight: "60.0"
})
printjson(cursorconst)