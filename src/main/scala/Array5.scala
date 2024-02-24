object Array5 {
  def main(arg: Array[String]): Unit={
    val arr=Array(1,2,3,4,5,6,7)
    val arr1=Array(1,2,3,4,5,6,7)
    val size:Int=arr.length+arr1.length
    var arr2:Array[Int]= arr ++ arr1
    for (i<- 0 until arr2.length){
      println(arr2(i))
    }

  }

}
