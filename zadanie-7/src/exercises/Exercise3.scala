package exercises

import scala.annotation.tailrec

class Exercise3 {

  def run(days: List[String]): Unit = {
    println("Exercise 3")
    println(s"a) ${joinDaysUsingRecursion(days)}\n")
  }

  def joinDaysUsingRecursion(days: List[String]): String = {

    @tailrec
    def joinDaysUsingTailRecursion(days: List[String], accumulator: String): String = {
      if (days.isEmpty)
        return accumulator.stripPrefix(", ")
      joinDaysUsingTailRecursion(days.tail, accumulator + ", " + days.head)
    }

    joinDaysUsingTailRecursion(days, "")
  }


}
