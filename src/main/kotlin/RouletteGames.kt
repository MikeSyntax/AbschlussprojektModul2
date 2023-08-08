class RouletteGames(tableNumber: Int): Casino(tableNumber){


    fun playerNumber(player: CasinoPlayer){                                           //Diese Funktion lässt den Spieler auf eine random Zahl setzen
        var numbersOne = (0..36).random()
        var amount = (0..50).random()
        print("Spieler ${player.name} hat $amount € auf die $numbersOne gesetzt,")
        BetNumber("Nummer $numbersOne", 36, numbersOne)
        player.cash = player.cash - amount
        println(" somit verbleiben noch ${player.cash} € zum spielen")
    }

    fun playerRedOrBlack(player: CasinoPlayer) {                                      //Diese Funktion lässt den Spieler random auf rot oder schwarz setzen
        var numbersRedOrBlack = (1..2).random()
        if (numbersRedOrBlack == 1) {
            println("Spieler ${player.name} hat auf rot gesetzt")
        } else if (numbersRedOrBlack == 2) {
            println("Spieler ${player.name} hat auf schwarz gesetzt")
        } else {
            println("Falsche Eingabe")
        }
    }

    fun playerEvenOrNotEven(player: CasinoPlayer) {                                      //Diese Funktion lässt den Spieler random auf gerade oder ungerade setzen
        var numbersEvenOrNotEven = (1..2).random()
        if (numbersEvenOrNotEven == 1) {
            println("Spieler ${player.name} hat auf gerade gesetzt")
        } else if (numbersEvenOrNotEven == 2) {
            println("Spieler ${player.name} hat auf ungerade gesetzt")
        } else {
            println("Falsche Eingabe")
        }
    }

    fun playerThird(player: CasinoPlayer) {                                      //Diese Funktion lässt den Spieler random auf das 1.,2. oder 3.Drittel setzen
        var numbersThird = (1..3).random()
        if (numbersThird == 1) {
            println("Spieler ${player.name} hat auf das 1.Drittel gesetzt")
        } else if (numbersThird == 2) {
            println("Spieler ${player.name} hat auf das 2.Drittel gesetzt")
        } else if  (numbersThird == 3) {
            println("Spieler ${player.name} hat auf das 3.Drittel gesetzt")
        } else {
            println("Falsche Eingabe")
        }
    }

    fun playerFirstOrSecondHalf(player: CasinoPlayer) {                                      //Diese Funktion lässt den Spieler random auf die 1. oder 2. Hälfte setzen
        var numbersFirstOrSecondHalf = (1..2).random()
        if (numbersFirstOrSecondHalf == 1) {
            println("Spieler ${player.name} hat auf die 1.Hälfte gesetzt")
        } else if (numbersFirstOrSecondHalf == 2) {
            println("Spieler ${player.name} hat auf die 2. Hälfte gesetzt")
        } else {
            println("Falsche Eingabe")
        }
    }

    fun games(player: CasinoPlayer){
            println("Willkommen ${player.name} am Roulette Tisch 1")
            println("Du kannst zwischen folgenden Spielen am Roulette wählen")
            println("1 = Auf Zahl setzen\n2 = auf Gerade/Ungerade setzen\n3 = auf Rot oder Schwarz setzen\n4 = auf 1.,2.oder 3.Drittel setzen\n5 = auf 1. oder 2. Hälfte setzen")
            println("Triff bitte jetzt deine Auswahl")
            var choice = readln().toInt()
            when (choice){
                 1 -> {playerNumber(player)                             //Auf Zahlen setzen
                 }
                 2 -> {playerRedOrBlack(player)                         //Auf Rot oder Schwarz setzen
                 }
                 3 -> {playerEvenOrNotEven(player)                      //Auf Gerade oder Ungerade setzten
                 }
                 4 -> {playerThird(player)                              //Auf 1.2.oder 3.Drittel setzen
                 }
                 5 -> {playerFirstOrSecondHalf(player)                  //Auf 1. oder 2. Hälfte setzen
                 }
            }
        }
    }