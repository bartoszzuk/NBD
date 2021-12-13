package exercises

class Exercise4 {

  def run(number: Int): Unit = {
    val square = (number: Int) => number * number
    println(s"Applied square function on number $number, three times: ${applyThreeTimes(number, square)}")
  }

  def applyThreeTimes(number: Int, function: Function[Int, Int]): Int = {
    function(function(function(number)))
  }

}
