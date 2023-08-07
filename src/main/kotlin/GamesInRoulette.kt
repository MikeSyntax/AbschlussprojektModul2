open class GamesInRoulette(tableNumber: Int) {
    var goPlay = !false
    fun games(player: Player, numbers: Numbers){
        while (goPlay) {
            println("Willkommen ${player.name} am Roulette Tisch 1")
            println("Du kannst zwischen folgenden Spielen am Roulette wählen")
            println("1 = Auf Zahl setzen\n2 = auf gerade/ungerade setzen\n3 = auf rot oder schwarz setzen\n4 = auf 1./2.oder 3. Drittel setzen\n5 = auf 1. oder 2. Hälfte setzen")
            println("Triff bitte jetzt deine Auswahl")
            var choice = readln().toInt()
            when (choice){
                 1 -> {playerNumber(player)
                 }
                /* 2 -> {geradeUngeradeSetzen()
                 }
                 3 -> {rotSchwarzSezten()
                 }
                 4 -> {drittelSetzen()
                 }
                 5 -> {haelfteSetzen()
                 }*/
            }
        }
    }




}