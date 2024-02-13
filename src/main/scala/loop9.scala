object loop9 {
  def main(arg: Array[String]): Unit= {
    var a: String = "Ayushi"
    for (i <- (a.length-1)  to 0 by -1) {
      println(a(i))
    }
  }

}
