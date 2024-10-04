fun main() {
    println("Nhập vào một chuỗi: ")
    val input = readLine() ?: ""

    var a = 0
    var b = 0

    val vowels = "aeiouAEIOU"

    for (char in input) {
        if (char.isLetter()) {
            if (char in vowels) {
                a++
            } else {
                b++
            }
        }
    }

    println("Số ký tự nguyên âm: $a")
    println("Số ký tự phụ âm: $b")
}
