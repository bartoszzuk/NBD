package exercises

class Exercise2 {

  def run(): Unit = {
    println("Exercise 2")
    val emptyBankAccount = new BankAccount()

    println(s"Empty account starting balance: ${emptyBankAccount.balance}")
    emptyBankAccount.deposit(100)
    println(s"Empty account deposit 100 balance: ${emptyBankAccount.balance}")
    emptyBankAccount.withdraw(50)
    println(s"Empty account withdraw 50 balance: ${emptyBankAccount.balance}")

    val fullBankAccount = new BankAccount(1000)
    println(s"Full account starting balance: ${fullBankAccount.balance}\n")
  }

}


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

