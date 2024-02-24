object Array10 {
  def main(arg: Array[String]): Unit={
    val arr=Array(5,2,7,8,9,5,3)
    val newarr=arr.sorted(Ordering[Int].reverse)
    for (i<- 0 until newarr.length){
      println(newarr(i))
    }
  }

}
