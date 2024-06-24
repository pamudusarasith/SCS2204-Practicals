@main def main(): Unit = {
  println("==== Question 1 ====")
  question1()
  println("\n\n==== Question 2 ====")
  question2()
  println("\n\n==== Question 3 ====")
  question3()
  println("\n\n==== Question 4 ====")
  question4()
}

def question1(): Unit = {
  val k, i, j = 2
  val m, n = 5
  val f = 12.0f
  val g = 4.0f
  val c = 'X'

  println("k + 12 * m : " + (k + 12 * m))
  println("m / j : " + (m / j))
  println("n % j : " + (n % j))
  println("m / j * j : " + (m / j * j))
  println("f + 10*5 +g : " + (f + 10*5 +g))
  // println("++i * n : " + (++i * n)) // ++ operator is not available for Int
}

def question2(): Unit = {
  val (a, b, c, d) = (2, 3, 4, 5)
  val k = 4.3f
  val g = 4.0f
  // println("--b * a + c * d-- : " + (--b * a + c * d--)) // -- operator is not available for Int
  // println("a++ : " + (a++)) // ++ operator is not available for Int
  println ("-2 * ( g - k ) + c : " + (-2 * ( g - k ) + c))
  // println ("c=c++ : " + (c=c++)) // ++ operator is not available for Int
  // println ("c=++c*a++ : " + (c=++c*a++)) // ++ operator is not available for Int
}

def question3(): Unit = {
  val normal_hrs = 40.0
  val ot_hrs = 30.0
  val take_home_salary = getTakeHomeSalary(normal_hrs, ot_hrs)
  println("Take home salary: " + take_home_salary)
}

def normalSalary(normal_hrs: Double): Double = {
  val normal_rate = 250.0
  normal_hrs * normal_rate
}

def otSalary(ot_hrs: Double): Double = {
  val ot_rate = 85.0
  ot_hrs * ot_rate
}

def grossSalary(normal_hrs: Double, ot_hrs: Double): Double = {
  normalSalary(normal_hrs) + otSalary(ot_hrs)
}

def getTakeHomeSalary(normal_hrs: Double, ot_hrs: Double): Double = {
  val tax_rate = 0.12
  grossSalary(normal_hrs, ot_hrs) * (1 - tax_rate)
}

def question4(): Unit = {
  val prices = Seq(5, 10, 15, 20, 25, 30, 35)
  for (ticket_price <- prices) {
    println("Ticket price: " + ticket_price + ", Profit: " + profit(ticket_price))
  }
}

def attendees(ticket_price: Int) = {
  120 + ((15 - ticket_price) / 5) * 20
}

def cost(ticket_price: Int) = {
  500 + 3 * attendees(ticket_price)
}

def profit(ticket_price: Int) = {
  attendees(ticket_price) * ticket_price - cost(ticket_price)
}