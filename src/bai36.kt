fun main() {
    println("Nhập vào một chuỗi: ")
    val input = readLine()

    if (input != null) {
        // Đảo ngược chuỗi và in ra
        val daongc = input.reversed()
        println("Chuỗi đã đảo ngược: $daongc")
    } else {
        println("Không có chuỗi nào được nhập.")
    }
}
