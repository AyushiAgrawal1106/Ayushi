object logical11 {
  def main(arg: Array[String]): Unit={
    val a:Int=17
    var b:Int=0
    for (i<- 1 to a){
      if(a%i==0){
        b=b+1
        println(i)
      }
    }
    if(a%2!=0 && b==2){
      println("Number is prime and odd")
    }
  }

}
