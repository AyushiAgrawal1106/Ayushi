object Array4 {
  def main(arg: Array[String]): Unit={
    val arr=Array(12,23,45,95,56,67,78)
    var b=arr(0)
    for(i<-1 until arr.length){
      if(b<arr(i)){
        b=arr(i)
      }
    }
    println("greatest number is = "+ b)
  }

}
