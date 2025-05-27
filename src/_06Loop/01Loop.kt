fun main(){
    /*
    * While Loop
    * Syntax: while(condition){}
    */
    var i:Int=0;
    while (i<5){
        print(i)
        print(" ")
        i++;
    }
    println()

    /*
    * Do while loop
    * do{
    * // Code
    * }while(condition)
    */
    i=0;
    do {
        print(i)
        print(" ")
        i++
    }while (i<5)
    println()

    /*
    * For Loop
    * Syntax for(i in 1..10)
    * Syntax for(i in 10..0)
    */
    for (i in 1..10){
        print("$i ")
    }
    println()
    for (i in 10 downTo 1){
        print("$i ")
    }
    println()
    // Print All Even Number between 0 - 100
    for (i in 0..100 step 2){
        print("$i ")
    }
    println()
    var games:Array<String> = arrayOf("Cricket","Football","Table Tennis")
    for(game in games){
        print("$game ")
    }
}