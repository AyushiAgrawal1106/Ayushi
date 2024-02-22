object logical15 {
  def main(arg: Array[String]): Unit={
    val age:Int=15
    if(age<13){
      println("Child")
    }
    else if(age>=13 || age<19){
      println("Teenager")
    }
    else{
      println("Adult")
    }
  }

}
