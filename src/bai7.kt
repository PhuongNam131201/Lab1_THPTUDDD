fun main(){
    println("Nhap so: ")
    val a= readLine()
    while (true){
        if (a != null) {
            if (a.toIntOrNull()!=null){
                println("So vua nhap la kieu so nguyen $a")
                val b : Double=a.toDouble()
                println("So sau khi ep kieu Double $b")
                break
            }
            else if (a.toDoubleOrNull()!=null){
                println("So vua nhap la kieu so thuc $a")
                val number = a.toDouble()
                val b : Int=number.toInt()
                println("So sau khi ep kieu Int $b")
                break
            }
            else {
                println("Vui nhap so !! ")
                break
            }
        }

    }

}