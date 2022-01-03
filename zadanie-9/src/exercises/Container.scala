package exercises

class Container[A](private val content: A) {

  def getContent: A = {
    this.content
  }

  def applyFunction[R](function: Function[A, R]): R = {
    function.apply(this.content)
  }
}
