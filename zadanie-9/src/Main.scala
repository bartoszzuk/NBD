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

  def testExercises2(yes: Yes[Int], no: No): Unit = {
    println("Exercises 2")
    println(s"Class No is subtype of Maybe: ${no.isInstanceOf[Maybe[_]]}")
    println(s"Class Yes is subtype of Maybe: ${yes.isInstanceOf[Maybe[_]]}")
    println()
  }

  def testExercises3(yes: Yes[Int], no: No): Unit = {
    println("Exercises 3")
    println(s"Class No applyFunction result: ${no.applyFunction(_ => 12)}")
    println(s"Class Yes applyFunction result: ${yes.applyFunction(value => value + 12)}")
    println()
  }

  def testExercises4(yes: Yes[Int], no: No): Unit = {
    println("Exercises 4")
    println(s"Class No getOrElse result: ${no.getOrElse(20.3)}")
    println(s"Class Yes getOrElse result: ${yes.getOrElse(20.3)}")
    println()
  }

}
