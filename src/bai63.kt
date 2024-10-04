// Khai báo lớp Person với constructor
class Person63(val name: String, val age: Int) {
    // Phương thức để in thông tin của người
    fun printInfo() {
        println("Tên: $name, Tuổi: $age")
    }
}

fun main() {
    // Tạo đối tượng của lớp Person với constructor
    val person1 = Person63("Nguyễn Văn A", 25)
    val person2 = Person63("Trần Thị B", 30)

    // In ra tên và tuổi của người
    person1.printInfo()
    person2.printInfo()
}
