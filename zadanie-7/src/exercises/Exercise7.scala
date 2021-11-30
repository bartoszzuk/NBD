package exercises

class Exercise7() {

  def run(products: Map[String, Double]): Unit = {
    println("Exercise 7")

    val existingValue = products.get("Lamp")
    val nonExistingValue = products.get("Laptop")

    println(s"""Key \"Lamp\" exists: ${existingValue.isDefined}""")
    println(s"""Key \"Laptop\" exists: ${nonExistingValue.isDefined}""")
    println(s"""Get default value: ${nonExistingValue.getOrElse(0.0)}\n""")
  }

}
