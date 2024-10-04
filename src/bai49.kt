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

    // Khai báo hai ma trận
    val matrixA = Array(n) { DoubleArray(n) }
    val matrixB = Array(n) { DoubleArray(n) }
    val resultMatrix = Array(n) { DoubleArray(n) }

    // Nhập dữ liệu cho ma trận A
    println("Nhập dữ liệu cho ma trận A:")
    for (i in 0 until n) {
        for (j in 0 until n) {
            while (true) {
                println("Nhập giá trị tại vị trí A[$i][$j]: ")
                val a = readLine()
                if (a != null && a.toDoubleOrNull() != null) {
                    matrixA[i][j] = a.toDouble()
                    break
                } else {
                    println("Vui lòng nhập số!")
                }
            }
        }
    }

    // Nhập dữ liệu cho ma trận B
    println("Nhập dữ liệu cho ma trận B:")
    for (i in 0 until n) {
        for (j in 0 until n) {
            while (true) {
                println("Nhập giá trị tại vị trí B[$i][$j]: ")
                val b = readLine()
                if (b != null && b.toDoubleOrNull() != null) {
                    matrixB[i][j] = b.toDouble()
                    break
                } else {
                    println("Vui lòng nhập số!")
                }
            }
        }
    }

    // Nhân hai ma trận
    for (i in 0 until n) {
        for (j in 0 until n) {
            resultMatrix[i][j] = 0.0 // Khởi tạo phần tử kết quả
            for (k in 0 until n) {
                resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j]
            }
        }
    }

    // In kết quả
    println("Kết quả của phép nhân hai ma trận là:")
    for (i in 0 until n) {
        for (j in 0 until n) {
            print("${resultMatrix[i][j]} ")
        }
        println()
    }
}
