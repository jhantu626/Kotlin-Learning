fun main(){
    // WAP to take a input from user and count how many digit
    print ("Enter a number: ")
    var number: Int= readln().toInt();
    var num:Int=number;
    var count:Int=0;
    while (number>0){
        count++;
        number=number/10;
    }
    println("Number of digit has $count")

    // WAP to take number from user and reverse
    var problem2:Int=num;
    var res:String=""
    while (problem2>0){
        var r:Int=problem2%10;
        res+=r;
        problem2=problem2/10
    }
    println("The Reverse Number is ${res.toInt()}")

    // Is Prime Number
    var isPrimeNumber:Boolean=true;
    for (i in 2 until  num){
        if (num%i==0){
            isPrimeNumber=false;
            break;
        }
    }
    var primeResult=if (isPrimeNumber){
        "$num is a Prime Number"
    }else{
        "$num is not a Prime Number"
    }
    println(primeResult)

    // WAP to find the sum of cube of each digit of a number
    var cubeNum:Int=num
    var squereResult:Int=0
    while (cubeNum>0){
        var sqDigit:Int=cubeNum%10;
        squereResult+=sqDigit.times(sqDigit);
        cubeNum=cubeNum/10
    }
    println("The Square of all digit sum is $squereResult")
}