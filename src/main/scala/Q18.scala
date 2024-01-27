object Q18 {
  def main (arg: Array[String]): Unit={
    var count:Int=0
    var sum:Int=0
    var average:Float=0f
    for (i<- 24 to 100){
      if(i%2==0){
        sum=sum+i
        count=count+1
      }
    }
    average=sum/count
    print("Average of even number between 24 and 100 is "+ average)
  }
}
