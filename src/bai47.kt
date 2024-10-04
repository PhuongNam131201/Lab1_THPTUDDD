fun main() {
    var size: Int

    // Nhập kích thước mảng
    while (true) {
        println("Nhập số lượng phần tử (phải lớn hơn 0):")
        val input = readLine()
        size = input?.toIntOrNull() ?: 0
        if (size > 0) break
        println("Vui lòng nhập một số nguyên dương và lớn hơn 0.")
    }

    val numbers = IntArray(size)
    for (i in numbers.indices) {
        while (true){
            println("Nhap: ")
            val input = readLine()
            if (input !=null && input.toIntOrNull() != null) {
                numbers[i]= input.toInt()
                break
            }
            else   {
                println("nhap lai: ")
            }
        }
    }


    // Sắp xếp mảng theo thứ tự tăng dần
    numbers.sort()
    println("${numbers.joinToString()}")
}
