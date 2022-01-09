import exercises.{Maybe, No, Yes}

object Main {

  def main(args: Array[String]): Unit = {
    testExercises1()
    testExercises2()
  }

  def dividersGenerator: Iterator[(Int, Int)] =
    for {
      divisor <- Iterator.from(1)
      divider <- Iterator.range(1, divisor + 1)
      if divisor % divider == 0
    } yield (divisor, divider)


  def testExercises1(): Unit = {
    println("Exercise 1")
    val generatorTake = dividersGenerator
    println(s"First 20 pairs of generator with take:")
    generatorTake take 20 foreach println

    val generatorNext = dividersGenerator
    println(s"First 20 pairs of generator with next")
    for (_ <- 0 until 20) println(generatorNext.next())
    println()
  }

  def unsureRead(id: Int): Maybe[String] =
    id match {
      case 1 => new Yes("Bob")
      case 2 => new Yes("Alice")
      case 3 => new Yes("Tom")
      case _ => new No()
    }


  def showcaseMaybe(id: Int): Unit = {
    println(s"Sure Id equals $id")
    val unsureId = new Yes(id)
    println(s"Unsure Id equals $unsureId")
    println(s"Map result: ${unsureRead(id).map(value => value.toUpperCase())}")
    println(s"FlatMap result (with unsureId): ${unsureId.flatMap(value => unsureRead(value)).map(value => value.toUpperCase())}")
    println()
  }

  def testExercises2(): Unit = {
    println("Exercises 2")
    showcaseMaybe(id=2)
    showcaseMaybe(id=4)
    println()
  }

}
