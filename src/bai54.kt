fun main() {
    // Khai báo MutableList chứa 5 số nguyên
    val numberList = mutableListOf(1, 2, 3, 4, 5)

    // In danh sách ban đầu
    println("Danh sách ban đầu: $numberList")

    // Nhập phần tử cần thêm vào danh sách
    print("Nhập phần tử cần thêm vào danh sách: ")
    val newElement = readLine()?.toIntOrNull()

    // Kiểm tra và thêm phần tử vào danh sách
    if (newElement != null) {
        numberList.add(newElement)
        // In danh sách mới
        println("Danh sách sau khi thêm phần tử: $numberList")
    } else {
        println("Phần tử nhập không hợp lệ.")
    }
}
