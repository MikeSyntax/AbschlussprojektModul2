// Definition der Klasse CasinoHighRollerEmployees mit den Parametern tableNumber, name, job und age,
// die von der Klasse CasinoEmployees erbt
class CasinoHighRollerEmployees(tableNumber: Int, name: String, job: String, age: Int): CasinoEmployees(tableNumber, name, job, age) {

    /* init {
        // Ausgabe einer formatierten Zeichenkette in der Konsole, die den Namen, den Job und die Tischnummer des Mitarbeiters zeigt
        println("Mein Name ist $name und ich bin heute Ihr $job an Tisch Nummer $tableNumber")
    }*/

    // Definition der Methode changeHighRollerCroupier mit den Parametern highRollerCroupiers und rouletteTable
    fun changeHighRollerCroupier(highRollerCroupiers: MutableList<CasinoHighRollerEmployees>, rouletteTable: RouletteTable) {
        // Beginn der Bedingung, ob die Anzahl der Runden roundHighRoller gleich 7 ist
        if (roundHighRoller == 7) {
            // Zuweisen des ersten Elements aus der highRollerCroupiers-Liste an die Variable newCroupier
            var newCroupier = highRollerCroupiers.first()

            // Entfernen des newCroupier-Elements aus der highRollerCroupiers-Liste
            highRollerCroupiers.remove(newCroupier)

            //Änder des Croupiers auch am Roulettetisch
            rouletteTable.croupierName = newCroupier.name

            //Ausdrucken nur zur Kontrolle, ob sich der Croupier auch am Tisch geändert hat
            //println(rouletteTable.croupierName)

            // Ausgabe Informationen bezüglich des Croupiers Wechsel in roter und grüner Farbe
            println("${FontColors.RED.type}|=================================================================================================|${FontColors.COLOREND.type}")
            println("${FontColors.GREEN.type}|=================================================================================================|${FontColors.COLOREND.type}")
            println("${FontColors.GREEN.type}|ACHTUNG es findet ein Croupier Wechsel statt, bitte keine Einsätze im Moment                     |${FontColors.COLOREND.type}")
            println("|Willkommen am TISCH ${rouletteTable.tableNumber} mein Name ist ${newCroupier.name} und ich bin für die nächsten Runden Ihr $job")
            rouletteTable.countBank()
            rouletteTable.countTip()
            println("${FontColors.GREEN.type}|Vielen Dank für die Trinkgelder, wir werden diese unter den Kollegen verteilen                   |${FontColors.COLOREND.type}")
            println("${FontColors.GREEN.type}|=================================================================================================|${FontColors.COLOREND.type}")
            println("${FontColors.RED.type}|=================================================================================================|${FontColors.COLOREND.type}")

            // Hinzufügen des newCroupier wieder zurück zur highRollerCroupiers-Liste allerdings diesmal ans Ende der Liste
            highRollerCroupiers.add(newCroupier)

            // Zurücksetzen der Rundenzählervariable auf 0
            roundHighRoller = 0
        }
    }
}

