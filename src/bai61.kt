// Khai báo lớp Person
class Person(val name: String, val age: Int) {
    // Phương thức để in thông tin của người
    fun printInfo() {
        println("Tên: $name, Tuổi: $age")
    }
}

fun main() {
    // Tạo đối tượng của lớp Person
    val person = Person("Nguyễn Văn A", 25)

    // In ra tên và tuổi của người
    person.printInfo()
}
