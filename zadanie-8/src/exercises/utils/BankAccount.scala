package exercises.utils

class BankAccount(initialBalance: Int) {

  private var _balance: Int = initialBalance

  def balance: Int = _balance

  def this() = this(0)

  def withdraw(amount: Int): Int = {
    if (_balance - amount < 0)
      throw new IllegalArgumentException("Not enough funds")
    _balance -= amount
    amount
  }

  def deposit(amount: Int): Unit = {
    _balance += amount
  }

}

