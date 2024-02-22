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
//      var num:Int=561
//      var rem:Int=0
//      var rev:Int=0
//      var num1:Int=num
//      while(num!=0){
//        rem=num%10
//        rev=rev*10+rem
//        num=num/10
//      }
//      if(num1==rev){
//        println("this is a palindrome")
//      }
//      else{
//        println("Not a palindrome")
//      }
//var num:Int=561
//      var rem:Int=0
//      var rev:Int=0
//      var num1:Int=num
//      var sum:Int=0
//      while(num!=0){
//        rem=num%10
//        rev=rev*10+rem
//        sum=sum+rem
//        num=num/10
//      }
//      println(sum)
//      if(num1==rev){
//        println("this is a palindrome")
//      }
//      else{
//        println("Not a palindrome")
//      }
//  val arr=Array(10,40,60,70,30,90,150)
//      val target:Int=100
//      for(i<-0 until arr.length){
//        for(j<-i+1 until arr.length){
//          if(arr(i)+arr(j)==target){
//            println(arr(i),arr(j))
//          }
//        }
//      }
//      val a:String="Mango is so sweet"
//      val size:Int=a.length()
//      var arr=new Array[Char](size)
//      for(i<-0 until a.length()){
//        arr(i)=a.charAt(i)
//      }
//      for(i<-a.length()-1 to 0 by -1) {
//        print(a(i))
//      }
//      val a:String="Apple"
//      var b:String=" "
//
//
//      for(i<-a.length()-1 to 0 by -1) {
//               b=b+a(i)
//             }
//    println(b)
//      if(a==b){
//        println("It is a palindrome")
//      }
//      else{
//        println("Not a palindrome")
//      }
      val a:String="Mango"
      for(i<-0 until a.length){
        if(i%2!=0){
          println(a(i))
        }
      }



    }




}
