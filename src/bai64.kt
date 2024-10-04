// Lớp Person
open class Person64(val name: String, val age: Int) {
    fun printInfo() {
        println("Tên: $name, Tuổi: $age")
    }
}

// Lớp Student kế thừa từ lớp Person
class Student(name: String, age: Int, val studentId: String) : Person64(name, age) {
    // Phương thức study()
    fun study() {
        println("$name đang học.")
    }

    // Phương thức in thông tin của học sinh
    fun printStudentInfo() {
        printInfo() // Gọi phương thức từ lớp cha
        println("Mã sinh viên: $studentId")
    }
}

fun main() {
    // Tạo đối tượng của lớp Student
    val student = Student("Nguyễn Văn A", 20, "SV001")

    // In ra thông tin của học sinh
    student.printStudentInfo()

    // Gọi phương thức study()
    student.study()
}
