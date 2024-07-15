def question1() = {
  println("========== Question 1 ==========");
  val products = getProductList();
  println("Product List: ");
  printProductList(products);
  println("Total products: " + getTotalProducts(products));
}

def getProductList(): List[String] = {
    print("Enter product name ('done' to stop): ");
    val input = scala.io.StdIn.readLine();
    input match {
        case "done" => Nil
        case "" => getProductList();
        case _ => input :: getProductList();
    }
}

def printProductList(products: List[String], i: Int = 1): Unit = products match {
  case Nil => ;
  case head :: tail => {
    println(i + "\t" + head);
    printProductList(tail, i + 1);
  }
}

def getTotalProducts(products: List[String]): Int = 
  products.length