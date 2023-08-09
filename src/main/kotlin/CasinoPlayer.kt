import kotlin.math.round

class CasinoPlayer(tableNumber: Int, val name: String, var cash: Double, var drink: Boolean, var tip: Double): Casino(tableNumber){
    var yourNumber: Int = 0                                                                 //Hier werden die gewählten Zahlen der Spieler abgespeichert um später die Gewinne zu berechnen
    var yourAmount: Int = 0
    var redBlack: Int = 0
    var evenOrNot: Int = 0
    var thirdThird: Int = 0
    var half: Int = 0

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
                return "Gewonnen! Neuer Cashbestand: ${round(cash*100)/100} und gibt ${round(tipAmount*100)/100}€ Trinkgeld"
            }
            (redNumbers.contains(number) && redBlack == 1) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: ${round(cash*100)/100} und gibt ${round(tipAmount*100)/100}€ Trinkgeld"
            }
            (blackNumbers.contains(number) && redBlack == 2) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: ${round(cash*100)/100} und gibt ${round(tipAmount*100)/100}€ Trinkgeld"
            }
            (numberIsEven.contains(number) && evenOrNot == 1) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: ${round(cash*100)/100} und gibt ${round(tipAmount*100)/100}€ Trinkgeld"
            }
            (numberIsNotEven.contains(number) && evenOrNot == 2) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: ${round(cash*100)/100} und gibt ${round(tipAmount*100)/100}€ Trinkgeld"
            }
            (first.contains(number) && thirdThird == 1) -> {
                cash += (yourAmount * 3)
                var winAmount = yourAmount * 3
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: ${round(cash*100)/100} und gibt ${round(tipAmount*100)/100}€ Trinkgeld"
            }
            (second.contains(number) && thirdThird == 2) -> {
                cash += (yourAmount * 3)
                var winAmount = yourAmount * 3
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: ${round(cash*100)/100} und gibt ${round(tipAmount*100)/100}€ Trinkgeld"
            }
            (third.contains(number) && thirdThird == 3) -> {
                cash += (yourAmount * 3)
                var winAmount = yourAmount * 3
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: ${round(cash*100)/100} und gibt ${round(tipAmount*100)/100}€ Trinkgeld"
            }
            (firstHalf.contains(number) && half == 1) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: ${round(cash*100)/100} und gibt ${round(tipAmount*100)/100}€ Trinkgeld"
            }
            (secondHalf.contains(number) && half == 2) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = (winAmount - yourAmount) * tip
                cash -= tipAmount
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: ${round(cash*100)/100} und gibt ${round(tipAmount*100)/100}€ Trinkgeld"
            }
            else -> {
                return "leider verloren"
            }
        }
    }

    fun introduce() {
        println("Hallo, ich bin $name")
    }

}