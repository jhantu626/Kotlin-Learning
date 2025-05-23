fun main(){
    // To take input from user will use readLine and readln
    var name: String
    var age: Int=0
    print("Enter Your Name: ")
    name= readln().toString();
    print("Hi $name, Enter Your Age: ")
    var isAgeValid:Boolean=false;
    while (!isAgeValid){
        try {
            age= readln().toInt();
            isAgeValid=true;
        }catch (error:Exception) {
            print("Enter a valid age please: ")
            isAgeValid=false
        }
    }


}