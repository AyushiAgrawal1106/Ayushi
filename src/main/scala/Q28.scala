object Q28 {
  def main (arg: Array[String]): Unit={
    for (i<- 1 to 25){
      if(i%2==1){
        if(i%5==0){
          println("divisible by 5")
        }
        else{
          println(i)
        }
      }
    }
  }

}
