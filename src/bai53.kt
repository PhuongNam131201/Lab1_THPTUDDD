fun main() {
    // Khai báo danh sách chứa số nguyên
    var a: Int

    // Nhập dữ liệu cho danh sách
    while (true) {
        println("Nhập số lượng phần tử: (yêu cầu nhập số nguyên và lớn hơn 0)")
        val input = readLine()
        a = input?.toIntOrNull() ?: 0
        if (a > 0) break
        else println("Không hợp lệ!! yêu cầu nhập lại: ")
    }

    val numberList = mutableListOf<Int>()
    for (i in 1..a) {
        while (true) {
            print("Nhập phần tử thứ $i: ")
            val input = readLine()
            if (input != null && input.toIntOrNull() != null) {
                numberList.add(input.toInt())
                break
            } else {
                println("Nhập không hợp lệ, yêu cầu nhập lại")
            }
        }
    }

    // Nhập số cần kiểm tra
    print("Nhập số cần kiểm tra: ")
    val numberToCheck = readLine()?.toIntOrNull()

    // Kiểm tra số có tồn tại trong danh sách hay không
    if (numberToCheck != null) {
        if (numberList.contains(numberToCheck)) {
            println("Số $numberToCheck có trong danh sách.")
        } else {
            println("Số $numberToCheck không có trong danh sách.")
        }
    } else {
        println("Số nhập không hợp lệ.")
    }
}
