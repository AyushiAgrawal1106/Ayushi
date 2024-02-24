object Array7 {
  def main(arg: Array[String]): Unit={
    val arr=Array[String]("xyz","bcd","efg","hij")
    val a:String="xyz"
    for(i<- 0 until arr.length){
      if(arr(i)==a){
        println("String is present in Array")
      }
    }
  }

}
