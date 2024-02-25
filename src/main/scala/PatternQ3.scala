object PatternQ3 {
  def main(arg: Array[String]): Unit={
    for (i<- 5 to 1 by -1){
      for (j<- 1 to i){
        print("*")
      }
      println()
    }
  }

}
