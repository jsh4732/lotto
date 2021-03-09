import java.util.*

fun lotto() : Int{
    val random = Random()
    val number = random.nextInt(44)+1
    return number
}

fun lottoSet() : IntArray{
    val lottoNums = IntArray(7)
    var count =0
    while(count<7){
        val pick = lotto()
        var flag = 0
        for(k in lottoNums){
            if(k===pick){
                flag = 1
                break
            }
        }
        if(flag===0){
            lottoNums[count]=pick
            count++
        }

    }

    return lottoNums

}

fun main(){

    print("How many ? >>")
    val times = Scanner(System.`in`).nextInt()
    for(i in 0..(times-1)) {
        val lottoNums = lottoSet()
        print('A'+i)
        print(" "+Arrays.toString(lottoNums))
        println()
    }


}