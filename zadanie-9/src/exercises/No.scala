package exercises

class No extends Maybe[Nothing] {

  def applyFunction[R](function: Function[Nothing, R]): No = {
    new No()
  }

  def getOrElse[R](other: R): R = {
    other
  }

  override def toString: String = {
    "No(value = <Empty>)"
  }

}
