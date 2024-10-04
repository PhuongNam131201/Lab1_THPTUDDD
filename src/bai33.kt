fun main() {
    println("Nhập chuỗi thứ nhất: ")
    val str1 = readLine() ?: ""
    println("Nhập chuỗi thứ hai: ")
    val str2 = readLine() ?: ""

    // Ghép chuỗi
    val result = str1 + str2

    // In ra kết quả
    println("Chuỗi kết quả: $result")
}
