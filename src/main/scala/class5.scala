object class5 {
    def main (arg: Array[String]): Unit={
//      println("enter the size")
//      val size=scala.io.StdIn.readInt()
//
//      val arr=new Array[Int](size)
//
//      println("enter the element")
//      for(i<- 0 until size ){
//        arr(i)=scala.io.StdIn.readInt()
//      }
//
//      println("enter the element")
//      for(i<- 0 until size ){
//        if(i%2==0) {
//          println(arr(i))
//        }
//      }
      var num:Int=561
      var rem:Int=0
      var rev:Int=0
      var num1:Int=num
      while(num!=0){
        rem=num%10
        rev=rev*10+rem
        num=num/10
      }
      if(num1==rev){
        println("this is a palindrome")
      }
      else{
        println("Not a palindrome")
      }

    }




}
