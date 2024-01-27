object Q4 {
  def main(arg: Array[String]): Unit ={
    val a:Int = 104
    if (a>100 && a<1000){
      if(a%2==0){
        val b:Int=a%3
        print(b)
      }
      else{
        val b:Int=a%2
        print(b)
      }
    }
    else{
      print("wrong number.Please insert within 100 and 1000")
    }
  }

}
