def question2() = {
    print("Enter a number: ")
    val num = scala.io.StdIn.readInt()
    num match {
        case x if x <= 0 => println("Negative/Zero")
        case x if x % 2 == 0 => println("Even")
        case _ => println("Odd")
    }
}