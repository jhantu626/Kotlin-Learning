fun main(){
    val arr:IntArray = intArrayOf(2,7,11,15)
    var res:IntArray = twoSum(arr,9)
    for (i in res){
        print("$i ")
    }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var firstIndex:Int=0
    var secondIndex:Int=0
    for (i in 0 downTo nums.size){
        firstIndex=i;
        for (j in i+1 downTo nums.size){
            if (nums[i]+nums[j]==target){
                return intArrayOf(i,j)
            }
        }
    }
    return intArrayOf(firstIndex,secondIndex)
}