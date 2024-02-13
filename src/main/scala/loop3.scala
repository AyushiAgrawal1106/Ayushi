object loop3 {
  def main(arg: Array[String]): Unit = {
    var sum:Int=0
    for (i <- 1 to 50){
      sum=sum+i
    }
    print(sum)
  }

}
