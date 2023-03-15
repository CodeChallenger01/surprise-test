//Square a list of integer and display the count of even and odd value in the list
class ListMethod{
  def squareListElement(myList: Array[Int], len:Int): Unit= {
    if (len<=0) println(myList+ " ")
    else {
      print(myList(len-5)*myList(len-5)+ " ")
      squareListElement(myList,len-1)
    }
  }
//  def countEvenElement(myList: Array[Int], len: Int): Unit = {
//    if(myList(len-1))
//  }
}
object SurpriseTestGroupC extends App{
  val myArray: Array[Int]=Array(1,2,3,4)
  val obj: ListMethod = new ListMethod
  obj.squareListElement(myArray, myArray.length)
//
//  obj.countEvenElement()
//  obj.countOddElement()
}