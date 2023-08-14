class CasinoHighRollerEmployees(tableNumber: Int, name: String, job: String, age: Int): CasinoEmployees(tableNumber, name, job, age) {

    /* init {
            println("Mein Name ist $name und ich bin heute Ihr $job an Tisch Nummer $tableNumber")
        }*/

    fun changeHighRollerCroupier(highRollerCroupiers: MutableList<CasinoHighRollerEmployees>, rouletteTable: RouletteTable) {
        if (roundHighRoller == 7) {
            var newCroupier = highRollerCroupiers.first()
            highRollerCroupiers.remove(newCroupier)
            println("${FontColors.GREEN.type}=================================================================================================|")
            println("=================================================================================================|")
            println("ACHTUNG es findet ein Croupier Wechsel statt, bitte keine Einsätze im Moment                     |")
            println("Willkommen am TISCH ${rouletteTable.tableNumber} mein Name ist ${newCroupier.name} und ich bin für die nächsten Runden Ihr ${job}|")
            rouletteTable.countBank()
            rouletteTable.countTip()
            println("Vielen Dank für die Trinkgelder, wir werden diese unter den Kollegen verteilen                   |")
            println("=================================================================================================|")
            println("=================================================================================================|${FontColors.COLOREND.type}")
            highRollerCroupiers.add(newCroupier)
            roundHighRoller = 0
        }
    }
}
