interface Driveable {
    fun drive()
}

interface Flyable {
    fun fly()
}
class FlyingCar : Driveable, Flyable {
    override fun drive() {
        println("The flying car is driving on the road.")
    }

    override fun fly() {
        println("The flying car is flying in the sky.")
    }
}
fun main() {
    val myFlyingCar = FlyingCar()

    myFlyingCar.drive() // Gọi phương thức drive()
    myFlyingCar.fly()   // Gọi phương thức fly()
}
