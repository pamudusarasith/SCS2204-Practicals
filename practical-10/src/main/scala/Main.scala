@main def main(): Unit =
  println("========== Question 1 ==========")

  var x = Rational(3, 4)

  println("x: " + x)
  println("x.neg: " + x.neg)

  println("\n\n========== Question 2 ==========")

  x = Rational(3, 4)
  var y = Rational(5, 8)
  var z = Rational(2, 7)

  println("x: " + x)
  println("y: " + y)
  println("z: " + z)
  println("x - y - z: " + x.sub(y).sub(z))

  println("\n\n========== Question 3 ==========")

  var acc1 = Account()
  acc1.deposit(1000)
  var acc2 = Account()
  acc2.deposit(5000)

  println("Before transfer:")
  println("Account 1 balance: " + acc1.getBalance)
  println("Account 2 balance: " + acc2.getBalance)

  acc1.transfer(250, acc2)

  println("\nAfter transfer: (transfer 250 from Account 1 to Account 2)")
  println("Account 1 balance: " + acc1.getBalance)
  println("Account 2 balance: " + acc2.getBalance)

  println("\n\n========== Question 4 ==========")

  acc1 = Account()
  acc1.deposit(1000)
  acc2 = Account()
  acc2.withdraw(100)
  val bank = Bank()
  bank.addAccount(acc1)
  bank.addAccount(acc2)

  println("Accounts: " + bank)
  println("\nNegative balance accounts: " + bank.negativeBalanceAccounts)
  println("Total balance: " + bank.totalBalance)
  println("Total balance with interest: " + bank.totalBalanceWithInterest)
  println("Accounts after interest: " + bank)

  println("\n\n========== Question 5 ==========")

  val strings = List("apple", "banana", "cherry", "date")
  println("Strings: " + strings)
  println("Total count of letter occurrences: " + countLetterOccurrences(strings))

def countLetterOccurrences(strings: List[String]): Int =
  strings.map(_.length).reduce(_ + _)