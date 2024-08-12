def question1() = {
  println("*** Caesar Cipher ***")
  println("\t1. Encrypt")
  println("\t2. Decrypt")
  print("Select an option: ")
  val option = scala.io.StdIn.readInt()
  if (option != 1 && option != 2) {
    println("Invalid option")
  } else if (option == 1) {
    println("Enter text to encrypt:")
    val text = scala.io.StdIn.readLine()
    println("Enter shift value:")
    val shift = scala.io.StdIn.readInt()
    println(s"Encrypted text: ${caesarEncrypt(text, shift)}")
  } else {
    println("Enter text to decrypt:")
    val text = scala.io.StdIn.readLine()
    println("Enter shift value:")
    val shift = scala.io.StdIn.readInt()
    println(s"Decrypted text: ${caesarDecrypt(text, shift)}")
  }
}

def caesarEncrypt(text: String, shift: Int): String = {
  if (shift < 0 || shift >= 26) {
    throw new Exception("Shift value must be between 0 and 25")
  }
  text.map { char =>
    val base = if (char.isUpper) 'A' else 'a'
    if (char.isUpper || char.isLower) {
      (base + ((char - base) + shift) % 26).toChar
    } else {
      char
    }
  }
}

def caesarDecrypt(text: String, shift: Int): String = {
  if (shift < 0 || shift >= 26) {
    throw new Exception("Shift value must be between 0 and 25")
  }
  text.map { char =>
    val base = if (char.isUpper) 'A' else 'a'
    if (char.isUpper || char.isLower) {
      (base + ((char - base) - shift + 26) % 26).toChar
    } else {
      char
    }
  }
}