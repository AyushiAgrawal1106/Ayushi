object loop6 {
  def main(arg: Array[String]): Unit={
    var i:Int=1
    var a:Int=1
    while(i<6){
      if (a%3==0){
        println(a)
        i=i+1
      }
      a=a+1
    }
  }

}
