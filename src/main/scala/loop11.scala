object loop11 {
  def main(arg: Array[String]): Unit={
    var arr=Array(10,20,30,40,40,50,60,70)
    for (i<- arr.length-1 to 0 by -1){
      println(arr(i))
    }
   // print(arr.length)
  }

}
