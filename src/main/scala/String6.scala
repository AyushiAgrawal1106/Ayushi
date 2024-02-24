object String6 {
  def main(arg: Array[String]): Unit={
    var a="naman"
    var b=""
    println(a)
    for(i<- 0 until a.length){
      b=b+a(i)
      println(b)
    }
   if(a==b){
     println("It is a palindrome")
   }
    else{
      println("Not a palindrome")
    }

  }

}
