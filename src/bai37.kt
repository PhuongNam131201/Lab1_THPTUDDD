fun main() {
    println("Nhập vào một chuỗi: ")
    val input = readLine()

    if (input != null) {
        // Đảo ngược chuỗi
        val daongc = input.reversed()

        // So sánh chuỗi gốc với chuỗi đảo ngược
        if (input.equals(daongc, ignoreCase = true)) {
            println("Chuỗi \"$input\" là chuỗi đối xứng (palindrome).")
        } else {
            println("Chuỗi \"$input\" không phải là chuỗi đối xứng (palindrome).")
        }
    } else {
        println("Không có chuỗi nào được nhập.")
    }
}
