fun main() {

    while(true) {
        println("Nhập một số nguyên: ")
        val number = readLine()
        if (number !=null && number.toIntOrNull()!=null) {
            val a=number.toInt()
            if (a < 0) {
                println("Số  là số âm ")
                break
            } else if(a >0){
                println("Số là số dương")
                break
            } else {
                println("Là số không âm không dương (vì bằng 0)")
                break
            }
        }
        else {
            println("Vui long nhap so hop le!!")
        }
    }
    // Kiểm tra nếu số là âm hoặc 0

}
