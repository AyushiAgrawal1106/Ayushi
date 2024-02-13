object PatternQ5 {
  def main (arg: Array[String]): Unit={
    for (i<- 1 to 10){
      if(i%2==1){
        for(j<-1 to i){
          if(j%2==1) {
            print("*")
          }
          else {
            print("_")
          }
        }
        println()
      }
    }
  }

}
