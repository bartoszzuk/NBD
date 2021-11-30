package exercises

class Exercise2 {

  def run(days: List[String]): Unit = {
    println("Exercise 2")
    println(s"a) ${joinDaysUsingRecursion(days)}")
    println(s"b) ${reverseJoinDaysUsingRecursion(days)}")
  }

  def joinDaysUsingRecursion(days: List[String]): String = {
    if (days.size == 1)
      return days.head
    days.head + ", " + joinDaysUsingRecursion(days.tail)
  }

  def reverseJoinDaysUsingRecursion(days: List[String]): String = {
    if (days.size == 1)
      return days.head
    reverseJoinDaysUsingRecursion(days.tail) + ", " + days.head
  }

}
