object Q5 {
  def main (arg: Array[String]): Unit ={
    val a:Int = 90
    if (a>0 && a<100){
      if (a>90 &&a<=100)
        {
          print("Super smart")
      }
      else if (a>80 &&a<=90)
      {
        print("Smart")
      }
      else if (a>70 &&a<=80)
      {
        print("Smart enough")
      }
      else if (a>60 &&a<=70)
      {
        print("Just smart")
      }
      else if (a>35 &&a<=60)
      {
        print("No smart")
      }
      else{
        print("dump")
      }
    }
    else{
      print("wrong number.Please insert within 0 and 100")
    }
  }
}
