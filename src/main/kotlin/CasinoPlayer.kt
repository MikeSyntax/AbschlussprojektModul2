class CasinoPlayer(val name: String, var cash: Double, var drink: Boolean) {
    var yourNumber: Int = 0                                                                 //Hier werden die gewählten Zahlen der Spieler abgespeichert um später die Gewinne zu berechnen
    var yourAmount: Int = 0
    var redBlack: Int = 0
    var evenOrNot: Int = 0
    var thirdThird: Int = 0
    var half: Int = 0

    /*init {
        println("Der Spieler $name wurde initialisiert. $name hat $cash € und er hat ein Getränk $drink")
    }*/

    constructor(name: String, cash: Double, drink: Boolean, highRoller: Boolean) : this(name, cash, drink) {
        //println("Spieler $name wurde mit dem sekundären Konstruktor initialisiert und ist ein Highroller $highRoller")
    }

    constructor(name: String, cash: Double, drink: Boolean, tip: Double): this (name, cash, drink){
        //println("Spieler $name wurde mit dem tertiären Konstruktor initialisiert und gibt gerne Trinkgeld in Höhe von $tip %")
    }



    fun getWin(number: Int, rouletteTable: RouletteTable, player: CasinoPlayer): String {
        when {
            (yourNumber == number) -> {
                cash += (yourAmount * 36)
                var winAmount = yourAmount * 36
                var tipAmount = yourAmount * 36 * player.tip
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: $cash"
            }
            (redNumbers.contains(number) && redBlack == 1) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                var tipAmount = yourAmount * 2
                rouletteTable.tipForEmployees = rouletteTable.tipForEmployees + tipAmount
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: $cash"
            }
            (blackNumbers.contains(number) && redBlack == 2) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: $cash"
            }
            (numberIsEven.contains(number) && evenOrNot == 1) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: $cash"
            }
            (numberIsNotEven.contains(number) && evenOrNot == 2) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: $cash"
            }
            (first.contains(number) && thirdThird == 1) -> {
                cash += (yourAmount * 3)
                var winAmount = yourAmount * 3
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: $cash"
            }
            (second.contains(number) && thirdThird == 2) -> {
                cash += (yourAmount * 3)
                var winAmount = yourAmount * 3
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: $cash"
            }
            (third.contains(number) && thirdThird == 3) -> {
                cash += (yourAmount * 3)
                var winAmount = yourAmount * 3
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: $cash"
            }
            (firstHalf.contains(number) && half == 1) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: $cash"
            }
            (secondHalf.contains(number) && half == 2) -> {
                cash += (yourAmount * 2)
                var winAmount = yourAmount * 2
                rouletteTable.bankTable = rouletteTable.bankTable - winAmount
                return "Gewonnen! Neuer Cashbestand: $cash"
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