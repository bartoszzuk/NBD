import exercises.{Exercise1, Exercise10, Exercise2, Exercise3, Exercise4, Exercise5, Exercise6, Exercise7, Exercise8, Exercise9}

object Main {

  def main(args: Array[String]): Unit = {
    val days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    val products = Map("Lamp" -> 100.0, "Book" -> 20.0, "Bike" -> 150.3, "Wallet" -> 15.0)
    val tuple = (10, "Lamp", true)
    val numbers = List(-1, 12, -5, 0, 12, 5, 0, 66, 0, -50)


    new Exercise1().run(days)
    new Exercise2().run(days)
    new Exercise3().run(days)
    new Exercise4().run(days)
    new Exercise5().run(products)
    new Exercise6().run(tuple)
    new Exercise7().run(products)
    new Exercise8().run(numbers)
    new Exercise9().run(numbers)
    new Exercise10().run(numbers)
  }

}
