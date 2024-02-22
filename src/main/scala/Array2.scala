object Array2 {
  def main(arg: Array[String]): Unit={
    val arr=Array(1,2,3,4,5)
    var sum:Int=0
    for(i<- 0 until arr.length){
      sum=sum+arr(i)
    }
    println("Sum of the element of array = "+sum)
  }

}
