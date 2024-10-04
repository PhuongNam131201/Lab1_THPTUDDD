open class Person67(val name: String, val age: Int) {
    open fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}
fun Person67.isAdult(): Boolean {
    return this.age >= 18
}
fun main() {
    val person1 = Person67("John Doe", 30)
    val person2 = Person67("Jane Doe", 17)

    person1.displayInfo()
    println("${person1.name} is adult: ${person1.isAdult()}")

    person2.displayInfo()
    println("${person2.name} is adult: ${person2.isAdult()}")
}

