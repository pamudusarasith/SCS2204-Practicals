def question1() = {
    print("Enter the deposit amount: ")
    val num = scala.io.StdIn.readInt()
    println("Interest: " + calculateInterest(num))
}

def calculateInterest(deposit: Double): Double = deposit match {
  case x if x < 20000.00 => deposit * 0.02
  case x if x < 200000.00 => deposit * 0.04
  case x if x < 2000000.00 => deposit * 0.035
  case _ => deposit * 0.065
}