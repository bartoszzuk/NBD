package exercises

class Yes[A](value: A) extends Maybe[A] {

  override def applyFunction[R](function: Function[A, R]): Maybe[R] = new Yes(function.apply(value))

  override def getOrElse[R >: A](other: R): R = value

}
