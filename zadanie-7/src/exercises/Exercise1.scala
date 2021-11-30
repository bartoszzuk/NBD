package exercises

class Exercise1 {

  def run(days: List[String]): Unit = {
    println("Exercise 1")
    println(s"a) ${joinDayUsingForLoop(days)}")
    println(s"b) ${joinDaysStartingWith(days, prefix = "P")}")
    println(s"c) ${joinDayUsingWhileLoop(days)}\n")
  }

  def joinDayUsingForLoop(days: List[String]): String = {
    var result = ""
    for (day <- days)
      result = result + ", " + day
    result.replaceFirst(", ", "")
  }

  def joinDaysStartingWith(days: List[String], prefix: String): String = {
    var result = ""
    for (day <- days) {
      if (day.startsWith(prefix))
        result = result + ", " + day
    }
    result.replaceFirst(", ", "")
  }

  def joinDayUsingWhileLoop(days: List[String]): String = {
    var result = ""
    var index = 0

    while (index < days.size) {
      result = result + ", " + days(index)
      index += 1
    }
    result.replaceFirst(", ", "")
  }

}
