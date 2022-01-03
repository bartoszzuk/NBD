package exercises

class Yes[A](val value: A) extends Maybe[A] {

  def applyFunction[R](function: Function[A, R]): Yes[R] = {
    new Yes(function.apply(value))
  }

  def getOrElse[R](other: R): A = {
    value
  }

  override def toString: String = {
    s"Yes(value = $value)>"
  }

}
