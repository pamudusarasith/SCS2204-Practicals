@main def main(): Unit =
  println("========= Question 1 =========");
  question1();

  println("\n\n========= Question 2 =========");
  question2();
  
  println("\n\n========= Question 3 =========");
  question3();

// ====================== question 1 ======================

val items: Array[String] = Array("Apple", "Banana", "Orange", "Grapes", "Guava")
val quantities: Array[Int] = Array(10, 20, 30, 40, 50)

def question1(): Unit = {
  println("==== Before restocking ====\n")
  displayInventory();
  println();

  restockItem("Orange", 4);
  restockItem("Pears", 10);

  println("\n==== After restocking ====\n");
  displayInventory();
  println();

  sellItem("Banana", 8);
  sellItem("Apple", 30);
  sellItem("Pears", 20);

  println("\n==== After selling ====\n");
  displayInventory();
}

def printItems(items: Array[String], quantity: Array[Int]): Unit = {
  items match {
    case Array() => ()
    case _ => {
      println(items.head + "\t" + quantity.head);
      printItems(items.tail, quantity.tail);
    }
  }
}

def displayInventory(): Unit = {
  println("Item\tQuantity");
  printItems(items, quantities);
}

def restockItem(item: String, quantity: Int): Unit = {
  val index = items.indexOf(item);
  if (index != -1) {
    quantities(index) += quantity;
    println(item + " has been restocked with " + quantity);
  } else {
    println(item + " not found in inventory");
  }
}

def sellItem(item: String, quantity: Int): Unit = {
  val index = items.indexOf(item);
  if (index != -1) {
    if (quantities(index) < quantity) {
      println("quantity is not enough to sell for item " + item);
    } else {
      quantities(index) -= quantity;
      println("sold " + quantity + " " + item);
    }
  } else {
    println(item + " not found in inventory");
  }
}

// ====================== question 2 ======================

def question2(): Unit = {
  print("Enter an integer: ");
  val num = scala.io.StdIn.readInt();

  num match {
    case 0 => println("Zero")
    case n if n < 0 => println("Negative")
    case _ => println("Positive")
  }

  num match {
    case n if n % 2 == 0 => println("Even")
    case _ => println("Odd")
  }
}

// ====================== question 3 ======================

def question3(): Unit = {
  println(toUpper("PaMuDu"));
  println(toLower("PaMuDu"));
  println(formatNames("Benny")(toUpper));
  println(formatNames("Saman")(toLower));
}

def toUpper(str: String): String = str match {
  case "" => ""
  case s => 
    if s.head >= 'a' & s.head <= 'z' then
      (s.head - 32).toChar +: toUpper(s.tail)
    else
      s.head +: toUpper(s.tail)
}

def toLower(str: String): String = str match {
  case "" => ""
  case s => 
    if s.head >= 'A' & s.head <= 'Z' then
      (s.head + 32).toChar +: toLower(s.tail)
    else
      s.head +: toLower(s.tail)
}

def formatNames(name: String)(f: (String) => String): String = {
  f(name)
}