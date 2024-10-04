fun List<Int>.sumOfElements(): Int {
    var sum = 0
    for (element in this) {
        sum += element
    }
    return sum
}
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val total = numbers.sumOfElements()
    println("Tổng các phần tử: $total")
}
