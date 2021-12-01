package exercises

class Exercise9 {

  def run(numbers: List[Int]): Unit = {
    println("Exercise 9")
    println(s"Before: $numbers")
    println(s"After: ${incrementNumbers(numbers)}\n")
  }

  def incrementNumbers(numbers: List[Int]): List[Int] = {
    numbers.map(number => number + 1)
  }

}
