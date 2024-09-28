fun main() {
    while (true) {
        println("Nhập a: ")
        val input = readLine()

        try {
            val a = input?.toDouble()

            if (a != null && a in 10.0..20.0) {
                println("Giá trị nằm trong khoảng từ 10 đến 20")
                break
            } else {
                println("Giá trị không nằm trong khoảng từ 10 đến 20")
            }
        } catch (e: NumberFormatException) {
            println("Giá trị không hợp lệ. Vui lòng nhập lại một số.")
        }
    }
}
