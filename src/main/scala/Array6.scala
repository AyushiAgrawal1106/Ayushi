object Array6 {
  def main(arg: Array[String]): Unit={
    val arr=Array(1,2,3,4,5,6,7,8,9)
    var sum:Int=0
    for(i<- 0 until arr.length){
      sum=sum+arr(i)
    }
    var avg:Float=sum/arr.length
    print("Average of the elements of the array = "+ avg)
  }

}
