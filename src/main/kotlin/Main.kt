fun main(){

    var rouletteAtTable1: RouletteTable = RouletteTable(1,"Klaus Dieter", 0.00, 500000.00)
    var klausDieter: CasinoEmployees = CasinoEmployees("Klaus Dieter", "Groupier", 45)

    println("")

    var rouletteAtTable2: RouletteTable = RouletteTable(2,"Sascha Grammel", 0.00)
    var sascha: CasinoEmployees = CasinoEmployees("Sascha Grammel", "Groupier", 34)

    println("")

    rouletteAtTable1.printInfo()

    println("")

    rouletteAtTable2.printInfo()

   /* println("")

    rouletteAtTable1.countBank()
    rouletteAtTable1.countTip()

    println("")

    rouletteAtTable2.countBank()
    rouletteAtTable2.countTip() */

    println("")

    val players = mutableListOf(
        CasinoPlayer("Klaus", 1000.00, true),
        CasinoPlayer("Tatjana", 500.00, true),
        CasinoPlayer("Mike", 50.00, true),
        CasinoPlayer("Salva", 1500.00, false),
        CasinoPlayer("Claudia", 100.00, false),
        CasinoPlayer("Gonzales", 100000.00, true, true)
    )

    println("")

    var rouletteGames: RouletteGames = RouletteGames(1)          //Instanziierung der RouletteGames an Tisch 1

    for (player in players) {
        rouletteGames.games(player)                                             //Willkommen alle Spieler am Roulettetisch 1 und bitte eine Auswahl treffen
        println("")
    }


    println("==================================")
    print("Nichts geht mehr")
    var rouletteNumber = rouletteAtTable1.rollingNumbers()                  //das Rouletterad am Tisch 1 dreht sich und gibt eine zufällige Zahl als tableNumber zurück welche in der Klasse Roulette ermittelt wird
    println(" und es ist die $rouletteNumber")
    println("==================================")

    rouletteAtTable1.infoOfNumbers(rouletteNumber)                          //Rückmeldung ob die Zahl rot/schwarz oder gerade/ungerade usw. ist

    println("\n")

    rouletteNumbers(getInfo(rouletteNumber))                                //Hinzufügen der Nummer zur Liste der letzen 10 Zahlen wobei die 1 rausfällt und die neue Zahl ans Ende gesetzt wird
    println("Anzeige der letzten 10 Zahlen, ")
    printNumbers(listOfLastNumbers)                                         //Anzeigen der bearbeiteten Liste untereinander

    println("\n")

    for (player in players) {
        println("${player.name} hat ${player.getWin(rouletteNumber)}") //Gewinne jedes einzelnen Spielers prüfen
    }



}