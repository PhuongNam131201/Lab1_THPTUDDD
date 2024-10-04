fun main() {
    println("Nhập một ký tự: ")
    val e: Char = readLine()!![0]  // Lấy ký tự đầu tiên từ chuỗi nhập vào

    if (e != null) {
        // Kiểm tra ký tự
        when {
            e.isUpperCase() -> println("$e là ký tự hoa.")
            e.isLowerCase() -> println("$e là ký tự thường.")
            else -> println("$e không phải là chữ cái.")
        }
    } else {
        println("Không có ký tự nào được nhập.")
    }
}
