object String1 {
  def main(arg: Array[String]): Unit={
    val a:String="Bigdata"
    var occ:Int=0
    for(i<-0 until a.length){
      if(a(i)=='a'){
        occ=occ+1
      }
    }
    print("a occured "+occ+" times")
  }

}
