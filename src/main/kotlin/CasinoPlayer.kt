class CasinoPlayer(val name: String, var cash: Double, var drink: Boolean) {
    var yourNumber: Int =
        0                                                                 //Hier werden die gewählten Zahlen der Spieler abgespeichert um später die Gewinne zu berechnen
    var yourAmount: Int = 0
    var redBlack: Int = 0


    /*init {
        println("Der Spieler $name wurde initialisiert. $name hat $cash € und er hat ein Getränk $drink")
    }*/

    constructor(name: String, cash: Double, drink: Boolean, highRoller: Boolean) : this(name, cash, drink) {
        //println("Spieler $name wurde mit dem sekundären Konstruktor initialisiert und ist ein Highroller $highRoller")
    }

    fun getWin(number: Int): String {
        when {
            (yourNumber == number) -> {
                cash += (yourAmount * 36)
                return "Gewonnen! Neuer Cashbestand: $cash"
            }
            (redNumbers.contains(number) && redBlack == 1) -> {
                cash += (yourAmount * 2)
                return "Gewonnen! Neuer Cashbestand: $cash"
            }
            (blackNumbers.contains(number) && redBlack == 2) -> {
                cash += (yourAmount * 2)
                return "Gewonnen! Neuer Cashbestand: $cash"
            }
            else -> {
                return "Leider verloren"
            }
        }
    }

    fun introduce() {
        println("Hallo, ich bin $name")
    }

}