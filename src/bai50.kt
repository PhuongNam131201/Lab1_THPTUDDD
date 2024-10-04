fun main() {
    // Nhập kích thước của mảng
    println("Nhập kích thước mảng: ")
    val size = readLine()?.toIntOrNull() ?: return

    // Khai báo mảng
    val array = IntArray(size)

    // Nhập dữ liệu cho mảng
    println("Nhập các phần tử của mảng:")
    for (i in 0 until size) {
        println("Nhập phần tử thứ ${i + 1}: ")
        array[i] = readLine()?.toIntOrNull() ?: 0
    }

    // Đảo ngược mảng
    for (i in 0 until size / 2) {
        val temp = array[i]
        array[i] = array[size - 1 - i]
        array[size - 1 - i] = temp
    }

    // In mảng đã đảo ngược
    println("Mảng đã đảo ngược:")
    for (element in array) {
        print("$element ")
    }
}
