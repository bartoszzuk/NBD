package exercises

class Exercise1 {

  def run(days: List[String]): Unit = {
    println("Exercise 1")
    days.foreach(day => println(s"$day: ${matchWeekDay(day)}"))
    println()
  }

  def matchWeekDay(day: String): String = {
    day match {
      case "Poniedziałek" | "Wtorek" | "Środa" | "Czwartek" | "Piątek" => "Work"
      case "Sobota" | "Niedziela" => "Weekend"
      case _ => "No such day exists"
    }
  }

}