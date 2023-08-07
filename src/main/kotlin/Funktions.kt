fun rollingNumbers(): Int {                             //Das Rouletterad dreht sich und
    return (0..36).random()                         // gibt als Rückgabewert eine Zahl zwischen 0 und 36 wieder



}

fun playerNumber(player: Player){
    var numbersOne = (0..36).random()
    println("Spieler ${player.name} hat auf die $numbersOne gesetzt")

}