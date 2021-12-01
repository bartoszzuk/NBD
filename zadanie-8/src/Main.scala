import exercises._

object Main {

  def main(args: Array[String]): Unit = {
    val days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela", "Worek")

    new Exercise1().run(days)
    new Exercise2().run()
//    new Exercise3().run(days)
//    new Exercise4().run(days)
  }

}
