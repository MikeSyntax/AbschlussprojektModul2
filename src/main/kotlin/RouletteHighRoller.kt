// Import der benötigten Math-Funktionen
import kotlin.math.round

// Klasse RouletteHighRoller, die von der Klasse RouletteGames erbt
class RouletteHighRoller(tableNumber: Int) : RouletteGames(tableNumber) {

    // Überschriebene Methode playerNumber, um Spielern mit höherem Einsatz eine random Zahl setzen zu lassen
    override fun playerNumber(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Generierung einer zufälligen Zahl zwischen 0 und 36
        number = (0..36).random()

        // Generierung eines zufälligen Betrags zwischen 1000 und 10000 Euro
        amount = (1000..10000).random()

        // Speichern der gewählten Zahl und des Einsatzbetrags im Spieler Objekt
        player.yourNumber = number
        player.yourAmount = amount

        // Hinzufügen des Einsatzbetrags zum Banktisch
        rouletteTable.bankTable += amount

        // Überprüfen der gewählten Nummer und Ausgabe der Setz Informationen als Funktion in der open class geschrieben um diese auch in der HighRoller Class anzuwenden und CodeZeilen zu sparen
        printNumber(player)
    }

    // Überschriebene Methode playerRedOrBlack, um Spielern mit höherem Einsatz auf Rot oder Schwarz setzen zu lassen
    override fun playerRedOrBlack(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Generierung einer zufälligen Zahl zwischen 1 und 2, um rot oder schwarz zu wählen
        numbersRedOrBlack = (1..2).random()

        // Generierung eines zufälligen Betrags zwischen 1000 und 10000 Euro
        amount = (1000..10000).random()

        // Speichern der gewählten Option (rot oder schwarz) im Spieler Objekt
        player.redBlack = numbersRedOrBlack

        // Speichern des Einsatzbetrags im Spieler Objekt
        player.yourAmount = amount

        // Hinzufügen des Einsatzbetrags zum Banktisch
        rouletteTable.bankTable += amount

        // Überprüfen der gewählten Farbe und Ausgabe der Setz Informationen als Funktion in der open class geschrieben um diese auch hier in der HighRoller Class anzuwenden und CodeZeilen zu sparen
        printInfoRedOrBlack(player)
    }

    // Überschriebene Methode playerEvenOrNotEven, um Spielern mit höherem Einsatz auf gerade oder ungerade setzen zu lassen
    override fun playerEvenOrNotEven(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Generierung einer zufälligen Zahl zwischen 1 und 2, um gerade oder ungerade zu wählen
        numbersEvenOrNotEven = (1..2).random()

        // Generierung eines zufälligen Betrags zwischen 1000 und 10000 Euro
        amount = (1000..10000).random()

        // Speichern der gewählten Option (gerade oder ungerade) im Spieler Objekt
        player.evenOrNot = numbersEvenOrNotEven

        // Speichern des Einsatzbetrags im Spieler Objekt
        player.yourAmount = amount

        // Hinzufügen des Einsatzbetrags zum Banktisch
        rouletteTable.bankTable += amount

        // Überprüfen der gewählten Variante und Ausgabe der Setz Informationen als Funktion open class geschrieben um diese auch in der HighRoller Class anzuwenden und CodeZeilen zu sparen
        printEvenOrNotEven(player)
    }

    // Überschriebene Methode playerThird, um Spielern mit höherem Einsatz auf das 1., 2. oder 3. Drittel setzen zu lassen
    override fun playerThird(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Generierung einer zufälligen Zahl zwischen 1 und 3, um das Drittel zu wählen
        numbersThird = (1..3).random()

        // Generierung eines zufälligen Betrags zwischen 1000 und 10000 Euro
        amount = (1000..10000).random()

        // Speichern des gewählten Drittels im Spieler Objekt
        player.thirdThird = numbersThird

        // Speichern des Einsatzbetrags im Spieler Objekt
        player.yourAmount = amount

        // Hinzufügen des Einsatzbetrags zum Banktisch
        rouletteTable.bankTable += amount

        // Überprüfen der gewählten Variante und Ausgabe der Setz Informationen als Funktion in der open class geschrieben um diese auch in der HighRoller Class anzuwenden und CodeZeilen zu sparen
        printThird(player)
    }

    // Überschriebene Methode playerFirstOrSecondHalf, um Spielern mit höherem Einsatz auf die 1. oder 2. Hälfte setzen zu lassen
    override fun playerFirstOrSecondHalf(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Generierung einer zufälligen Zahl zwischen 1 und 2, um die Hälfte zu wählen
        numbersFirstOrSecondHalf = (1..2).random()

        // Generierung eines zufälligen Betrags zwischen 1000 und 10000 Euro
        amount = (1000..10000).random()

        // Speichern der gewählten Hälfte im Spieler Objekt
        player.half = numbersFirstOrSecondHalf

        // Speichern des Einsatzbetrags im Spieler Objekt
        player.yourAmount = amount

        // Hinzufügen des Einsatzbetrags zum Banktisch
        rouletteTable.bankTable += amount

        // Überprüfen der gewählten Variante und Ausgabe der Setz Informationen als Funktion in der open class geschrieben um diese auch in der HighRoller Class anzuwenden und CodeZeilen zu sparen
        printFirstOrSecondHalf(player)
    }

    // Methode playerFreeChoiceNumber ermöglicht dem Spieler, eine beliebige Zahl zwischen 0 und 36 zu wählen
    fun playerFreeChoiceNumber(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Ausgabe zur Aufforderung der Zahleneingabe
        println("Bitte wähle eine Zahl zwischen 0-36")

        // Einlesen der vom Spieler gewählten Zahl und Konvertierung in Integer
        var numberFreeChoice = readln().toIntOrNull()

        // Überprüfung, ob die Eingabe eine gültige Zahl zwischen 0 und 36 ist
        if (numberFreeChoice != null && numberFreeChoice in 0..36) {
            // Ausgabe zur Aufforderung des Einsatzes
            println("Bitte gib jetzt den Einsatz ein, den du setzen möchtest")

            // Einlesen des vom Spieler gewählten Einsatzes und Konvertierung in Integer
            var amount = readln().toIntOrNull()

            // Überprüfung, ob der eingegebene Einsatz gültig ist und innerhalb der erlaubten Bandbreite liegt
            // sowie ob der Spieler genügend Guthaben hat
            if (amount != null && amount in 1000..10000 && amount <= player.cash) {
                // Speichern der gewählten Zahl und des Einsatzes im Spieler Objekt
                player.yourNumber = numberFreeChoice
                player.yourAmount = amount

                // Hinzufügen des Einsatzbetrags zum Banktisch
                rouletteTable.bankTable += amount

                // Ausgabe der Spielinformationen
                print("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} hat ${FontColors.RED.type}$amount€${FontColors.COLOREND.type} auf die ${FontColors.RED.type}$numberFreeChoice${FontColors.COLOREND.type} gesetzt,")

                // Aktualisieren des Spieler-Guthabens nach dem Einsatz
                player.cash -= amount
                println(" somit verbleiben noch ${FontColors.RED.type}${round(player.cash * 100) / 100}€${FontColors.COLOREND.type} zum spielen")

            } else {
                // Ausgabe bei ungültiger Einsatzhöhe oder zu niedrigem Guthaben
                println("")
                println(
                    "Die Eingabe war leider falsch (Einsatz von ${FontColors.RED.type}${rouletteTable.minEinsatz}€${FontColors.COLOREND.type} bis ${FontColors.RED.type}${rouletteTable.maximalerEinsatz}€${FontColors.COLOREND.type})\n" +
                            "oder dein Cashbestand ${FontColors.RED.type}${player.cash}€${FontColors.COLOREND.type} ist zu niedrig für den Einsatz.\n" +
                            "-------------- Bitte versuche es noch einmal ------------------"
                )
                println("")

                // Aufruf der Methode erneut, um erneute Eingabe zu ermöglichen
                playerFreeChoiceNumber(player, rouletteTable)
            }
        } else {
            // Ausgabe bei ungültiger Zahleneingabe
            println("Die Zahl ist leider falsch, bitte versuche es noch einmal")

            // Aufruf der Methode erneut, um erneute Eingabe zu ermöglichen
            playerFreeChoiceNumber(player, rouletteTable)
        }
    }

    // Überschriebene Methode playerSkipRound, um den Spieler eine Runde aussetzen zu lassen
    override fun playerSkipRound(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Ausgabe, dass der Spieler eine Runde aussetzt
        println("Spieler ${FontColors.RED.type}${player.name}${FontColors.COLOREND.type} setzt eine Runde aus.")

        // Setzen der Eigenschaft skipRound des Spielers auf true
        player.skipRound = true
    }

    // Überschriebene Methode games, um dem Spieler Spiele am Roulette-Tisch 2 anzubieten
    override fun games(player: CasinoPlayer, rouletteTable: RouletteTable) {
        // Ausgabe der Spielauswahl für den Spieler
        println("\nWeiter geht es mit ${FontColors.BLUE.type}${player.name}${FontColors.COLOREND.type} am Roulette Tisch ${FontColors.BLUE.type}${rouletteTable.tableNumber}${FontColors.COLOREND.type}, du kannst zwischen\n" +
                    "folgenden Spielen wählen, triff jetzt deine Auswahl:")
            println("${FontColors.BLUE.type}----------------------------------------------------${FontColors.COLOREND.type}")
            println("[${FontColors.YELLOW.type}1${FontColors.COLOREND.type}] = Auf Zahl setzen\n" +
                    "[${FontColors.YELLOW.type}2${FontColors.COLOREND.type}] = auf Rot oder Schwarz setzen\n" +
                    "[${FontColors.YELLOW.type}3${FontColors.COLOREND.type}] = auf Gerade oder Ungerade setzen\n" +
                    "[${FontColors.YELLOW.type}4${FontColors.COLOREND.type}] = auf 1.,2. oder 3.Drittel setzen\n" +
                    "[${FontColors.YELLOW.type}5${FontColors.COLOREND.type}] = auf 1. oder 2. Hälfte setzen\n" +
                    "[${FontColors.YELLOW.type}6${FontColors.COLOREND.type}] = Aussetzen\n" +
                    "[${FontColors.YELLOW.type}7${FontColors.COLOREND.type}] = Freie Zahlenauswahl und Betrag")

        try {
            // Eingabe der Spielwahl des Spielers
            var choice = readln().toInt()
            when (choice) {
                1 -> {
                    playerNumber(player, rouletteTable)  // Auf Zahlen setzen
                }

                2 -> {
                    playerRedOrBlack(player, rouletteTable)  // Auf Rot oder Schwarz setzen
                }

                3 -> {
                    playerEvenOrNotEven(player, rouletteTable)  // Auf Gerade oder Ungerade setzen
                }

                4 -> {
                    playerThird(player, rouletteTable)  // Auf 1.2.oder 3. Drittel setzen
                }

                5 -> {
                    playerFirstOrSecondHalf(player, rouletteTable)  // Auf 1. oder 2. Hälfte setzen
                }

                6 -> {
                    playerSkipRound(player, rouletteTable)  // Eine Runde aussetzen
                }

                7 -> {
                    playerFreeChoiceNumber(player, rouletteTable)  // Freie Nummernwahl und Betragswahl durch readln Eingabe
                }

                else -> {
                    println("ungültige Eingabe, bitte gib eine Zahl von [${FontColors.RED.type}1${FontColors.COLOREND.type}] - [${FontColors.RED.type}7${FontColors.COLOREND.type}] ein") // Falls ungültige Eingabe, neue Eingabe starten
                    games(player, rouletteTable)
                }
            }
        } catch (ausnahme: Exception) {
            println("Diese Eingabe war falsch, es wird automatisch per ${FontColors.RED.type}Default auf Zahl${FontColors.COLOREND.type} gesetzt")
            playerNumber(player, rouletteTable)
        }
    }
}