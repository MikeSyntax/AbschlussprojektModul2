class CasinoPlayer(val name: String, var cash: Double, var drink: Boolean) {
    var yourNumber: Int = 0                                                                 //Hier werden die gewählten Zahlen der Spieler abgespeichert um später die Gewinne zu berechnen

    /*init {
        println("Der Spieler $name wurde initialisiert. $name hat $cash € und er hat ein Getränk $drink")
    }*/

    constructor(name: String, cash: Double, drink: Boolean, highRoller: Boolean): this(name, cash, drink){
       //println("Spieler $name wurde mit dem sekundären Konstruktor initialisiert und ist ein Highroller $highRoller")
    }

    fun introduce(){
        println("Hallo, ich bin $name")
    }
}