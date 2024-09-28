fun main() {
    println("Nhap gia tri: ")
    val input = readLine()


    // In giá trị ban đầu
    try {
        var x=input!!.toDouble()
        println("Giá trị ban đầu của x: $x")

        // Sử dụng toán tử tiền tố
        println("Sử dụng toán tử tiền tố (++x): ${++x}")
        println("Giá trị của x sau khi sử dụng toán tử tiền tố: $x")

        // Sử dụng toán tử hậu tố
        println("Sử dụng toán tử hậu tố (x++): ${x++}")
        println("Giá trị của x sau khi sử dụng toán tử hậu tố: $x")

        println("Giá trị ban đầu của x: $x")

        // Sử dụng toán tử tiền tố
        println("Sử dụng toán tử tiền tố (++x): ${--x}")
        println("Giá trị của x sau khi sử dụng toán tử tiền tố: $x")

        // Sử dụng toán tử hậu tố
        println("Sử dụng toán tử hậu tố (x++): ${x--}")
        println("Giá trị của x sau khi sử dụng toán tử hậu tố: $x")
    }
    catch (e: NumberFormatException) {
        println("Vui nhap dung gia tri can nhap!!")
    }
}
