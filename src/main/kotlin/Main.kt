fun main(){

    var rouletteAtTable1: RouletteTable = RouletteTable(1,"Klaus Dieter", 0.00)
    var klausDieter: CasinoEmployees = CasinoEmployees(1, "Klaus Dieter", "Groupier", 45)
    rouletteAtTable1.printInfo()
    println("")
    var rouletteAtTable2: RouletteTable = RouletteTable(2,"Sascha Grammel", 0.00, 500000.00)
    var sascha: CasinoEmployees = CasinoEmployees(1, "Sascha Grammel", "Groupier", 34)
    rouletteAtTable2.printInfo()
    println("")
    var rouletteGames: RouletteGames = RouletteGames(1)             //Instanziierung der RouletteGames an Tisch 1

    var klaus: CasinoPlayer = CasinoPlayer(1,"Klaus", 600.00, true, 0.01)
    var tatjana: CasinoPlayer = CasinoPlayer(1,"Tatjana", 500.00, true, 0.01)
    var mike: CasinoPlayer = CasinoPlayer(1,"Mike", 750.00, true, 0.02)
    var salva: CasinoPlayer = CasinoPlayer(1,"Salva", 800.00, false, 0.04)
    var claudia: CasinoPlayer = CasinoPlayer(1,"Claudia", 1000.00, false,0.03)
    var gonzales: CasinoPlayer = CasinoPlayer(1,"Gonzales", 10000.00, true, 0.1,true)

    val players = mutableListOf(klaus,tatjana,mike,salva,claudia,gonzales)

    println("")

    while (players.any { it.cash > 0 }) {
        for (player in players) {                                                   //Schleife falls ein Spieler kein Geld mehr hat
        println("${player.cash}")
            if (player.cash <= 0) {
                println("${player.name} hat kein Geld mehr und muss den Tisch verlassen")
                continue
            }

            for (player in players) {
                rouletteGames.games(player, rouletteAtTable1)                       //Willkommen alle Spieler am Roulettetisch 1 und bitte eine Auswahl treffen
                println("")
            }

            println("==================================")
            print("Nichts geht mehr")
            var rouletteNumber =
                rouletteAtTable1.rollingNumbers()                                   //das Rouletterad am Tisch 1 dreht sich und gibt eine zufällige Zahl als tableNumber zurück welche in der Klasse Roulette ermittelt wird
            println(" und es ist die $rouletteNumber")
            println("==================================")

            rouletteAtTable1.infoOfNumbers(rouletteNumber)                          //Rückmeldung ob die Zahl rot/schwarz oder gerade/ungerade usw. ist

            println("\n")

            rouletteNumbers(getInfo(rouletteNumber))                                //Hinzufügen der Nummer zur Liste der letzen 10 Zahlen wobei die 1 rausfällt und die neue Zahl ans Ende gesetzt wird
            println("Anzeige der letzten 10 Zahlen, ")
            printNumbers(listOfLastNumbers)                                         //Anzeigen der bearbeiteten Liste untereinander

            println("")

            for (player in players) {
                println("${player.name} hat ${player.getWin(rouletteNumber, rouletteAtTable1)}")      //Gewinne jedes einzelnen Spielers prüfen
            }

            println("")

            rouletteAtTable1.countBank()                                            //Aufrufen der Methode über den Stand der Bank
            rouletteAtTable1.countTip()                                             //Aufrufen der Methode über den Stand der Trinkgeldkasse für die Angestellten

            println("")

            println("Machen Sie Ihre Einsätze, neues Spiel, neues Glück")

            player.reset()                                                          //zurücksezten der Variablen in CasinoPlayer für das neue Spiel

            println("")


        }

        println("Alle Spieler haben kein Geld mehr!")
    }
}