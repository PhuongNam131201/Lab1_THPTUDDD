import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

fun main() {
    println("Nhập ngày theo định dạng yyyy-MM-dd:")
    val input = readLine()!!

    try {
        val ngaydinhdang = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        val date = LocalDate.parse(input, ngaydinhdang)
        println("Ngày hợp lệ: $date")
    } catch (e: DateTimeParseException) {
        println("Ngày không hợp lệ! Vui lòng nhập lại theo định dạng yyyy-MM-dd.")
    }
}
