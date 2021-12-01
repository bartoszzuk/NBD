package exercises


class Exercise8 {

  def run(numbers: List[Int]): Unit = {
    println("Exercise 8")
    println(s"Before: $numbers")
    println(s"After: ${removeZerosRecursively(numbers)}\n")
  }
  
  def removeZerosRecursively(numbers: List[Int]): List[Int] = {
    if (numbers.isEmpty)
      return numbers
    if (numbers.head == 0)
      removeZerosRecursively(numbers.tail)
    else
      numbers.head :: removeZerosRecursively(numbers.tail)
  }

}
