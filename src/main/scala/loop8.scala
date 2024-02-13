object loop8 {
  def main(arg: Array[String]): Unit={
    var a:Int=15
    var i:Int=1
    while(i<=a){
      if(a%i==0){
        println(i)
      }
      i=i+1
    }
  }

}
