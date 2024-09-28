fun main() {
    println("Nhập số ngày trong tuần (1-7): ")
    val a = readLine()!!.toInt() // Nhập số ngày

    // Sử dụng câu lệnh when để kiểm tra
    val b = when (a) {
        1 -> "Tháng Một"
        2 -> "Tháng hai"
        3 -> "Tháng ba"
        4 -> "Tháng tư"
        5 -> "Tháng năm"
        6 -> "Tháng sáu"
        7 -> "Tháng bảy"
        8 -> "Tháng tám"
        9 -> "Tháng chín"
        10 -> "Tháng mười"
        11 -> "Tháng mười một"
        12 -> "Tháng mười hai"

        else -> "Số không hợp lệ. Vui lòng nhập số từ 1 đến 12."
    }

    println(b) // In ra tên của ngày
}
