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