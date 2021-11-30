package exercises

class Exercise5 {

  def run(products: Map[String, Double]): Unit = {
    println("Exercise 5")

    println("\nBefore discount:")
    showProductsMap(products)

    println("\nAfter discount:")
    showProductsMap(discountProducts(products, discount = 0.1))
    println()
  }


  def showProductsMap(products: Map[String, Double]): Unit = {
    products.foreach{case(product, price) => println(s"$product: $price")}
  }

  def discountProducts(products: Map[String, Double], discount: Double): Map[String, Double] = {
    products.mapValues(price => price * (1 - discount))
  }

}
