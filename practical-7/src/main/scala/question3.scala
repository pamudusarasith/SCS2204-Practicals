def question3() = {
  var numbers = scala.io.StdIn.readLine("Enter numbers separated by space: ")
                    .split(" ").map(_.toInt).toList;

  println(filterPrime(numbers));
}

def filterPrime(numbers: List[Int]): List[Int] = {
  numbers
    .filter(n => n > 0)
    .filter(n => n == 2 || (n > 2 && (2 until n).forall(n % _ != 0)));
}