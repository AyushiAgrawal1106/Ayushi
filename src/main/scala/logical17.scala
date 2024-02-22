object logical17 {
  def main(arg: Array[String]): Unit={
    val age:Int=70
    if(age>60){
      println("Senior citizen discount")
    }
    else if (age<25){
      println("Student discount")
    }
    else{
      println("No discount")
    }
  }

}
