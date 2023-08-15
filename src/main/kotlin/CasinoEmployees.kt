// Definition der offenen Klasse CasinoEmployees, die von RouletteGames erbt, mit den Parametern tableNumber, name, job und age
open class CasinoEmployees(tableNumber: Int, var name: String, var job: String, var age: Int): RouletteGames(tableNumber) {

    /* Dies ist der Konstruktor der Klasse CasinoEmployees.
       Er erhält die Parameter tableNumber, name, job und age beim Erstellen von CasinoEmployees-Objekten. */

    // Hier beginnt der Konstruktor-Initialisierungsblock (init-Block).
    /*init {
        // Dieser Block wird ausgeführt, wenn ein CasinoEmployees-Objekt erstellt wird.
        println("Mein Name ist $name und ich bin heute Ihr $job an Tisch Nummer $tableNumber")
        // Hier wird eine Ausgabe in der Konsole gemacht, die Informationen über den Angestellten enthält.
    }*/
    // Ende des init-Blocks.

    // Definition der Methode changeCroupier mit den Parametern croupiers und rouletteTable
    fun changeCroupier(croupiers: MutableList<CasinoEmployees>, rouletteTable: RouletteTable) {
        // Beginn der Bedingung, ob round gleich 5 ist
        if (round == 5) {
            // Definition einer neuen Variable newCroupier, die das erste Element aus der croupiers-Liste enthält
            var newCroupier = croupiers.first()

            // Entfernen des neuen Croupiers aus der croupiers-Liste
            croupiers.remove(newCroupier)

            //Ändern des Croupiers auch am Roulettetisch
            rouletteTable.croupierName = newCroupier.name

            //Ausdrucken nur zur Kontrolle, ob sich der Croupier auch am Tisch geändert hat =======
            //println(rouletteTable.croupierName)

            // Ausgabe von Informationen des Croupiers Wechsel in verschiedenen Farben
            println("${FontColors.BLUE.type}|===============================================================================================================|${FontColors.COLOREND.type}")
            println("${FontColors.GREEN.type}|===============================================================================================================|${FontColors.COLOREND.type}")
            println("${FontColors.GREEN.type}|ACHTUNG es findet ein Croupier Wechsel statt, bitte keine Einsätze im Moment                                   |${FontColors.COLOREND.type}")
            println("|Willkommen am Roulette Tisch ${FontColors.BLUE.type}${rouletteTable.tableNumber}${FontColors.COLOREND.type} mein Name ist ${FontColors.BLUE.type}${newCroupier.name}${FontColors.COLOREND.type} und ich bin für die nächsten Runden Ihr $job")
            rouletteTable.countBank()
            rouletteTable.countTip()
            println("${FontColors.GREEN.type}|Vielen Dank für die Trinkgelder, wir werden diese unter den Kollegen verteilen                                 |${FontColors.COLOREND.type}")
            println("${FontColors.GREEN.type}|===============================================================================================================|${FontColors.COLOREND.type}")
            println("${FontColors.BLUE.type}|===============================================================================================================|${FontColors.COLOREND.type}")

            // Hinzufügen des neuen Croupiers zurück zur croupiers-Liste allerdings diesmal ans Ende der Liste
            croupiers.add(newCroupier)

            // Zurücksetzen der round-Variable auf 0
            round = 0
        }
    }
}
