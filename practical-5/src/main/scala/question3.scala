def question3() = {
  println("========== Question 3 ==========");
  print("Enter n: ");
  val n = scala.io.StdIn.readInt();
  println(fibSequence(n));
}

def fib(n: Int): Int = n match {
  case 0 => 0
  case 1 => 1
  case _ if n > 0 => fib(n-1) + fib(n-2)
}

def fibSequence(n: Int): String = n match {
  case 0 => fib(0) + " ";
  case _ if n > 0 => fibSequence(n-1) + fib(n) + " ";
}