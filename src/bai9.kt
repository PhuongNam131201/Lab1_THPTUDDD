fun main(){

    while(true){
        println("Nhap gia tri so nguyen: ")
        val n = readLine()
        if (n != null && n.toIntOrNull() != null){
            var sum=0
            val num = n.toInt()
            for(i in 1 ..num){
                 sum = sum +i
            }
            println("tong gia tri la $sum")
            break
        }
        else println("Vui long nhap so hop le")

    }

}