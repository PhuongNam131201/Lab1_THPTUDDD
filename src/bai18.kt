fun main() {
    var total = 0

    while (true) {
        println("Nhập một số (nhập -1 để dừng): ")
        val input = readLine()?.toIntOrNull()

        if (input == null) {
            println("Vui lòng nhập một số hợp lệ!")
            continue
        }

        if (input == -1) {
            break  // Dừng vòng lặp khi nhập -1
        }

        total += input  // Cộng dồn vào tổng
    }

    println("Tổng các số đã nhập là: $total")
}
