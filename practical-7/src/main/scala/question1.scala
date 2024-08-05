def question1() = {
  var numbers = scala.io.StdIn.readLine("Enter numbers separated by space: ")
                    .split(" ").map(_.toInt).toList;

  println(filterEvenNumbers(numbers));
}

def filterEvenNumbers(numbers: List[Int]): List[Int] = {
  numbers.filter(_ % 2 == 0);
}