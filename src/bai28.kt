import kotlin.random.Random

fun main(){
    println("Sinh so ngau nhien: ")
    var sum=0
    while (true){
            val n = Random.nextInt(100)+1
            if (n%2==0){
                println(n)
                sum+=1
            }
            if (sum ==5){
                break
            }

    }

}