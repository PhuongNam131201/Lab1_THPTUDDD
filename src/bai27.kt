fun main() {
    try {
        println("Nhập số a (số bị chia):")
        val a = readLine()!!.toDouble()  // Chuyển đổi sang số thực
        println("Nhập số b (số chia):")
        val b = readLine()!!.toDouble()  // Chuyển đổi sang số thực
        if (b==0.0){
            println("Vui lòng không nhập số 0 cho số chia!")
        }
        else{
            val c = a / b
            println("Kết quả a/b là: $c")
        }
    } catch (e: NumberFormatException) {
        println("Vui lòng nhập số hợp lệ!")
    } catch (e: ArithmeticException) {
        println("Vui lòng không nhập số 0 cho số chia!")
    } finally {
        println("Hoàn thành")
    }
}
