object Q16 {
  def main (arg: Array[String]): Unit={
    var a:Int=0
    for(i<-382 to 582) {
      if(i%2==0) {
        a = a + i
      }
    }
    println("sum of numbers between 382 to 582 is " + a)
  }
}
