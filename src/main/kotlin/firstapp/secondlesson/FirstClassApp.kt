package firstapp.secondlesson

class Player(private var firstname: String) {
    fun getFirstname():String{
        return firstname
    }
}

fun main() {
    val player1=Player("Timur")

    val player2=Player("Maxim")

    val players= arrayOf(player1, player2)
    players.forEach { player -> println("playername: ${player.getFirstname()}") }
}
