open class Person69(open val name: String) {
    open fun displayInfo() {
        println("Name: $name")
    }
}
class Employee69(name: String, val salary: Double) : Person69(name) {
    override val name: String = "Employee: $name"

    override fun displayInfo() {
        super.displayInfo()
        println("Salary: $salary")
    }
}
fun main() {
    val employee = Employee69("John Doe", 50000.0)
    employee.displayInfo()
}
