import kotlin.math.round

class RouletteHighroller(tableNumber: Int): RouletteGames(tableNumber) {

    override fun playerNumber(player: CasinoPlayer, rouletteTable: RouletteTable) {                   //Diese Funktion lässt den Spieler auf eine random Zahl einen random Betrag zwischen 10 und 50 euro setzen
        var number = (0..36).random()
        var amount = (1000..10000).random()
        player.yourNumber =
            number                                                          //Die Nummer wird in der Klasse des Spieler unter seinem Namen gespeichert
        player.yourAmount = amount
        rouletteTable.bankTable = rouletteTable.bankTable + amount
        print("Spieler ${player.name} hat $amount€ auf die $number gesetzt,")
        player.cash = player.cash - amount
        println(" somit verbleiben noch ${round(player.cash * 100) / 100}€ zum spielen")
    }

    override fun playerRedOrBlack(player: CasinoPlayer, rouletteTable: RouletteTable) {              //Diese Funktion lässt den Spieler random auf rot oder schwarz setzen
        var numbersRedOrBlack = (1..2).random()
        var amount = (1000..10000).random()
        player.redBlack =
            numbersRedOrBlack                                                 //Die Nummer wird in der Klasse des Spieler unter seinem Namen gespeichert
        player.yourAmount = amount
        rouletteTable.bankTable = rouletteTable.bankTable + amount
        if (numbersRedOrBlack == 1) {
            print("Spieler ${player.name} hat $amount€ auf rot gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${round(player.cash * 100) / 100}€ zum spielen")
        } else if (numbersRedOrBlack == 2) {
            print("Spieler ${player.name} hat $amount€ auf schwarz gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${round(player.cash * 100) / 100}€ zum spielen")
        } else {
            println("Falsche Eingabe")                                                      //schon mal vorbereitet, wenn die Eingabe nicht random, sondern per readline erfolgt
        }
    }

    override fun playerEvenOrNotEven(player: CasinoPlayer, rouletteTable: RouletteTable) {           //Diese Funktion lässt den Spieler random auf gerade oder ungerade setzen
        var numbersEvenOrNotEven = (1..2).random()
        var amount = (1000..10000).random()
        player.evenOrNot =
            numbersEvenOrNotEven                                             //Die Nummer wird in der Klasse des Spieler unter seinem Namen gespeichert
        player.yourAmount = amount
        rouletteTable.bankTable = rouletteTable.bankTable + amount
        if (numbersEvenOrNotEven == 1) {
            print("Spieler ${player.name} hat $amount€ auf gerade gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${round(player.cash * 100) / 100}€ zum spielen")
        } else if (numbersEvenOrNotEven == 2) {
            print("Spieler ${player.name} hat $amount€ auf ungerade gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${round(player.cash * 100) / 100}€ zum spielen")
        } else {
            println("Falsche Eingabe")                                                      //schon mal vorbereitet, wenn die Eingabe nicht random, sondern per readline erfolgt
        }
    }

    override fun playerThird(player: CasinoPlayer, rouletteTable: RouletteTable) {                   //Diese Funktion lässt den Spieler random auf das 1.,2. oder 3.Drittel setzen
        var numbersThird = (1..3).random()
        var amount = (1000..10000).random()
        player.thirdThird =
            numbersThird                                                    //Die Nummer wird in der Klasse des Spieler unter seinem Namen gespeichert
        player.yourAmount = amount
        rouletteTable.bankTable = rouletteTable.bankTable + amount
        if (numbersThird == 1) {
            print("Spieler ${player.name} hat $amount€ auf das 1.Drittel gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${round(player.cash * 100) / 100}€ zum spielen")
        } else if (numbersThird == 2) {
            print("Spieler ${player.name} hat $amount€ auf das 2.Drittel gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${round(player.cash * 100) / 100}€ zum spielen")
        } else if (numbersThird == 3) {
            print("Spieler ${player.name} hat $amount€ auf das 3.Drittel gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${round(player.cash * 100) / 100}€ zum spielen")
        } else {
            println("Falsche Eingabe")                                                      //schon mal vorbereitet, wenn die Eingabe nicht random, sondern per readline erfolgt
        }
    }

    override fun playerFirstOrSecondHalf(player: CasinoPlayer, rouletteTable: RouletteTable) {       //Diese Funktion lässt den Spieler random auf die 1. oder 2. Hälfte setzen
        var numbersFirstOrSecondHalf = (1..2).random()
        var amount = (1000..10000).random()
        player.half =
            numbersFirstOrSecondHalf                                              //Die Nummer wird in der Klasse des Spieler unter seinem Namen gespeichert
        player.yourAmount = amount
        rouletteTable.bankTable = rouletteTable.bankTable + amount
        if (numbersFirstOrSecondHalf == 1) {
            print("Spieler ${player.name} hat $amount€ auf die 1.Hälfte gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${round(player.cash * 100) / 100}€ zum spielen")
        } else if (numbersFirstOrSecondHalf == 2) {
            print("Spieler ${player.name} hat $amount€ auf die 2. Hälfte gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${round(player.cash * 100) / 100}€ zum spielen")
        } else {
            println("Falsche Eingabe")                                                      //schon mal vorbereitet, wenn die Eingabe nicht random, sondern per readline erfolgt
        }
    }

    override fun playerSkipRound(player: CasinoPlayer, rouletteTable: RouletteTable){
        println("Spieler ${player.name} setzt eine Runde aus.")
        player.skipRound = true
    }

    override fun games(playerHighroller: CasinoPlayer, rouletteTable: RouletteTable) {
        println("\nWillkommen ${playerHighroller.name} am Roulette Tisch 2, du kannst zwischen folgenden Spielen wählen, triff deine Auswahl")
        println("| [1] = Auf Zahl setzen | [2] = auf Gerade/Ungerade setzen | [3] = auf Rot oder Schwarz setzen |\n" +
                "| [4] = auf 1.,2. oder 3.Drittel setzen | [5] = auf 1. oder 2. Hälfte setzen | [6] = Aussetzen |")
        try {
            var choice = readln().toInt()
            when (choice) {
                1 -> {
                    playerNumber(playerHighroller, rouletteTable)                             //Auf Zahlen setzen
                }

                2 -> {
                    playerRedOrBlack(playerHighroller, rouletteTable)                         //Auf Rot oder Schwarz setzen
                }

                3 -> {
                    playerEvenOrNotEven(playerHighroller, rouletteTable)                      //Auf Gerade oder Ungerade setzten
                }

                4 -> {
                    playerThird(playerHighroller, rouletteTable)                              //Auf 1.2.oder 3.Drittel setzen
                }

                5 -> {
                    playerFirstOrSecondHalf(playerHighroller, rouletteTable)                  //Auf 1. oder 2. Hälfte setzen
                }

                6 -> {
                    playerSkipRound(playerHighroller, rouletteTable)                          //Eine Runde aussetzen
                }

                else -> {
                    println("ungültige Eingabe, bitte gib eine Zahl von [1] - [6] ein") //Falls ungültige Eingabe, neue Eingabe starten
                    games(playerHighroller, rouletteTable)
                }
            }
        } catch (ausnahme: Exception) {
            println("Diese Eingabe war falsch, es wird automatisch per Default auf Zahl gesetzt")
            playerNumber(playerHighroller, rouletteTable)
        }
    }
}