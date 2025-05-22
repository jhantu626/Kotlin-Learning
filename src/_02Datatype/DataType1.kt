
/*
* In Kotlin there are Several Datatypes are there
*   1. Number
*      1. Integer
*       i. Byte(8bit)
*       ii. Short(16bit)
*       iii. Int(32bit)
*       ii. Long(64bit)
*      2. Floating point
*       i. Float(32bit)
*       ii. Double(64bit)
*    ** 1 byte == 8 bit
*   2. Character
*     1. Char
*       -- var char: Char='A'
*   3. Boolean
*       var bool:Boolean=true/false
*   4. String
*       var name:String="Pritam Bala"
*   5.Array
*/
fun main() {
    var byte:Byte=127;
    var short: Short=32684;
    var int: Int=short.toInt();
    var long: Long=78548465
    var float:Float=65.25f;
    var double: Double=84756.575
    var char: Char='#'
    var boolean: Boolean=true;
    var name:String="Pritam Bala"
    var array: Array<String> = arrayOf("Pritam Bala")
    println(array[0])

    // Type conversion of variables
    /*
    * in kotlin every datatype has functions convertToFunction
    */
    // int to float
    var num: Int=10
    var num2: Float=num.toFloat();
}