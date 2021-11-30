import exercises.{Exercise1, Exercise2}

object Main {

  def main(args: Array[String]): Unit = {
    val days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    val exercise1 = new Exercise1()
    val exercise2 = new Exercise2()
    exercise1.run(days)
    exercise2.run(days)
  }

}
