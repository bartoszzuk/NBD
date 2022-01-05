import exercises.{Container, Maybe, No, Yes}

object Main {

  def main(args: Array[String]): Unit = {
    val no = new No()
    val yes = new Yes(100)

    testExercises1()
    testExercises2(yes, no)
    testExercises3(yes, no)
    testExercises4(yes, no)
  }

  def testExercises1(): Unit = {
    val container = new Container[Int](2)
    println("Exercises 1")
    println(s"Value: ${container.getContent}")
    println(s"Apply Function: ${container.applyFunction(value => s"Result ${value * value}")}")
    println()
  }

  def testExercises2(maybe: Maybe[Int], other: Maybe[Nothing]): Unit = {
    println("Exercises 2")
    println(s"Class No is subtype of Maybe: ${other.isInstanceOf[Maybe[_]]}")
    println(s"Class Yes is subtype of Maybe: ${maybe.isInstanceOf[Maybe[_]]}")
    println()
  }

  def testExercises3(maybe: Maybe[Int], other: Maybe[Nothing]): Unit = {
    println("Exercises 3")
    println(s"Class No applyFunction result: ${other.applyFunction(_ => 12)}")
    println(s"Class Yes applyFunction result: ${maybe.applyFunction(value => value + 12)}")
    println()
  }

  def testExercises4(maybe: Maybe[Int], other: Maybe[Nothing]): Unit = {
    println("Exercises 4")
    println(s"Class No getOrElse result: ${other.getOrElse(20.3)}")
    println(s"Class Yes getOrElse result: ${maybe.getOrElse(20.3)}")
    println()
  }

}
