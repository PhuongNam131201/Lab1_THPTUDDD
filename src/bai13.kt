fun main() {
    println("Nhập cân nặng (kg): ")
    val weight = readLine()!!.toDouble() // Nhập cân nặng

    println("Nhập chiều cao (m): ")
    val height = readLine()!!.toDouble() // Nhập chiều cao

    // Tính chỉ số BMI
    val bmi = weight / (height * height)

    // In ra chỉ số BMI
    println("Chỉ số BMI của bạn là: %.2f".format(bmi))

    // Kiểm tra tình trạng cơ thể
    when {
        bmi < 18.5 -> println("Tình trạng cơ thể: Thiếu cân.")
        bmi in 18.5..24.9 -> println("Tình trạng cơ thể: Bình thường.")
        bmi in 25.0..29.9 -> println("Tình trạng cơ thể: Thừa cân.")
        bmi in 12.0 ..15.0 ->  println("Tình trạng cơ thể: Thừa cân.")
        else -> println("Tình trạng cơ thể: Béo phì.")
    }
}
