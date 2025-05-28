fun main(){
    println("THe sum of two number is ${sum(10,20)}")
    println(square(10))
    println(sayHello())
}

fun sum(a:Int,b:Int):Int{
    return a+b;
}

fun square(a:Int):Long{
    return (a*a).toLong();
}

// Parameter with default value
fun sayHello(name:String="Hello, User"):String{
    return name;
}






