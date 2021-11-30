package exercises

class Exercise6 {

  def run(tuple: (Int, String, Boolean)): Unit = {
    println("Exercise 6")
    tuple.productIterator.foreach(element => println(element))
    println()
  }

}
