fun main() {
    var n: Int

    // Nhập kích thước của ma trận
    while (true) {
        println("Nhập kích thước n của ma trận vuông (n x n): ")
        val input = readLine()
        n = input?.toIntOrNull() ?: 0
        if (n > 0) break
        else {
            println("Vui lòng nhập giá trị hợp lệ!")
        }
    }

    // Khai báo ma trận
    val matrix = Array(n) { DoubleArray(n) }

    // Nhập dữ liệu cho ma trận
    for (i in 0 until n) {
        for (j in 0 until n) {
            while (true) {
                println("Nhập giá trị tại vị trí [$i][$j]: ")
                val a = readLine()
                if (a != null && a.toDoubleOrNull() != null) {
                    matrix[i][j] = a.toDouble()
                    break
                } else {
                    println("Vui lòng nhập số!")
                }
            }
        }
    }

    // Tính tổng các phần tử trên đường chéo chính
    var sum = 0.0
    for (i in 0 until n) {
        sum += matrix[i][i]
    }

    println("Tổng các phần tử trên đường chéo chính là: $sum")
}
