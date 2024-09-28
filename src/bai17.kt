fun main() {
    for (i in 2..9) { // Vòng lặp cho các số từ 1 đến 10
        for (j in 1..10) { // Vòng lặp cho các số nhân
            val result = i * j // Tính tích
            println("$i x $j = $result") // In ra kết quả
        }
        println() // In một dòng trống giữa các bảng
    }
}
