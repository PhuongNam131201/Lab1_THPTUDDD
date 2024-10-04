fun main() {
    var rows: Int=3
    var cols =3
    // Nhập số hàng và số cột của ma trận

    // Khai báo ma trận
    val matrix = Array(rows){IntArray(cols) }

    // Nhập dữ liệu cho ma trận
    for (i in 0 until rows){
        for (j in 0 until  cols){
            while (true){
                println("Nhap gia tri mang : tai vi tri $i , $j")
                val a = readLine()
                if(a !=null && a.toIntOrNull()!=null){
                    matrix[i][j] =a.toInt()
                    break
                }
                else{
                    println("vui long nhap so: ")
                }
            }
        }
    }

    // Tính tổng các phần tử

    val suma = matrix.flatMap { it.asIterable() }.sum()
    // In tổng các phần tử
    println("Tổng các phần tử của ma trận là: $suma")
}
