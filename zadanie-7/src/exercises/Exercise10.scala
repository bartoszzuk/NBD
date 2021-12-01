package exercises

class Exercise10() {

  def run(numbers: List[Int]): Unit = {
    println("Exercise 10")
    println(s"Before: $numbers")
    println(s"After: ${toAbsoluteFromInterval(numbers, bottom = -5, top = 12)}")
  }

  def toAbsoluteFromInterval(numbers: List[Int], bottom: Int, top: Int) : List[Int] = {
      numbers.filter(number => number <= top)
        .filter(number => number >= bottom)
        .map(number => Math.abs(number))

  }
}
