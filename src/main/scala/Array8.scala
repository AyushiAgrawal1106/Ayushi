object Array8 {
  def main(arg: Array[String]): Unit={
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val newArr = arr.filter(_ % 2 != 0)
    for(i<- 0 until newArr.length){
      println(newArr(i))
    }
  }

}
