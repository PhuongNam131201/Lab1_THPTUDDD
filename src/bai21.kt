fun main(){
    println("Nhap so nguyen: ")

    try {
        val a=readLine()!!.toInt()
        println("So vua nhap la: $a")
    }
    catch (e: NumberFormatException) {
        println("So vua nhap khong hop le!!")
    }
}