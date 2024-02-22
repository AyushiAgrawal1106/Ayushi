object logical27 {
  def main(arg: Array[String]): Unit={
    val a:Int=11
    var b:Int=0
    for (i<- 1 to a){
      if(a%i==0){
        b =b+1
      }
    }
    if(b==2 || b%2==0){
      println("Number is either prime or odd")
    }
  }

}
