package exercises

trait Maybe[+A] {

  def applyFunction[R](function: Function[A, R]): Maybe[R]

  def getOrElse[R >: A](other: R): R

}

