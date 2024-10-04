fun main() {
    println("Nhập vào một chuỗi: ")
    val input = readLine() ?: ""

    val result = StringBuilder()

    for (char in input) {
        if (char.isUpperCase()) {
            result.append(char.lowercaseChar())
        } else if (char.isLowerCase()) {
            result.append(char.uppercaseChar())
        } else {
            result.append(char) // Giữ nguyên ký tự không phải chữ cái
        }
    }

    println("Chuỗi sau khi chuyển đổi: $result")
}
