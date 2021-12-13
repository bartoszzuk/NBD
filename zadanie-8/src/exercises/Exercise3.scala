package exercises


class Exercise3 {

  case class Person(name: String, surname: String) {}

  def run(): Unit = {
    matchPerson(Person("Donald", "Trump"))
    matchPerson(Person("Bob", "Dole"))
    matchPerson(Person("Bob", "Dylan"))
    matchPerson(Person("John", "Smith"))
    println()
  }

  def matchPerson(person: Person): Unit = {
    person match {
      case Person("Donald", "Trump") => println(s"${person.name} ${person.surname}: You're fired!")
      case Person("Bob", _) => println(s"${person.name} ${person.surname}: Hello Bob!")
      case Person(_, _) => println(s"${person.name} ${person.surname}: Don't know you. Never heard of you!")
    }
  }

}




