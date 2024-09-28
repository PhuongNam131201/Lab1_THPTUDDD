fun main() {
    println("Nhập một năm: ")
    val year = readLine()!!.toInt() // Nhập năm từ bàn phím

    // Kiểm tra năm nhuận
    val isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

    if (isLeapYear) {
        println("$year là năm nhuận.")
    } else {
        println("$year không phải là năm nhuận.")
    }
}
