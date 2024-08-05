def question2() = {
  var numbers = scala.io.StdIn.readLine("Enter numbers separated by space: ")
                    .split(" ").map(_.toInt).toList;

  println(calculateSquare(numbers));
}

def calculateSquare(numbers: List[Int]): List[Int] = {
  numbers.map(x => x * x).toList;
}