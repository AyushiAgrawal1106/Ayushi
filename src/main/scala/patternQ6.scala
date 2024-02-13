object patternQ6 {
  def main (arg: Array[String]): Unit={
    for (i<- 1 to 10){
      if(i%2==1){
        for(j<- 1 to i){
          print("*")
        }
        println()
      }
    }
    for (i<-8 to 1 by -1){
      if(i%2==1){
        for(j<- 1 to i){
          print("*")
        }
        println()
      }
    }
  }

}
