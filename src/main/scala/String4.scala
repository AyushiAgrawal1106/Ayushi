object String4 {
  def main(arg: Array[String]): Unit={
    val a="Banana is sweet fruit"
    val b=a.split(" ")
    var len:Int=0
    for(i<- 0 until b.length){
      if(len<b(i).length){
        len=b(i).length
      }
    }
    print("Lrngth of longest word is "+len)
  }

}
