object logical8 {
  def main(args: Array[String]): Unit={
    val age:Int=63
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
