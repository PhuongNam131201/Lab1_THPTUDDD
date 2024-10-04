fun main() {
    var size: Int

    // Nhập kích thước mảng
    while (true) {
        println("Nhập số lượng số nguyên (phải lớn hơn 0):")
        val input = readLine()
        size = input?.toIntOrNull() ?: 0
        if (size > 0) break
        println("Vui lòng nhập một số nguyên dương và lớn hơn 0.")
    }

    val numbers = IntArray(size)

    // Nhập dữ liệu cho mảng
    for (i in numbers.indices) {
        while (true) {
            println("Nhập số nguyên thứ ${i + 1}:")
            val input = readLine()
            if (input != null && input.toIntOrNull() != null) {
                numbers[i] = input.toInt()
                break
            } else {
                println("Vui lòng nhập một số nguyên hợp lệ.")
            }
        }
    }
    // Tính tổng các phần tử trong mảng
    val sum = numbers.sum()
    println("Tổng các phần tử trong mảng là: $sum")
}
