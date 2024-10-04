fun main() {
    var rows:Int
    var cols:Int
    // Nhập số hàng và số cột của ma trận
    while(true){
        println("Nhap gia tri cot: ")
        val  input=readLine()
        cols = input?.toIntOrNull() ?: 0
        if (cols>0) break
        else{
            println("Vui long nhap gia tri hop le: ")
        }
    }
    while(true){
        println("Nhap gia tri hang: ")
        val  input=readLine()
        rows = input?.toIntOrNull() ?: 0
        if (rows>0) break
        else{
            println("Vui long nhap gia tri hop le: ")
        }
    }
    // Khai báo ma trận
    val matrix = Array(rows){DoubleArray(cols) }

    // Nhập dữ liệu cho ma trận
    for (i in 0 until rows){
        for (j in 0 until  cols){
            while (true){
                println("Nhap gia tri mang : tai vi tri $i , $j")
                val a = readLine()
                if(a !=null && a.toDoubleOrNull()!=null){
                    matrix[i][j] =a.toDouble()
                    break
                }
                else{
                    println("vui long nhap so: ")
                }
            }
        }
    }
    println("Nhap dong can tinh tong: ")
    val dong = readLine()?.toIntOrNull()
    var sum =0
    for (i in 0 until cols){
        sum = (sum + matrix[dong!!][i]).toInt()
    }
    println("$sum")
}
