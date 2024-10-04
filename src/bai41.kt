fun main() {

    val b=IntArray(5){0}
    for(i in b.indices){
        while (true){
            println("Nhap so nguyen thu ${i+1}:")
            val input=readLine()
            if(input !=null && input.toIntOrNull() != null){
                b[i] = input.toInt()
                break
            }
            else   {
                println("Vui long nhap so nguyen hop le")
            }
        }
    }
    println("Cac so trong mang la: ${b.joinToString()}")
}
