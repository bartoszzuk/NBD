package exercises

class Yes[A](value: A) extends Maybe[A] {

  override def applyFunction[R](function: Function[A, R]): Maybe[R] = new Yes(function.apply(value))

  override def getOrElse[R >: A](other: R): R = value

  override def map[R](function: Function[A, R]): Maybe[R] = new Yes(function.apply(value))

  override def flatMap[R](function: Function[A, Maybe[R]]): Maybe[R] = function.apply(value)

  override def toString: String = s"Yes(value = $value)"
}
