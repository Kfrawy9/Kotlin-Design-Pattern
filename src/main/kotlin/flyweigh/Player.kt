package org.example.flyweigh

interface Player {
    var mission: String
    var weapon: String
    fun render()
}

class RedTeamPlayer( override var mission: String = "Capture the Flag",
                     override var weapon: String = "AK"): Player{

    override fun render() {
        println("Red Player with $weapon and mission $mission")
    }
}

class BlueTeamPlayer(override var mission: String = "Capture the Flag",
                     override var weapon: String = "M4"): Player{

    override fun render() {
        println("Blue Player with $weapon and mission $mission")
    }
}

class PlayerFactory(){

    companion object{
        private val players: MutableMap<String, Player> = hashMapOf()
        fun getPlayer(type: String): Player?{
            if (players.contains(type))
                return players[type]!!
           else{
                when(type){
                    "Blue" -> {
                        val player = BlueTeamPlayer()
                        players[type] = player
                        return player
                    }
                    "Red" -> {
                        val player = RedTeamPlayer()
                        players[type] = player
                        return player
                    }

                }
            }
            return null
        }
    }


}

fun main() {
    // here i reused the object in the memory instead creating a new one in the memory and can change its property
    val player = PlayerFactory.getPlayer("Blue")
    player?.weapon = "AK74"
    player?.mission = "capture hard point"
    val player2 = PlayerFactory.getPlayer("Red")
    player?.render()
    player2?.render()

}