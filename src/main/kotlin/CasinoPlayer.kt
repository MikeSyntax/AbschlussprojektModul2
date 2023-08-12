import kotlin.math.round

class CasinoPlayer(tableNumber: Int, val name: String, var cash: Double, var drink: Boolean, var tip: Double): Casino(tableNumber){

    var yourNumber: Int = -1                                                                 //Hier werden die gewählten Zahlen der Spieler abgespeichert um später die Gewinne zu berechnen
    var yourAmount: Int = -1
    var redBlack: Int = -1
    var evenOrNot: Int = -1
    var thirdThird: Int = -1
    var half: Int = -1
    var skipRound = false

    /*init {
        println("Der Spieler $name wurde initialisiert. $name hat $cash € und er hat ein Getränk $drink")
    }*/

    constructor(tableNumber: Int, name: String, cash: Double, drink: Boolean, tip: Double, highRoller: Boolean) : this(tableNumber, name, cash, drink, tip) {
        //println("Spieler $name wurde mit dem sekundären Konstruktor initialisiert und ist ein Highroller $highRoller")
    }

    fun getWin(number: Int, rouletteTable: RouletteTable): String {
        when {
            (yourNumber == number) -> {
                cash += (yourAmount * 36)
                var winAmount = yourAmount * 36
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "${(winAmount - yourAmount)}€ gewonnen! Neuer Cashbestand abzügl. ${round(tipAmount*100)/100}€ Trinkgeld ergibt ${round(cash*100)/100}€"
            }
            (redNumbers.contains(number) && redBlack == 1) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "${(winAmount - yourAmount)}€ gewonnen! Neuer Cashbestand abzügl. ${round(tipAmount*100)/100}€ Trinkgeld ergibt ${round(cash*100)/100}€"

            }
            (blackNumbers.contains(number) && redBlack == 2) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "${(winAmount - yourAmount)}€ gewonnen! Neuer Cashbestand abzügl. ${round(tipAmount*100)/100}€ Trinkgeld ergibt ${round(cash*100)/100}€"

            }
            (numberIsEven.contains(number) && evenOrNot == 1) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "${(winAmount - yourAmount)}€ gewonnen! Neuer Cashbestand abzügl. ${round(tipAmount*100)/100}€ Trinkgeld ergibt ${round(cash*100)/100}€"

            }
            (numberIsNotEven.contains(number) && evenOrNot == 2) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "${(winAmount - yourAmount)}€ gewonnen! Neuer Cashbestand abzügl. ${round(tipAmount*100)/100}€ Trinkgeld ergibt ${round(cash*100)/100}€"

            }
            (first.contains(number) && thirdThird == 1) -> {
                cash += (yourAmount * 3)
                var winAmount = yourAmount * 3
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "${(winAmount - yourAmount)}€ gewonnen! Neuer Cashbestand abzügl. ${round(tipAmount*100)/100}€ Trinkgeld ergibt ${round(cash*100)/100}€"

            }
            (second.contains(number) && thirdThird == 2) -> {
                cash += (yourAmount * 3)
                var winAmount = yourAmount * 3
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "${(winAmount - yourAmount)}€ gewonnen! Neuer Cashbestand abzügl. ${round(tipAmount*100)/100}€ Trinkgeld ergibt ${round(cash*100)/100}€"

            }
            (third.contains(number) && thirdThird == 3) -> {
                cash += (yourAmount * 3)
                var winAmount = yourAmount * 3
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "${(winAmount - yourAmount)}€ gewonnen! Neuer Cashbestand abzügl. ${round(tipAmount*100)/100}€ Trinkgeld ergibt ${round(cash*100)/100}€"

            }
            (firstHalf.contains(number) && half == 1) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "${(winAmount - yourAmount)}€ gewonnen! Neuer Cashbestand abzügl. ${round(tipAmount*100)/100}€ Trinkgeld ergibt ${round(cash*100)/100}€"

            }
            (secondHalf.contains(number) && half == 2) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "${(winAmount - yourAmount)}€ gewonnen! Neuer Cashbestand abzügl. ${round(tipAmount*100)/100}€ Trinkgeld ergibt ${round(cash*100)/100}€"

            }
            (skipRound) -> {
                return  "für diese Runde ausgesetzt"
            }

            else -> {
                return "leider verloren"
            }
        }
    }

    fun reset(){
        yourNumber = -1                                           //zurücksetzen der Variablen aus der CasinoPlayer Klasse
        yourAmount= -1
        redBlack= -1
        evenOrNot = -1
        thirdThird = -1
        half = -1
        skipRound = false
    }

    fun introduce() {
        println("Hallo, ich bin $name und spiele an Tisch $tableNumber")
    }

}