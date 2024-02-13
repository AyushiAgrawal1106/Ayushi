object loop12 {
  def main(arg: Array[String]): Unit={
    var sum:Int=0
    for(i<- 1 to 20){
      if(i%2==0){
        sum=sum+i
      }
    }
    print(sum)
  }

}
