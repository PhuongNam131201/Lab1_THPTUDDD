fun main() {
    // Khai báo danh sách chứa số nguyên
    val numberList = mutableListOf<Int>()

    // Nhập dữ liệu cho danh sách
    while (true) {
        println("Nhập số lượng phần tử (yêu cầu nhập số nguyên và lớn hơn 0): ")
        val input = readLine()
        val count = input?.toIntOrNull() ?: 0
        if (count > 0) {
            for (i in 1..count) {
                while (true) {
                    print("Nhập phần tử thứ $i: ")
                    val elementInput = readLine()
                    if (elementInput != null && elementInput.toIntOrNull() != null) {
                        numberList.add(elementInput.toInt())
                        break
                    } else {
                        println("Nhập không hợp lệ, yêu cầu nhập lại")
                    }
                }
            }
            break
        } else {
            println("Không hợp lệ!! yêu cầu nhập lại: ")
        }
    }

    // In danh sách ban đầu
    println("Danh sách ban đầu: $numberList")

    // Loại bỏ các phần tử trùng lặp
    val distinctList = numberList.distinct()

    // In danh sách sau khi loại bỏ trùng lặp
    println("Danh sách sau khi loại bỏ các phần tử trùng lặp: $distinctList")
}
