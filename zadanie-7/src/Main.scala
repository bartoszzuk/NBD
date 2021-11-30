import exercises.{Exercise1, Exercise2, Exercise3, Exercise4, Exercise5, Exercise6, Exercise7}

object Main {

  def main(args: Array[String]): Unit = {
    val days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    val products = Map("Lamp" -> 100.0, "Book" -> 20.0, "Bike" -> 150.3, "Wallet" -> 15.0)
    val tuple = (10, "Lamp", true)

    val exercise1 = new Exercise1()
    val exercise2 = new Exercise2()
    val exercise3 = new Exercise3()
    val exercise4 = new Exercise4()
    val exercise5 = new Exercise5()
    val exercise6 = new Exercise6()
    val exercise7 = new Exercise7()

    exercise1.run(days)
    exercise2.run(days)
    exercise3.run(days)
    exercise4.run(days)
    exercise5.run(products)
    exercise6.run(tuple)
    exercise7.run(products)
  }

}
