fun main() {
    // Nhập giá trị kiểu Double từ bàn phím
    println("Nhập giá trị Double:")
    val doubleValue: Double = readLine()!!.toDouble()
    println("Giá trị ban đầu (Double): $doubleValue")

    // Ép kiểu từ Double sang Int
    val intValue: Int = doubleValue.toInt()
    println("Giá trị sau khi ép kiểu (Int): $intValue")
}
