var books = Set[Book]();

def question2() = {
  println("========== Question 2 ==========");
  addBook("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
  addBook("1984", "George Orwell", "978-0-452-28423-4");
  addBook("Pride and Prejudice", "Jane Austen", "978-0-19-953556-9");
  
  displayLibrary();
  println();

  searchByTitle("Pride and Prejudice");
  searchByTitle("Learn Scala");
  println();

  searchByAuthor("Jane Austen");
  println();

  println("is isbn 978-0-452-28423-4 in library: " + hasBook("978-0-452-28423-4"));
  println("is isbn 978-0-452-00000-4 in library: " + hasBook("978-0-452-00000-4"));
  println();

  removeBook("978-0-452-28423-4");
  removeBook("978-0-452-00000-4");
  println();

  displayLibrary();
}

case class Book(title: String, author: String, isbn: String);

def addBook(title: String, author: String, isbn: String): Unit = {
  books += Book(title, author, isbn);
}

def displayLibrary(): Unit = {
  println("Books in library:")
  books.foreach(b => 
    println("Title: " + b.title + ", Author: " + b.author + ", ISBN: " + b.isbn)
  );
}

def searchByTitle(title: String): Unit = {
  val book = books.find(book => (book.title == title));
  if book.isDefined then
    val b = book.get;
    println("Book '" + title + "' found")
    println("Title: " + b.title + ", Author: " + b.author + ", ISBN: " + b.isbn)
  else
    println("Book '" + title + "' not found")
}

def searchByAuthor(author: String): Unit = {
  val booksOfAuthor = books.filter(book => (book.author == author));
  println("Books of author: " + author);
  booksOfAuthor.foreach(b => 
    println("Title: " + b.title + ", Author: " + b.author + ", ISBN: " + b.isbn)
  );
}

def hasBook(isbn: String): Boolean = {
  books.exists(book => (book.isbn == isbn));
}

def removeBook(isbn: String): Unit = {
  val book = books.find(book => (book.isbn == isbn));
  if book.isDefined then
    println("ISBN " + isbn + " found. removing...")
    books -= book.get;
  else
    println("ISBN " + isbn + " not found");
}