package exercises

class No extends Maybe[Nothing] {

  override def applyFunction[R](function: Function[Nothing, R]): Maybe[R] = this

  override def getOrElse[R >: Nothing](other: R): R = other

}
