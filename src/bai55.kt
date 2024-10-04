fun main() {
    // Khai báo danh sách chứa số nguyên
    var a: Int

    // Nhập dữ liệu cho danh sách
    while (true) {
        println("Nhập số lượng phần tử (yêu cầu nhập số nguyên và lớn hơn 0): ")
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

    // In danh sách ban đầu
    println("Danh sách ban đầu: $numberList")

    // Kiểm tra xem danh sách có đủ phần tử để xóa không
    if (numberList.size > 2) {
        // Xóa phần tử tại vị trí thứ 2 (chỉ số 1)
        numberList.removeAt(1)
        // In danh sách sau khi xóa
        println("Danh sách sau khi xóa phần tử tại vị trí thứ 2: $numberList")
    } else {
        println("Danh sách không đủ phần tử để xóa phần tử tại vị trí thứ 2.")
    }
}
