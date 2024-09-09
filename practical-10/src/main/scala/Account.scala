class Account {
    private var balance: Double = 0
    def deposit(amount: Double): Unit =
        balance += amount
    def withdraw(amount: Double): Unit =
        balance -= amount
    def transfer(amount: Double, to: Account): Unit =
        this.withdraw(amount)
        to.deposit(amount)
    def getBalance: Double =
        balance
        
    override def toString(): String = s"Account balance: $balance"
}