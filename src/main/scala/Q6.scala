object Q6 {
  def main (arg: Array[String]): Unit ={
    val a:Int = 30
    val b:Int = 3
    println("Provide the operation need to perform of number")
    val c:Char = scala.io.StdIn.readChar()
    if (c == '+'){
      print(a+b)
    }
    else if (c == '-'){
      print(a-b)
    }
    else if (c == '*'){
      print(a*b)
    }
    else {
      print(a/b)
    }
  }
}
