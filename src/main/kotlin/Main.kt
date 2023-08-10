fun main(){
    println("")
    var rouletteAtTable1: RouletteTable = RouletteTable(1,"Klaus Dieter", 0.00)
    var klausDieter: CasinoEmployees = CasinoEmployees(1, "Klaus Dieter", "Groupier", 45)
    rouletteAtTable1.printInfo()
    var rouletteAtTable2: RouletteTable = RouletteTable(2,"Sascha Grammel", 0.00, 500000.00)
    var sascha: CasinoEmployees = CasinoEmployees(1, "Sascha Grammel", "Groupier", 34)
    rouletteAtTable2.printInfo()
    var rouletteGames: RouletteGames = RouletteGames(1)             //Instanziierung der RouletteGames an Tisch 1
    var klaus: CasinoPlayer = CasinoPlayer(1,"Klaus", 600.00, true, 0.01)
    var tatjana: CasinoPlayer = CasinoPlayer(1,"Tatjana", 500.00, true, 0.01)
    var mike: CasinoPlayer = CasinoPlayer(1,"Mike", 750.00, true, 0.02)
    var salva: CasinoPlayer = CasinoPlayer(1,"Salva", 800.00, false, 0.04)
    var claudia: CasinoPlayer = CasinoPlayer(1,"Claudia", 1000.00, false,0.03)
    var gonzales: CasinoPlayer = CasinoPlayer(1,"Gonzales", 10000.00, true, 0.1,true)
    val players = mutableListOf(klaus,tatjana,mike,salva,claudia,gonzales)
    println("")

    for (player in players){
        player.introduce()
    }

    println("")
    while (players.any { it.cash > 0 }) {
        for (player in players) {                                                                   //Schleife falls ein Spieler kein Geld mehr hat
          println("aktuelles Guthaben Spieler ${player.name} ${player.cash}")
            if (player.cash <= 0) {
                println("${player.name} hat kein Geld mehr und muss den Tisch verlassen")
                continue
            }
                rouletteAtTable1.goPlay(players, rouletteGames, rouletteAtTable1)                    //Hauptmethode goPlay zum Spielen steht in der RouletteTable
        }
        println("Alle Spieler haben kein Geld mehr!")
    }
}