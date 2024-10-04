open class Person66(val name: String, val age: Int) {
    open fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

class Student66(name: String, age: Int, val studentId: String) : Person66(name, age) {
    override fun displayInfo() {
        super.displayInfo() // Gọi phương thức từ lớp cha
        println("Student ID: $studentId")
    }
}
fun main() {
    val person = Person66("Phương Nam", 30)
    person.displayInfo()

    val student = Student66("Văn A", 20, "S12345")
    student.displayInfo()
}
