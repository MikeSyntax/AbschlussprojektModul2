open class CasinoEmployees(tableNumber: Int, var name: String, var job: String, var age: Int): RouletteGames(tableNumber){

    /* init {
        println("Mein Name ist $name und ich bin heute Ihr $job an Tisch Nummer $tableNumber")
    }*/

    fun changeCroupier(croupiers: MutableList<CasinoEmployees>, rouletteTable: RouletteTable) {
        if (round == 5) {
            var newCroupier = croupiers.first()
            croupiers.remove(newCroupier)
            println("=================================================================================================|")
            println("=================================================================================================|")
            println("ACHTUNG es findet ein Croupier Wechsel statt, bitte keine Einsätze im Moment                     |")
            println("Willkommen am TISCH ${rouletteTable.tableNumber} mein Name ist ${newCroupier.name} und ich bin für die nächsten Runden Ihr ${job}|")
            rouletteTable.countBank()
            rouletteTable.countTip()
            println("Vielen Dank für die Trinkgelder, wir werden diese unter den Kollegen verteilen                   |")
            println("=================================================================================================|")
            println("=================================================================================================|")
            croupiers.add(newCroupier)
            round = 0
        }
    }
}