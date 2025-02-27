// Importieren der benötigten Bibliotheken
import kotlin.math.round
// Definition der Klasse CasinoPlayer, die von der Klasse Casino erbt
class CasinoPlayer(tableNumber: Int, val name: String, var cash: Double, var drink: Boolean, var tip: Double, var age: Int): Casino(tableNumber) {


    // Deklaration von Eigenschaften, um Spieler Informationen zu speichern
    var yourNumber: Int = -1    // Gewählte Zahl des Spielers
    var yourAmount: Int = -1    // Gewählter Betrag des Spielers
    var redBlack: Int = -1      // Wahl von Rot (0) oder Schwarz (1)
    var evenOrNot: Int = -1     // Wahl von Gerade (0) oder Ungerade (1)
    var thirdThird: Int = -1    // Wahl von Erste Drittel (0), Zweite Drittel (1) oder Drittes Drittel (2)
    var half: Int = -1          // Wahl von Erste Hälfte (0) oder Zweite Hälfte (1)
    var skipRound: Boolean = false // true/false, um eine Runde zu überspringen
    var numberFreeChoice: Int = -1 // Wahl einer vom Nutzer gewählten beliebigen Zahl


    /*init {
        println("Der Spieler $name wurde initialisiert. $name hat $cash € und er hat ein Getränk $drink")
    }*/


    // Sekundärer Konstruktor, der den primären Konstruktor aufruft und einen zusätzlichen Parameter hat
    constructor(tableNumber: Int, name: String, cash: Double, drink: Boolean, tip: Double, age: Int, highRoller: Boolean) : this(tableNumber, name, cash, drink, tip, age) {
        //println("Spieler $name wurde mit dem sekundären Konstruktor initialisiert und ist ein HighRoller $highRoller")
    }

    // Funktion zur Ermittlung des Gewinns basierend auf der gewählten Zahl und der Roulette-Tabelle
    fun getWin(number: Int, rouletteTable: RouletteTable): String {
        when {
            // Wenn die gewählte Zahl mit der vom Spieler gewählten Zahl übereinstimmt
            (yourNumber == number) -> {
                // Erhöhe den Kontostand des Spielers um das Gewinnbetrag * 35
                cash += (yourAmount * 35)
                var winAmount = yourAmount * 35
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                // Trinkgeld für die Angestellten erhöhen und den Bankbetrag der Tabelle reduzieren
                rouletteTable.tipForEmployees += tipAmount
                rouletteTable.bankTable -= winAmount
                Thread.sleep(1000)
                // Rückgabe einer Nachricht über den Gewinn und den aktualisierten Kontostand
                return "${FontColors.GREEN.type}${(winAmount - yourAmount)}€${FontColors.COLOREND.type} gewonnen! Neuer Cashbestand abzügl. ${FontColors.GREEN.type}${round(tipAmount * 100) / 100}€${FontColors.COLOREND.type} Trinkgeld ergibt ${FontColors.GREEN.type}${round(cash * 100) / 100}€${FontColors.COLOREND.type}"
            }

            // Wenn die gewählte Zahl rot ist und der Spieler "Schwarz" gewählt hat
            (redNumbers.contains(number) && redBlack == 1) -> {
                // Erhöhe den Kontostand des Spielers um den Gewinnbetrag * 2
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                // Trinkgeld für die Angestellten erhöhen und den Bankbetrag der Tabelle reduzieren
                rouletteTable.tipForEmployees += tipAmount
                rouletteTable.bankTable -= winAmount
                Thread.sleep(1000)
                // Rückgabe einer Nachricht über den Gewinn und den aktualisierten Kontostand
                return "${FontColors.GREEN.type}${(winAmount - yourAmount)}€${FontColors.COLOREND.type} gewonnen! Neuer Cashbestand abzügl. ${FontColors.GREEN.type}${round(tipAmount * 100) / 100}€${FontColors.COLOREND.type} Trinkgeld ergibt ${FontColors.GREEN.type}${round(cash * 100) / 100}€${FontColors.COLOREND.type}"
            }

            // Wenn die gewählte Zahl schwarz ist und der Spieler "Schwarz" gewählt hat
            (blackNumbers.contains(number) && redBlack == 2) -> {
                // Erhöhe den Kontostand des Spielers um den Gewinnbetrag * 2
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                // Trinkgeld für die Angestellten erhöhen und den Bankbetrag der Tabelle reduzieren
                rouletteTable.tipForEmployees += tipAmount
                rouletteTable.bankTable -= winAmount
                Thread.sleep(1000)
                // Rückgabe einer Nachricht über den Gewinn und den aktualisierten Kontostand
                return "${FontColors.GREEN.type}${(winAmount - yourAmount)}€${FontColors.COLOREND.type} gewonnen! Neuer Cashbestand abzügl. ${FontColors.GREEN.type}${round(tipAmount * 100) / 100}€${FontColors.COLOREND.type} Trinkgeld ergibt ${FontColors.GREEN.type}${round(cash * 100) / 100}€${FontColors.COLOREND.type}"
            }

            // Wenn die gewählte Zahl gerade ist und der Spieler "Gerade" gewählt hat
            (numberIsEven.contains(number) && evenOrNot == 1) -> {
                // Erhöhe den Kontostand des Spielers um den Gewinnbetrag * 2
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                // Trinkgeld für die Angestellten erhöhen und den Bankbetrag der Tabelle reduzieren
                rouletteTable.tipForEmployees += tipAmount
                rouletteTable.bankTable -= winAmount
                Thread.sleep(1000)
                // Rückgabe einer Nachricht über den Gewinn und den aktualisierten Kontostand
                return "${FontColors.GREEN.type}${(winAmount - yourAmount)}€${FontColors.COLOREND.type} gewonnen! Neuer Cashbestand abzügl. ${FontColors.GREEN.type}${round(tipAmount * 100) / 100}€${FontColors.COLOREND.type} Trinkgeld ergibt ${FontColors.GREEN.type}${round(cash * 100) / 100}€${FontColors.COLOREND.type}"
            }

            // Wenn die gewählte Zahl ungerade ist und der Spieler "Ungerade" gewählt hat
            (numberIsNotEven.contains(number) && evenOrNot == 2) -> {
                // Erhöhe den Kontostand des Spielers um den Gewinnbetrag * 2
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                // Trinkgeld für die Angestellten erhöhen und den Bankbetrag der Tabelle reduzieren
                rouletteTable.tipForEmployees += tipAmount
                rouletteTable.bankTable -= winAmount
                Thread.sleep(1000)
                // Rückgabe einer Nachricht über den Gewinn und den aktualisierten Kontostand
                return "${FontColors.GREEN.type}${(winAmount - yourAmount)}€${FontColors.COLOREND.type} gewonnen! Neuer Cashbestand abzügl. ${FontColors.GREEN.type}${round(tipAmount * 100) / 100}€${FontColors.COLOREND.type} Trinkgeld ergibt ${FontColors.GREEN.type}${round(cash * 100) / 100}€${FontColors.COLOREND.type}"
            }

            // Wenn die gewählte Zahl in der ersten Hälfte liegt und der Spieler "1. Drittel" gewählt hat
            (first.contains(number) && thirdThird == 1) -> {
                // Erhöhe den Kontostand des Spielers um den Gewinnbetrag * 3
                cash += (yourAmount * 3)
                var winAmount = yourAmount * 3
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                // Trinkgeld für die Angestellten erhöhen und den Bankbetrag der Tabelle reduzieren
                rouletteTable.tipForEmployees += tipAmount
                rouletteTable.bankTable -= winAmount
                Thread.sleep(1000)
                // Rückgabe einer Nachricht über den Gewinn und den aktualisierten Kontostand
                return "${FontColors.GREEN.type}${(winAmount - yourAmount)}€${FontColors.COLOREND.type} gewonnen! Neuer Cashbestand abzügl. ${FontColors.GREEN.type}${round(tipAmount * 100) / 100}€${FontColors.COLOREND.type} Trinkgeld ergibt ${FontColors.GREEN.type}${round(cash * 100) / 100}€${FontColors.COLOREND.type}"
            }

            // Wenn die gewählte Zahl in der zweiten Hälfte liegt und der Spieler "2. Drittel" gewählt hat
            (second.contains(number) && thirdThird == 2) -> {
                // Erhöhe den Kontostand des Spielers um den Gewinnbetrag * 3
                cash += (yourAmount * 3)
                var winAmount = yourAmount * 3
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                // Trinkgeld für die Angestellten erhöhen und den Bankbetrag der Tabelle reduzieren
                rouletteTable.tipForEmployees += tipAmount
                rouletteTable.bankTable -= winAmount
                Thread.sleep(1000)
                // Rückgabe einer Nachricht über den Gewinn und den aktualisierten Kontostand
                return "${FontColors.GREEN.type}${(winAmount - yourAmount)}€${FontColors.COLOREND.type} gewonnen! Neuer Cashbestand abzügl. ${FontColors.GREEN.type}${round(tipAmount * 100) / 100}€${FontColors.COLOREND.type} Trinkgeld ergibt ${FontColors.GREEN.type}${round(cash * 100) / 100}€${FontColors.COLOREND.type}"
            }

            // Wenn die gewählte Zahl in der dritten Hälfte liegt und der Spieler "3. Drittel" gewählt hat
            (third.contains(number) && thirdThird == 3) -> {
                // Erhöhe den Kontostand des Spielers um den Gewinnbetrag * 3
                cash += (yourAmount * 3)
                var winAmount = yourAmount * 3
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                // Trinkgeld für die Angestellten erhöhen und den Bankbetrag der Tabelle reduzieren
                rouletteTable.tipForEmployees += tipAmount
                rouletteTable.bankTable -= winAmount
                Thread.sleep(1000)
                // Rückgabe einer Nachricht über den Gewinn und den aktualisierten Kontostand
                return "${FontColors.GREEN.type}${(winAmount - yourAmount)}€${FontColors.COLOREND.type} gewonnen! Neuer Cashbestand abzügl. ${FontColors.GREEN.type}${round(tipAmount * 100) / 100}€${FontColors.COLOREND.type} Trinkgeld ergibt ${FontColors.GREEN.type}${round(cash * 100) / 100}€${FontColors.COLOREND.type}"
            }

            // Wenn die gewählte Zahl in der ersten Hälfte liegt und der Spieler "1. Hälfte" gewählt hat
            (firstHalf.contains(number) && half == 1) -> {
                // Erhöhe den Kontostand des Spielers um den Gewinnbetrag * 2
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                // Trinkgeld für die Angestellten erhöhen und den Bankbetrag der Tabelle reduzieren
                rouletteTable.tipForEmployees += tipAmount
                rouletteTable.bankTable -= winAmount
                Thread.sleep(1000)
                // Rückgabe einer Nachricht über den Gewinn und den aktualisierten Kontostand
                return "${FontColors.GREEN.type}${(winAmount - yourAmount)}€${FontColors.COLOREND.type} gewonnen! Neuer Cashbestand abzügl. ${FontColors.GREEN.type}${round(tipAmount * 100) / 100}€${FontColors.COLOREND.type} Trinkgeld ergibt ${FontColors.GREEN.type}${round(cash * 100) / 100}€${FontColors.COLOREND.type}"
            }

            // Wenn die gewählte Zahl in der zweiten Hälfte liegt und der Spieler "2. Hälfte" gewählt hat
            (secondHalf.contains(number) && half == 2) -> {
                // Erhöhe den Kontostand des Spielers um den Gewinnbetrag * 2
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                // Trinkgeld für die Angestellten erhöhen und den Bankbetrag der Tabelle reduzieren
                rouletteTable.tipForEmployees += tipAmount
                rouletteTable.bankTable -= winAmount
                Thread.sleep(1000)
                // Rückgabe einer Nachricht über den Gewinn und den aktualisierten Kontostand
                return "${FontColors.GREEN.type}${(winAmount - yourAmount)}€${FontColors.COLOREND.type} gewonnen! Neuer Cashbestand abzügl. ${FontColors.GREEN.type}${round(tipAmount * 100) / 100}€${FontColors.COLOREND.type} Trinkgeld ergibt ${FontColors.GREEN.type}${round(cash * 100) / 100}€${FontColors.COLOREND.type}"
            }

            // Wenn die skipRound true gesetzt ist
            (skipRound) -> {
                Thread.sleep(1000)
                return "für diese Runde ausgesetzt"
            }

            // Wenn die gewählte Zahl mit der vom Spieler gewählten Zahl übereinstimmt
            (numberFreeChoice == number) -> {
                // Erhöhe den Kontostand des Spielers um das Gewinnbetrag * 35
                cash += (yourAmount * 35)
                var winAmount = yourAmount * 35
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                // Trinkgeld für die Angestellten erhöhen und den Bankbetrag der Tabelle reduzieren
                rouletteTable.tipForEmployees += tipAmount
                rouletteTable.bankTable -= winAmount
                Thread.sleep(1000)
                // Rückgabe einer Nachricht über den Gewinn und den aktualisierten Kontostand
                return "${FontColors.GREEN.type}${(winAmount - yourAmount)}€${FontColors.COLOREND.type} gewonnen! Neuer Cashbestand abzügl. ${FontColors.GREEN.type}${
                    round(tipAmount * 100) / 100}€${FontColors.COLOREND.type} Trinkgeld ergibt ${FontColors.GREEN.type}${round(cash * 100) / 100}€${FontColors.COLOREND.type}"
            }

            // Andernfalls (wenn keine der vorherigen Bedingungen erfüllt ist)
            else -> {
                Thread.sleep(1000)
                return "leider ${FontColors.RED.type}verloren${FontColors.COLOREND.type}"
            }
        }
    }
        // Setzt die Spieler-Variablen auf ihre Standardwerte zurück
        fun reset() {
            yourNumber = -1
            yourAmount = -1
            redBlack = -1
            evenOrNot = -1
            thirdThird = -1
            half = -1
            skipRound = false
            numberFreeChoice = -1
        }

        // Gibt eine Einführungsnachricht für den Spieler aus
        fun introduce() {
            println("Hallo, ich bin ${FontColors.BLUE.type}$name${FontColors.COLOREND.type} und spiele an Roulette Tisch ${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type}")
            Thread.sleep(1000)
        }
    }
