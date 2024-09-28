fun main() {
    // Khai báo các biến
    println("Nhập giá trị Double:")
    val a: Double = readLine()!!.toDouble()

    println("Nhập giá trị Boolean (true/false):")
    val b: Boolean = readLine()!!.toBoolean()

    println("Nhập giá trị Int:")
    val c: Int = readLine()!!.toInt()

    println("Nhập giá trị String:")
    val d: String = readLine()?:""

    println("Nhập giá trị Char:")
    val e: Char = readLine()!![0] // Lấy ký tự đầu tiên

    println("Giá trị Double: $a")
    println("Giá trị Boolean: $b")
    println("Giá trị Int: $c")
    println("Giá trị String: $d")
    println("Giá trị Char: $e")
}
