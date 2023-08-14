open class CasinoEmployees(tableNumber: Int, var name: String, var job: String, var age: Int): RouletteGames(tableNumber){

    /* init {
        println("Mein Name ist $name und ich bin heute Ihr $job an Tisch Nummer $tableNumber")
    }*/

    fun changeCroupier(croupiers: MutableList<CasinoEmployees>, rouletteTable: RouletteTable) {
        if (round == 5) {
            var newCroupier = croupiers.first()
            croupiers.remove(newCroupier)
            println("${FontColors.RED.type}|=================================================================================================|${FontColors.COLOREND.type}")
            println("${FontColors.GREEN.type}|=================================================================================================|${FontColors.COLOREND.type}")
            println("${FontColors.GREEN.type}|ACHTUNG es findet ein Croupier Wechsel statt, bitte keine Einsätze im Moment                     |${FontColors.COLOREND.type}")
            println("|Willkommen am TISCH ${rouletteTable.tableNumber} mein Name ist ${newCroupier.name} und ich bin für die nächsten Runden Ihr $job")
            println("|${rouletteTable.countBank()}")
            println("|${rouletteTable.countTip()}")
            println("${FontColors.GREEN.type}|Vielen Dank für die Trinkgelder, wir werden diese unter den Kollegen verteilen                   |${FontColors.COLOREND.type}")
            println("${FontColors.GREEN.type}|=================================================================================================|${FontColors.COLOREND.type}")
            println("${FontColors.RED.type}|=================================================================================================|${FontColors.COLOREND.type}")
            croupiers.add(newCroupier)
            round = 0
        }
    }
}