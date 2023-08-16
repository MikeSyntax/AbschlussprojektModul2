// Import der Funktion round aus der Kotlin-Math-Bibliothek
import kotlin.math.round

// Offene Klasse RouletteGames, die als Basis für verschiedene Roulette-Spiele dient
open class RouletteGames(tableNumber: Int) {

    // Offene Methode playerNumber zum Setzen einer zufälligen Zahl und Betrags für einen Spieler
    open fun playerNumber(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Generieren einer zufälligen Zahl und eines zufälligen Betrags
        var number = (0..36).random()
        var amount = (10..350).random()

        // Speichern der gewählten Nummer und des Betrags im Spieler-Objekt
        player.yourNumber = number
        player.yourAmount = amount

        // Aktualisieren des Bankbetrags am Roulette-Tisch
        rouletteTable.bankTable += amount

        // Ausgabe der "Setz"-Informationen für den Spieler
        print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf die ${FontColors.RED.type}$number${FontColors.COLOREND.type} gesetzt,")

        // Abziehen des gesetzten Betrags vom Spieler-Kontostand
        player.cash -= amount

        // Ausgabe des verbleibenden Kontostands des Spielers
        println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum Spielen")
    }

    // Offene Methode playerRedOrBlack zum Zufälligen Setzen des Spielers auf Rot oder Schwarz
    open fun playerRedOrBlack(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Generieren einer zufälligen Zahl (1 oder 2) für Rot oder Schwarz
        var numbersRedOrBlack = (1..2).random()
        var amount = (10..350).random()

        // Speichern der gewählten Farbe (Rot oder Schwarz) und des Betrags im Spieler-Objekt
        player.redBlack = numbersRedOrBlack
        player.yourAmount = amount

        // Aktualisieren des Bankbetrags am Roulette-Tisch
        rouletteTable.bankTable += amount

        // Überprüfen der gewählten Farbe und Ausgabe der Setzinformationen
        if (numbersRedOrBlack == 1) {
            // Setzen auf Rot
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf rot gesetzt")
            } else if (numbersRedOrBlack == 2) {
            // Setzen auf Schwarz
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf schwarz gesetzt")
            } else {
            // Ausgabe bei ungültiger Eingabe (zur Vorbereitung auf manuelle Eingaben)
            println("Falsche Eingabe")
        }
        // Abzug des Einsatzbetrags vom Spieler-Guthaben
        player.cash = player.cash - amount

        // Ausgabe des verbleibenden Guthabens
        println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum Spielen")
    }

    // Offene Methode playerEvenOrNotEven zum Zufälligen Setzen des Spielers auf Gerade oder Ungerade
    open fun playerEvenOrNotEven(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Generieren einer zufälligen Zahl (1 oder 2) für Gerade oder Ungerade
        var numbersEvenOrNotEven = (1..2).random()
        var amount = (10..350).random()

        // Speichern der gewählten Option (Gerade oder Ungerade) und des Betrags im Spieler-Objekt
        player.evenOrNot = numbersEvenOrNotEven
        player.yourAmount = amount

        // Aktualisieren des Bankbetrags am Roulette-Tisch
        rouletteTable.bankTable += amount

        // Überprüfen der gewählten Option und Ausgabe der Setzinformationen
        if (numbersEvenOrNotEven == 1) {
            // Setzen auf Gerade
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf gerade gesetzt")
            } else if (numbersEvenOrNotEven == 2) {
            // Setzen auf Ungerade
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf ungerade gesetzt")
           } else {
            // Ausgabe bei ungültiger Eingabe (zur Vorbereitung auf manuelle Eingaben)
            println("Falsche Eingabe")
        }
        // Abzug des Einsatzbetrags vom Spieler-Guthaben
        player.cash = player.cash - amount

        // Ausgabe des verbleibenden Guthabens
        println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum Spielen")
    }

    // Offene Methode playerThird zum zufälligen Setzen des Spielers auf das 1., 2. oder 3. Drittel
    open fun playerThird(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Generieren einer zufälligen Zahl (1 bis 3) für das Drittel
        var numbersThird = (1..3).random()
        var amount = (10..350).random()

        // Speichern des gewählten Drittels und des Betrags im Spieler-Objekt
        player.thirdThird = numbersThird
        player.yourAmount = amount

        // Aktualisieren des Bankbetrags am Roulette-Tisch
        rouletteTable.bankTable += amount

        // Überprüfen des gewählten Drittels und Ausgabe der Setzinformationen
        if (numbersThird == 1) {
            // Setzen auf das 1. Drittel
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf das 1. Drittel gesetzt")
            } else if (numbersThird == 2) {
            // Setzen auf das 2. Drittel
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf das 2. Drittel gesetzt")
            } else if (numbersThird == 3) {
            // Setzen auf das 3. Drittel
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf das 3. Drittel gesetzt")
            } else {
            // Ausgabe bei ungültiger Eingabe (zur Vorbereitung auf manuelle Eingaben)
            println("Falsche Eingabe")
        }
        // Abzug des Einsatzbetrags vom Spieler-Guthaben
        player.cash = player.cash - amount

        // Ausgabe des verbleibenden Guthabens
        println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum Spielen")
    }

    // Offene Methode playerFirstOrSecondHalf zum Zufälligen Setzen des Spielers auf die 1. oder 2. Hälfte
    open fun playerFirstOrSecondHalf(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Generieren einer zufälligen Zahl (1 oder 2) für die Hälfte
        var numbersFirstOrSecondHalf = (1..2).random()
        var amount = (10..350).random()

        // Speichern der gewählten Hälfte und des Betrags im Spieler-Objekt
        player.half = numbersFirstOrSecondHalf
        player.yourAmount = amount

        // Aktualisieren des Bankbetrags am Roulette-Tisch
        rouletteTable.bankTable += amount

        // Überprüfen der gewählten Hälfte und Ausgabe der Setzinformationen
        if (numbersFirstOrSecondHalf == 1) {
            // Setzen auf die 1. Hälfte
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf die 1. Hälfte gesetzt")
             } else if (numbersFirstOrSecondHalf == 2) {
            // Setzen auf die 2. Hälfte
            print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf die 2. Hälfte gesetzt")
             } else {
            // Ausgabe bei ungültiger Eingabe (zur Vorbereitung auf manuelle Eingaben)
            println("Falsche Eingabe")
        }

        // Abzug des Einsatzbetrags vom Spieler-Guthaben
        player.cash = player.cash - amount

        // Ausgabe des verbleibenden Guthabens
        println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum Spielen")
    }

    // Offene Methode playerSkipRound, um den Spieler eine Runde aussetzen zu lassen
    open fun playerSkipRound(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Ausgabe, dass der Spieler eine Runde aussetzt
        println("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} setzt eine Runde aus.")

        // Setzen der Eigenschaft skipRound des Spielers auf true
        player.skipRound = true
    }

    // Offene Methode games, um die Spieloptionen für einen Spieler anzuzeigen und zu verarbeiten
    open fun games(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Ausgabe der Spieloptionen für den Spieler
        println(
            "\nWeiter geht es mit ${FontColors.BLUE.type}${player.name}${FontColors.COLOREND.type} am Roulette Tisch ${FontColors.BLUE.type}${rouletteTable.tableNumber}${FontColors.COLOREND.type}, du kannst zwischen\n" +
                    "folgenden Spielen wählen, triff jetzt deine Auswahl:")
            println("${FontColors.BLUE.type}----------------------------------------------------${FontColors.COLOREND.type}")
        println("[${FontColors.YELLOW.type}1${FontColors.COLOREND.type}] = Auf Zahl setzen")
        println("[${FontColors.YELLOW.type}2${FontColors.COLOREND.type}] = auf Rot oder Schwarz setzen")
        println("[${FontColors.YELLOW.type}3${FontColors.COLOREND.type}] = auf Gerade oder Ungerade setzen")
        println("[${FontColors.YELLOW.type}4${FontColors.COLOREND.type}] = auf 1., 2. oder 3. Drittel setzen")
        println("[${FontColors.YELLOW.type}5${FontColors.COLOREND.type}] = auf 1. oder 2. Hälfte setzen")
        println("[${FontColors.YELLOW.type}6${FontColors.COLOREND.type}] = Aussetzen")

        try {
            // Einlesen der Spielerwahl
            var choice = readln().toInt()

            // Verarbeitung der Spielerwahl mittels 'when' (Ähnlich einem Switch-Statement in anderen Programmiersprachen)
            when (choice) {
                1 -> {
                    playerNumber(player, rouletteTable) // Auf Zahl setzen
                }

                2 -> {
                    playerRedOrBlack(player, rouletteTable) // Auf Rot oder Schwarz setzen
                }

                3 -> {
                    playerEvenOrNotEven(player, rouletteTable) // Auf Gerade oder Ungerade setzen
                }

                4 -> {
                    playerThird(player, rouletteTable) // Auf 1., 2. oder 3. Drittel setzen
                }

                5 -> {
                    playerFirstOrSecondHalf(player, rouletteTable) // Auf 1. oder 2. Hälfte setzen
                }

                6 -> {
                    playerSkipRound(player, rouletteTable) // Eine Runde aussetzen
                }

                else -> {
                    // Ungültige Eingabe: Neue Eingabeaufforderung
                    println("Ungültige Eingabe, bitte gib eine Zahl von [${FontColors.RED.type}1${FontColors.COLOREND.type}] - [${FontColors.RED.type}6${FontColors.COLOREND.type}] ein")
                    games(player, rouletteTable)
                }
            }
        } catch (ausnahme: Exception) {
            // Fehler bei der Eingabe: Standardmäßig auf "Auf Zahl setzen" setzen
            println("Diese Eingabe war falsch, es wird automatisch per ${FontColors.RED.type}Default auf Zahl${FontColors.COLOREND.type} gesetzt")
            playerNumber(player, rouletteTable)
        }
    }
}