import kotlin.math.round

class RouletteHighRoller(tableNumber: Int): RouletteGames(tableNumber) {

    override fun playerNumber(player: CasinoPlayer, rouletteTable: RouletteTable) {                   //Diese Funktion lässt den Spieler auf eine random Zahl einen random Betrag zwischen 10 und 50 euro setzen
        var number = (0..36).random()
        var amount = (1000..10000).random()
        player.yourNumber =
            number                                                          //Die Nummer wird in der Klasse des Spieler unter seinem Namen gespeichert
        player.yourAmount = amount
        rouletteTable.bankTable = rouletteTable.bankTable + amount
        print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf die ${FontColors.RED.type}$number${FontColors.COLOREND.type} gesetzt,")
        player.cash = player.cash - amount
        println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum spielen")
    }

    override fun playerRedOrBlack(player: CasinoPlayer, rouletteTable: RouletteTable) {              //Diese Funktion lässt den Spieler random auf rot oder schwarz setzen
        var numbersRedOrBlack = (1..2).random()
        var amount = (1000..10000).random()
        player.redBlack =
            numbersRedOrBlack                                                 //Die Nummer wird in der Klasse des Spieler unter seinem Namen gespeichert
        player.yourAmount = amount
        rouletteTable.bankTable = rouletteTable.bankTable + amount
        if (numbersRedOrBlack == 1) {
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf rot gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum spielen")
        } else if (numbersRedOrBlack == 2) {
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf schwarz gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum spielen")
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
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf gerade gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum spielen")
        } else if (numbersEvenOrNotEven == 2) {
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf ungerade gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum spielen")
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
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf das 1.Drittel gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum spielen")
        } else if (numbersThird == 2) {
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf das 2.Drittel gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum spielen")
        } else if (numbersThird == 3) {
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf das 3.Drittel gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum spielen")
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
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf die 1.Hälfte gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum spielen")
        } else if (numbersFirstOrSecondHalf == 2) {
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf die 2. Hälfte gesetzt")
            player.cash = player.cash - amount
            println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum spielen")
        } else {
            println("Falsche Eingabe")                                                      //schon mal vorbereitet, wenn die Eingabe nicht random, sondern per readline erfolgt
        }
    }

    fun playerFreeChoiceNumber(player: CasinoPlayer, rouletteTable: RouletteTable) {
        println("Bitte wähle eine Zahl zwischen 0-36")
        var numberFreeChoice = readln()?.toIntOrNull()
        println("Bitte gib jetzt den Einsatz ein, den du setzen möchtest")
        var amount = readln()?.toIntOrNull()
        if (amount != null && amount > 0 && amount <= player.cash) {
            player.yourNumber = numberFreeChoice!!
            player.yourAmount = amount
            rouletteTable.bankTable +=  amount
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf die ${FontColors.RED.type}$numberFreeChoice${FontColors.COLOREND.type} gesetzt,")
            player.cash -= amount
            println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum spielen")
        } else {
            println("Der Einsatz ist leider höher als dein Cashbestand ${player.cash}, bitte versuche es nochmal ")
            playerFreeChoiceNumber(player, rouletteTable)
        }
    }

    override fun playerSkipRound(playerHighRoller: CasinoPlayer, rouletteTable: RouletteTable){
        println("Spieler ${FontColors.RED.type}${playerHighRoller.name}${FontColors.COLOREND.type} setzt eine Runde aus.")
        playerHighRoller.skipRound = true
    }

    override fun games(playerHighRoller: CasinoPlayer, rouletteTable: RouletteTable) {
        println("\nWeiter geht es mit ${playerHighRoller.name} am Roulette Tisch 2, du kannst zwischen\n" + "folgenden Spielen wählen, triff jetzt deine Auswahl:")
        println("[${FontColors.YELLOW.type}1${FontColors.COLOREND.type}] = Auf Zahl setzen\n[${FontColors.YELLOW.type}2${FontColors.COLOREND.type}] = auf Rot oder Schwarz setzen\n[${FontColors.YELLOW.type}3${FontColors.COLOREND.type}] = auf Gerade/Ungerade setzen" +
                "\n[${FontColors.YELLOW.type}4${FontColors.COLOREND.type}] = auf 1.,2. oder 3.Drittel setzen\n[${FontColors.YELLOW.type}5${FontColors.COLOREND.type}] = auf 1. oder 2. Hälfte setzen\n[${FontColors.YELLOW.type}6${FontColors.COLOREND.type}] = Aussetzen" +
                    "\n[${FontColors.YELLOW.type}7${FontColors.COLOREND.type}] = Freie Zahlenauswahl und Betrag")

        try {
            var choice = readln().toInt()
            when (choice) {
                1 -> {
                    playerNumber(playerHighRoller, rouletteTable)                             //Auf Zahlen setzen
                }

                2 -> {
                    playerRedOrBlack(playerHighRoller, rouletteTable)                         //Auf Rot oder Schwarz setzen
                }

                3 -> {
                    playerEvenOrNotEven(playerHighRoller, rouletteTable)                      //Auf Gerade oder Ungerade setzten
                }

                4 -> {
                    playerThird(playerHighRoller, rouletteTable)                              //Auf 1.2.oder 3.Drittel setzen
                }

                5 -> {
                    playerFirstOrSecondHalf(playerHighRoller, rouletteTable)                  //Auf 1. oder 2. Hälfte setzen
                }

                6 -> {
                    playerSkipRound(playerHighRoller, rouletteTable)                          //Eine Runde aussetzen
                }

                7 -> {
                    playerFreeChoiceNumber(playerHighRoller, rouletteTable)                   //Freie Nummernwahl und Betragswahl durch readln Eingabe
                }

                else -> {
                    println("ungültige Eingabe, bitte gib eine Zahl von [${FontColors.RED.type}1${FontColors.COLOREND.type}] - [${FontColors.RED.type}6${FontColors.COLOREND.type}] ein") //Falls ungültige Eingabe, neue Eingabe starten
                    games(playerHighRoller, rouletteTable)
                }
            }
        } catch (ausnahme: Exception) {
            println("Diese Eingabe war falsch, es wird automatisch per ${FontColors.RED.type}Default auf Zahl${FontColors.COLOREND.type} gesetzt")
            playerNumber(playerHighRoller, rouletteTable)
        }
    }
}