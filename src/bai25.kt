import kotlin.random.Random
fun main(){
    println("Random mang sinh so ngau nhien!!")
    var size : Int
    while(true){
        println("Nhap gia tri mang (Nhap so nguyen)")
        val input = readLine()
        size = input?.toIntOrNull() ?: 0
        if (size >0){
            break
        }
        else{
            println("Vui long nhap gia tri phu hop")
        }
    }
    val mang =IntArray(size){ Random.nextInt() }
    println("Gia tri cua mang la: ${mang.joinToString(" ")}")
}