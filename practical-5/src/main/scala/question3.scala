def question3() = {
  println("========== Question 3 ==========");
  println(fibSequence(10));
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