fun main(){
    println("Nhap a (gia tri kieu Int): ")
    val a = readLine()!!.toInt()
    println("Nhap b (gia tri kieu Double): ")
    val b = readLine()!!.toDouble()
    println("Nhap c (gia tri kieu Float): ")
    val c = readLine()!!.toFloat()

    val a1 = a!!.toDouble()
    println("Ket qua a+b: ${a1+b}")
    println("Ket qua a+b+c: ${a1+b+c}")
    println("Ket qua a*b/c: ${a1*b/c}")

}