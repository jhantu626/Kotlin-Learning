package _01Variables


/*
*  There are two ways to declear variable in kotlin
*   1. using var keyword which stores mutable values
*   2. using val keyword which is immutable(can't be change)
*
*  Syntax:
*   var name
*   val name="Pritam Bala";
*   var age=21;
*   -- with datatype --
*   val number: String
*   var name: String="value"
*
*   ** By Default don't need to provide the datatype of any variable
*       in kotlin it is automatically inference the type of the value
*/
fun main(){
    // Using var
    var name="Pritam Bala";
    var age=22;
    age=++age
    var fatherName:String="Parimal Bala"
    println("Hello "+name)
    println("Your age is ${age} and your father is ${fatherName}")


    // using Val
    val PI: Double=3.14
    println("The value of pi is $PI")


}