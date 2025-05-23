/*
* In kotlin there has if,else,else if and when(switch) for kotlin
*
*/
fun main(){
    var age: Int=19
    // If - Else
    if (age>=18){
        println("You are eligible")
    }else{
        println("You are not eligible")
    }

    // If - Else if
    if (age>18){
        println("Adult")
    }else if (age>15){
        println("Semi Adult")
    }else{
        println("Children")
    }

}