import kotlin.math.sqrt

fun main() {
    println("Nhập hệ số a: ")
    val a = readLine()!!.toDouble()

    println("Nhập hệ số b: ")
    val b = readLine()!!.toDouble()

    println("Nhập hệ số c: ")
    val c = readLine()!!.toDouble()

    // Kiểm tra hệ số a
    if (a == 0.0) {
        // Phương trình trở thành bậc 1
        if (b != 0.0) {
            val x = -c / b
            println("Phương trình bậc 1 có nghiệm: x = $x")
        } else {
            // Trường hợp b cũng bằng 0
            if (c == 0.0) {
                println("Phương trình vô số nghiệm.")
            } else {
                println("Phương trình vô nghiệm.")
            }
        }
    } else {
        // Tính delta
        val delta = b * b - 4 * a * c

        // Giải phương trình bậc 2
        when {
            delta > 0 -> {
                val x1 = (-b + sqrt(delta)) / (2 * a)
                val x2 = (-b - sqrt(delta)) / (2 * a)
                println("Phương trình bậc 2 có hai nghiệm phân biệt: x1 = $x1, x2 = $x2")
            }
            delta == 0.0 -> {
                val x = -b / (2 * a)
                println("Phương trình bậc 2 có nghiệm kép: x = $x")
            }
            else -> {
                println("Phương trình bậc 2 vô nghiệm.")
            }
        }
    }
}
