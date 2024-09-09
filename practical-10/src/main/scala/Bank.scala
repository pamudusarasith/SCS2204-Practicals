class Bank {
  private var accounts = List[Account]()
  
  def addAccount(acc: Account): Unit = {
    accounts = acc :: accounts
  }

  def negativeBalanceAccounts: List[Account] = {
    accounts.filter(_.getBalance < 0)
  }

  def totalBalance: Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterest(): Unit = {
    accounts.foreach((acc) => {
      if (acc.getBalance >= 0) {
        acc.deposit(acc.getBalance * 0.05)
      } else {
        acc.deposit(acc.getBalance * 0.10)
      }
    })
  }

  def totalBalanceWithInterest: Double = {
    applyInterest()
    accounts.map(_.getBalance).sum
  }

  override def toString: String = {
    accounts.toString()
  }
}