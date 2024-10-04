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

    // Sắp xếp danh sách theo thứ tự giảm dần
    val sortedList = numberList.sortedDescending()
    val sola = numberList.sorted()
    println("Danh sách sau khi sắp xếp theo thứ tự giảm dần: $sortedList")
    println("Danh sách sau khi sắp xếp theo thứ tự tăng dần: ${sola.joinToString()}")
}
