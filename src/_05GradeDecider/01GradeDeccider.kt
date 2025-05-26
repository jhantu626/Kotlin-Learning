fun main(){
    // If >90 so it will be Grade A++, >80 so Grade A,if less then 80 and greter than 60 so Grade B other wise grade C
    // if marks less then 40 then will be fail in exam
    print("Enter Your Marks: ")
    var marks:Int=0;
    var isMarkValid:Boolean=false;
    while (!isMarkValid){
        marks= readln().toInt();
        if (marks>100 && marks<0){
            print("Enter A Valid marks: ")
        }else{
            isMarkValid=true
        }
    }

    if (marks>90){
        println("Grade A++")
    }else if(marks>80){
        println("Grade A")
    }else if(marks>70){
        println("Grade B")
    }else if (marks>40){
        println("Grade C")
    }else{
        println("Fail")
    }

    var grade:String=if (marks>90){
        "Grade A"
    }else if (marks>80){
        "Grade B"
    }else if (marks>70){
        "Grade C"
    }else{
        "Fail"
    }

    println("The grade is $grade")

    var grade2:String=when{
        marks >= 90 -> "Grade A"
        marks >= 70 -> "Grade B"
        else -> "Grade C"
    }

}