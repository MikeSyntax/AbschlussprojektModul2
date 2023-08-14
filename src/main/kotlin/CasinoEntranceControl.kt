// Definition der Klasse CasinoEntranceControl mit dem Parameter tableNumber, der standardmäßig auf 1 gesetzt ist,
// und die von der Klasse Casino erbt
class CasinoEntranceControl(tableNumber: Int = 1): Casino(tableNumber) {

    // Definition der Methode entranceControl mit den Parametern player und players
    fun entranceControl(player: CasinoPlayer, players: MutableList<CasinoPlayer>){
        // Beginn der Bedingung, ob das Alter des Spielers größer oder gleich 21 ist
        if (player.age >= 21){
            // Ausgabe einer formatierten Zeichenkette in grüner Farbe, die den Einlass des Spielers bestätigt
            println("${FontColors.GREEN.type}${player.name} Einlass gewährt${FontColors.COLOREND.type}")

            // Hinzufügen des Spielers zur players-Liste
            players.add(player)

            // Pause für 1 Sekunde
            Thread.sleep(1000)
        } else {
            // Ausgabe einer formatierten Zeichenkette in roter Farbe, die dem Spieler mitteilt, dass er zu jung ist
            // und nicht rein darf
            println("${FontColors.RED.type}Tut uns leid, aber ${player.name} du bist zu jung und kommst nicht rein${FontColors.COLOREND.type}")

            // Pause für 1 Sekunde
            Thread.sleep(1000)
        }
    }
}
