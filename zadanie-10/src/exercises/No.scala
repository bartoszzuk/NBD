package exercises

class No extends Maybe[Nothing] {

  override def applyFunction[R](function: Function[Nothing, R]): Maybe[R] = this

  override def getOrElse[R >: Nothing](other: R): R = other

  override def map[R](function: Function[Nothing, R]): Maybe[R] = this

  override def flatMap[R](function: Function[Nothing, Maybe[R]]): Maybe[R] = this

  override def toString: String = f"No(value = $None)"
}
