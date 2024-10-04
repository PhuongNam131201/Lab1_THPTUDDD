fun main() {
    // Khai báo danh sách chứa số nguyên
    var a:Int
    // Nhập dữ liệu cho danh sách
    while(true) {
        println("Nhập số lượng phần tử:(yêu cầu nhập số nguyên và lớn hơn 0) ")
        val input = readLine()
        a = input?.toIntOrNull() ?: 0
        if (a>0) break
        else println("Không hợp lệ!! yêu cầu nhâp lại: ")
    }
    val numberList = mutableListOf<Int>()
    for(i in 1 .. a) {
        while (true){
            print("Nhập phần tử thứ  $i: ")
            val input = readLine()
            if (input != null && input.toIntOrNull()!=null) {
                numberList.add(input.toInt())
                break
            }
            else{
                println("Nhập không hợp lệ, yêu cầu nhập lại")
            }
        }
    }
    // Tìm phần tử lớn nhất
    val maxElement = numberList.maxOrNull()

    // In kết quả
    if (maxElement != null) {
        println("Phần tử lớn nhất trong danh sách là: $maxElement")
    } else {
        println("Danh sách rỗng.")
    }
}
