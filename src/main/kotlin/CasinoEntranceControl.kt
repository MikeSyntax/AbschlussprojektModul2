class CasinoEntranceControl(tableNumber:Int = 1): Casino(tableNumber) {

    fun entranceControl(player: CasinoPlayer, players: MutableList<CasinoPlayer>){
        if (player.age >= 21){
            println("${player.name} Einlass gewährt")
            players.add(player)
            Thread.sleep(500)
        } else {
            println("Tut uns leid, aber ${player.name} du bist zu jung und kommst nicht rein")
            Thread.sleep(500)

        }
    }
}