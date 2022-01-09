package exercises

trait Maybe[+A] {

  def applyFunction[R](function: Function[A, R]): Maybe[R]

  def getOrElse[R >: A](other: R): R

  def map[R](function: Function[A, R]): Maybe[R]

  def flatMap[R](function: Function[A, Maybe[R]]): Maybe[R]

}

