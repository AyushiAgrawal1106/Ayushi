object Loop10 {
  def main(arg: Array[String]): Unit={
    var q:Int = 63
    var i:Int = 1
    var r:Int = 0
    while(i<=q){
      if(q%i==0){
        r=r+1
      }
      i=i+1
    }
    if(r==2) {
      print("This is a prime number : "+q)
    }
    else{
      print("This is not a prime number : "+q)
    }
  }

}
