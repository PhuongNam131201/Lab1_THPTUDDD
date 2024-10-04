// Giao diện Playable
interface Playable {
    fun play()
}

// Lớp Game triển khai giao diện Playable
class Game : Playable {
    override fun play() {
        println("Chơi game!")
    }
}

fun main() {
    // Tạo đối tượng của lớp Game
    val game = Game()

    // Gọi phương thức play()
    game.play()
}
