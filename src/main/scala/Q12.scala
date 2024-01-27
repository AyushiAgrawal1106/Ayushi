object Q12 {
 def main (arg: Array[String]): Unit={
   var count:Int=0
   var a:Int=24
   var b:Int=120
   for (i<- a to b){
     if(a%2==0){
       count=count+1
     }
   }
   println("Number of even values between "+a+" and "+b+" is "+ count)
 }
}
