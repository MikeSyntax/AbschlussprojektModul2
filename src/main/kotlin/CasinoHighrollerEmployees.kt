class CasinoHighrollerEmployees(tableNumber: Int, name: String, job: String, age: Int): CasinoEmployees(tableNumber, name, job, age) {

    /* init {
            println("Mein Name ist $name und ich bin heute Ihr $job an Tisch Nummer $tableNumber")
        }*/

    fun changeHighrollerGroupier(highrollerGroupiers: MutableList<CasinoHighrollerEmployees>, rouletteTable: RouletteTable) {
        if (roundHighroller == 7) {
            var newGroupier = highrollerGroupiers.first()
            highrollerGroupiers.remove(newGroupier)
            println("=================================================================================================|")
            println("=================================================================================================|")
            println("ACHTUNG es findet ein Croupier Wechsel statt, bitte keine Einsätze im Moment                     |")
            println("Willkommen am Tisch ${rouletteTable.tableNumber} mein Name ist ${newGroupier.name} und ich bin für die nächsten Runden Ihr ${job}|")
            rouletteTable.countBank()
            rouletteTable.countTip()
            println("Vielen Dank für die Trinkgelder, wir werden diese unter den Kollegen verteilen                   |")
            println("=================================================================================================|")
            println("=================================================================================================|")
            highrollerGroupiers.add(newGroupier)
            roundHighroller = 0
        }
    }
}
