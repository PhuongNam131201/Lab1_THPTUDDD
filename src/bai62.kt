// Khai báo lớp Person
class Person62(val name: String, val age: Int) {
    // Phương thức để in thông tin của người
    fun printInfo() {
        println("Tên: $name, Tuổi: $age")
    }

    // Phương thức greet để in câu chào
    fun greet() {
        println("Chào bạn, $name!")
    }
}

fun main() {
    // Tạo đối tượng của lớp Person
    val person = Person62("Nguyễn Văn A", 25)

    // In ra tên và tuổi của người
    person.printInfo()

    // Gọi phương thức greet
    person.greet()
}
