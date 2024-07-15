var books = Set[Book]();

def question2() = {
  println("========== Question 2 ==========");
  addBook("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
  addBook("1984", "George Orwell", "978-0-452-28423-4");
  addBook("Pride and Prejudice", "Jane Austen", "978-0-19-953556-9");
  
  println(books);

  println("is isbn 978-0-452-28423-4 existing: " + hasBook("978-0-452-28423-4"));
  println("is isbn 978-0-452-00000-4 existing: " + hasBook("978-0-452-00000-4"));

  removeBook("978-0-452-28423-4");
  removeBook("978-0-452-00000-4");

  println(books);
}

case class Book(title: String, author: String, isbn: String);

def addBook(title: String, author: String, isbn: String): Unit = {
  books += Book(title, author, isbn);
}

def hasBook(isbn: String): Boolean = {
  books.exists(book => (book.isbn == isbn));
}

def removeBook(isbn: String): Unit = {
  val book = books.find(book => (book.isbn == isbn));
  books -= book.getOrElse(Book("", "", ""));
}