@main def main(): Unit = {
  println("==== Question 1 ====")
  println("Reverse of 'hello, world': " + reverseString("hello, world"))

  println("\n==== Question 2 ====")
  val strings = List("hello", "world!", "scala", "programming")
  println("Original strings: " + strings)
  println("Strings with length > 5: " + longerThan5(strings))
  
  println("\n==== Question 3 ====")
  println("Mean of 10 and 27: " + mean(10, 27))

  println("\n==== Question 4 ====")
  val nums = List(1, 2, 3, 4, 5, 6, 7)
  println("Original numbers: " + nums)
  println("Sum of even numbers: " + evenSum(nums))
}

def reverseString(s: String): String = s match {
  case "" => ""
  case _ => reverseString(s.tail) + s.head
}

def longerThan5(strings: List[String]): List[String] = strings match {
  case Nil => Nil
  case head :: tail =>
    if head.length > 5 then 
      head :: longerThan5(tail)
    else 
      longerThan5(tail)
}

def mean(num1: Int, num2: Int): Float = {
  val m = (num1 + num2) / 2.0
  math.rint(m * 100).toFloat / 100f
}

def evenSum(nums: List[Int]): Int = nums match {
  case Nil => 0
  case head :: tail => 
    if head % 2 == 0 then
      head + evenSum(tail)
    else
      evenSum(tail)
}