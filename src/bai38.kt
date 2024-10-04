fun main() {
    println("Nhập vào một chuỗi: ")
    val input = readLine() ?: ""

    var chu = ""
    var so = ""

    for (char in input) {
        if (char.isDigit()) {
            so += char
        } else if (char.isLetter()) {
            chu += char
        }
    }

    println("Chuỗi chứa chữ: $chu")
    println("Chuỗi chứa số: $so")
}
