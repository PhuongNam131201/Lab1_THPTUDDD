fun main() {
    println("Nhập vào một chuỗi: ")
    val input = readLine()

    if (input != null) {
        // Duyệt qua từng ký tự trong chuỗi
        for (char in input) {
            println(char) // In ra từng ký tự
        }
    } else {
        println("Không có chuỗi nào được nhập.")
    }
}
