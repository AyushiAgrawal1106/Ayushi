object String7 {
  def main(arg: Array[String]): Unit={
    val arr=Array('a','e','i','o','u')
    val b:String="Mango"
    var count:Int=0
    for(i<- 0 until b.length){
      for(j<- 0 until arr.length){
        if(b(i)==arr(j)){
          count=count+1
        }
      }
    }
    print(count)
  }

}
