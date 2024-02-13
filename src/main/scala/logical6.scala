object logical6 {
  def main (arg: Array[String]): Unit={
    println("enter the size")
    val size=scala.io.StdIn.readInt()

    val arr=new Array[Int](size)

    println("enter the element")
    for(i<- 0 until size ){
      arr(i)=scala.io.StdIn.readInt()
    }

    println("enter the element")
    for(i<- 0 until size ){
      if(i%2==0) {
        println(arr(i))
      }
    }

  }

}
