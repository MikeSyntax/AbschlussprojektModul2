class CasinoEntranceControl(tableNumber:Int = 1): Casino(tableNumber) {

    fun entranceControl(player: CasinoPlayer, players: MutableList<CasinoPlayer>){
        if (player.age >= 21){
            println("${FontColors.GREEN.type}${player.name} Einlass gewährt${FontColors.COLOREND.type}")
            players.add(player)
            Thread.sleep(1000)
        } else {
            println("${FontColors.RED.type}Tut uns leid, aber ${player.name} du bist zu jung und kommst nicht rein${FontColors.COLOREND.type}")
            Thread.sleep(1000)

        }
    }
}