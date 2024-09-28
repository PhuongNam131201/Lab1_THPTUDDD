fun main() {
    println("Nhập một số nguyên n: ")
    val n = readLine()?.toIntOrNull() ?: 0  // Nếu không nhập thì cho n = 0

    var sum = 0
    var i = 1

    do {
        sum += i
        i++
    } while (i <= n)

    println("Tổng các số từ 1 đến $n là: $sum")
}
