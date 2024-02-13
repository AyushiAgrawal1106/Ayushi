object loop2 {
  def main(arg: Array[String]): Unit={
    var i:Int=1
    while(i<11){
      if(i%2==0){
        println(i)
      }
      i=i+1
    }
  }

}
