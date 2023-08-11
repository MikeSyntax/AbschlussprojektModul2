fun main() {
    println("")

    var rouletteAtTable1: RouletteTable = RouletteTable(1, "Klaus Dieter", 0.00)
    var klausDieter: CasinoEmployees = CasinoEmployees(1, "Klaus Dieter", "Groupier", 36)
    var rainer: CasinoEmployees = CasinoEmployees(1,"Rainer", "Groupier", 48)
    rouletteAtTable1.printInfo()

    println("")

    var rouletteAtTable2: RouletteTable = RouletteTable(2, "Sascha Grammel", 0.00, 500000.00)                       //Vorbereitung für den zweiten Tisch
    var sascha: CasinoEmployees = CasinoEmployees(2, "Sascha Grammel", "Groupier", 45)
    rouletteAtTable2.printInfo()

    var rouletteGames: RouletteGames = RouletteGames(1)                         //Instanziierung der RouletteGames an Tisch 1
    var rouletteGamesHighroller: RouletteHighroller = RouletteHighroller(2)     //Instanziierung der RouletteGames an Tisch 2

    var klaus: CasinoPlayer = CasinoPlayer(1, "Klaus", 500.00, true, 0.01)
    var tatjana: CasinoPlayer = CasinoPlayer(1, "Tatjana", 500.00, true, 0.01)
    var mike: CasinoPlayer = CasinoPlayer(1, "Mike", 550.00, true, 0.02)
    var salva: CasinoPlayer = CasinoPlayer(1, "Salva", 500.00, false, 0.04)
    var claudia: CasinoPlayer = CasinoPlayer(1, "Claudia", 1000.00, false, 0.03)

    var gonzales: CasinoPlayer = CasinoPlayer(2, "Gonzales", 10000.00, true, 0.1, true)
    var silvio: CasinoPlayer = CasinoPlayer(2, "Silvio", 10000.00, true, 0.08, true)

    val players: MutableList<CasinoPlayer> = mutableListOf(klaus, tatjana, mike, salva, claudia)
    val playersHighroller: MutableList<CasinoPlayer> = mutableListOf(gonzales, silvio)
    val groupiers: MutableList<CasinoEmployees> = mutableListOf(rainer, klausDieter)

    println("")

    for (player in players) {
        player.introduce()
    }
    for (player in playersHighroller) {
        player.introduce()
    }

    println("")

    do {
        rouletteAtTable1.goPlay(players, rouletteGames, rouletteAtTable1)
        rouletteAtTable1.removePlayerWithNoMoney(players)

        rouletteAtTable2.goPlayHighroler(playersHighroller, rouletteGamesHighroller, rouletteAtTable2)
        rouletteAtTable2.removePlayerHighrollerWithNoMoney(playersHighroller)

        round++
        rouletteAtTable1.changeGroupier(groupiers, rouletteAtTable1)

    } while (goOn1 && goOn2)
    println("Das Spiel ist vorbei")

}
