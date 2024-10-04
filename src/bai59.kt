fun main() {
    // Khai báo hai danh sách
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()

    // Nhập dữ liệu cho danh sách 1
    println("Nhập số lượng phần tử cho danh sách 1: ")
    val count1 = readLine()?.toIntOrNull() ?: 0
    for (i in 1..count1) {
        print("Nhập phần tử thứ $i cho danh sách 1: ")
        val element = readLine()?.toIntOrNull()
        if (element != null) {
            list1.add(element)
        }
    }

    // Nhập dữ liệu cho danh sách 2
    println("Nhập số lượng phần tử cho danh sách 2: ")
    val count2 = readLine()?.toIntOrNull() ?: 0
    for (i in 1..count2) {
        print("Nhập phần tử thứ $i cho danh sách 2: ")
        val element = readLine()?.toIntOrNull()
        if (element != null) {
            list2.add(element)
        }
    }

    // Ghép hai danh sách lại với nhau
    val mergedList = list1 + list2

    // In danh sách mới
    println("Danh sách mới sau khi ghép: $mergedList")
}
