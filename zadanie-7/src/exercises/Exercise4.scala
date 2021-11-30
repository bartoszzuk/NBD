package exercises

class Exercise4 {

  def run(days: List[String]): Unit = {
    println("Exercise 4")
    println(s"a) ${joinDaysUsingFoldLeft(days)}")
    println(s"b) ${joinDaysUsingFoldRight(days)}")
    println(s"c) ${joinDaysStartingWith(days, prefix = "P")}\n")
  }

  def joinDaysUsingFoldLeft(days: List[String]): String = {
    days.foldLeft("")((result, day) => result + ", " + day).stripPrefix(", ")
  }

  def joinDaysUsingFoldRight(days: List[String]): String = {
    days.foldRight("")((result, day) => result + ", " + day).stripSuffix(", ")
  }

  def joinDaysStartingWith(days: List[String],  prefix: String): String = {
    days.filter(day => day.startsWith(prefix))
      .foldLeft("")((result, day) => result + ", " + day)
      .stripPrefix(", ")
  }

}
