import java.time.LocalDate
import java.util.Random

fun main() {
    val hientai = LocalDate.now()
    val muoi = hientai.minusYears(10)

    // Tạo một đối tượng Random
    val random = Random()

    // Sinh ra một số ngẫu nhiên giữa 0 và số ngày trong 10 năm
    val daysBetween = hientai.toEpochDay() - muoi.toEpochDay()
    val randomDays = random.nextInt(daysBetween.toInt() )+1

    // Tính toán ngày ngẫu nhiên
    val randomDate = muoi.plusDays(randomDays.toLong())

    println("Ngày ngẫu nhiên trong 10 năm qua: $randomDate")
}
