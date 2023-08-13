class CasinoHighrollerEmployees(tableNumber: Int, name: String, job: String, age: Int): CasinoEmployees(tableNumber, name, job, age) {


    fun changeHighrollerGroupier(highroller: MutableList<CasinoHighrollerEmployees>, rouletteTable: RouletteTable) {
        if (roundHighroller == 7) {
            var newGroupier = highroller.first()
            highroller.remove(newGroupier)
            println("=================================================================================================|")
            println("=================================================================================================|")
            println("ACHTUNG es findet ein Croupier Wechsel statt, bitte keine Einsätze im Moment                     |")
            println("Willkommen am Tisch ${rouletteTable.tableNumber} mein Name ist ${newGroupier.name} und ich bin für die nächsten Runden Ihr ${job}|")
            rouletteTable.countBank()
            rouletteTable.countTip()
            println("Vielen Dank für die Trinkgelder, wir werden diese unter den Kollegen verteilen                   |")
            println("=================================================================================================|")
            println("=================================================================================================|")
            highroller.add(newGroupier)
            roundHighroller = 0
        }
    }
}