def question2() = {
  print("Enter an integer: ")
  val n = scala.io.StdIn.readInt()
  n match {
    case x if x % 3 == 0 && x % 5 == 0 => println("Multiple of Both Three and Five")
    case x if x % 3 == 0 => println("Multiple of Three")
    case x if x % 5 == 0 => println("Multiple of Five")
    case _ => println("Not a Multiple of Three or Five")
  }
}