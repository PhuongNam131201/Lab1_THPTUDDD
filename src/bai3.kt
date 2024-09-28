fun main() {
    println("Nhập a: ")
    val a = readLine()!!.toInt()
    println("Nhập b: ")
    val b = readLine()!!.toInt()

    // Thực hiện các phép toán
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = if (b != 0) a / b else "Không thể chia cho 0!"

    // In ra kết quả
    println("Phép cộng: $a + $b = $sum")
    println("Phép trừ: $a - $b = $difference")
    println("Phép nhân: $a * $b = $product")
    println("Phép chia: $a / $b = $quotient")
}

