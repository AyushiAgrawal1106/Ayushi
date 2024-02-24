object Array9 {
  def main(arg: Array[String]): Unit={
    val arr=Array(35,76,87,27,89,27)
    var largest:Int=arr(0)
    var secondlargest:Int=arr(0)
    for(i<-0 until arr.length){
      if(largest<arr(i)){
        largest=arr(i)
      }
    }
    for(i<-0 until arr.length){
      if(secondlargest<arr(i) && arr(i)!=largest){
        secondlargest=arr(i)
      }
    }
    print(secondlargest)
  }

}
