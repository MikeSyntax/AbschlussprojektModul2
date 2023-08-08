fun rollingNumbers(): Int {                                                 //Das Rouletterad dreht sich und
    return (0..36).random()                                           // gibt als Rückgabewert eine Zahl zwischen 0 und 36 wieder
}

fun playerNumber(player: Player){                                           //Diese Funktion lässt den Spieler auf eine random Zahl setzen
    var numbersOne = (0..36).random()
    println("Spieler ${player.name} hat auf die $numbersOne gesetzt")
}

fun playerRedOrBlack(player: Player) {                                      //Diese Funktion lässt den Spieler random auf rot oder schwarz setzen
    var numbersRedOrBlack = (1..2).random()
        if (numbersRedOrBlack == 1) {
        println("Spieler ${player.name} hat auf rot gesetzt")
        } else if (numbersRedOrBlack == 2) {
            println("Spieler ${player.name} hat auf schwarz gesetzt")
        } else {
            println("Falsche Eingabe")
        }
}