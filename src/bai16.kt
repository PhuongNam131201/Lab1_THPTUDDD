fun main() {
    println("Nhập tháng (1-12): ")
    val month = readLine()?.toIntOrNull()

    println("Nhập năm: ")
    val year = readLine()?.toIntOrNull()

    if (month != null && year != null) {
       val c = when(month){
           1,3,5,7,8,10,12 -> 31
           3,6,9,11 ->30
           2 ->{
               if ((year %4==0 && year % 100 !=100)||(year %400 ==0))
               {
                   29
               }
               else{
                   28
               }
           }
           else -> {
               println("Vui long nhap thang trong khoang 1 den 12")
               return
           }
       }
        println("Tháng $month năm $year có $c ngày.")
    } else {
        println("Vui lòng nhập tháng và năm hợp lệ!")
    }
}
