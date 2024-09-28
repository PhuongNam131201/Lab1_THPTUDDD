import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    val a = LocalDate.now() // Lấy ngày hiện tại
    val b = DateTimeFormatter.ofPattern("dd/MM/yyyy") // Định dạng ngày

    val c = a.format(b) // Định dạng ngày theo mẫu
    println("Ngày hiện tại là: $c") // In ra ngày đã định dạng
    println("Ngày hiện tại là: $a")
   // In ra ngày đã định dạng
}
