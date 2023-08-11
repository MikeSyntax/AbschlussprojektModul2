fun main() {
    println("")
    println("          d8888b   d8888b  d88888b          d8888b     d8b    d8b   db  db   dD \n" +
            "          88   8D    88    88               88   8D  d8   8b  888o  88  88  8P  \n" +
            "          88   88    88    88ooooo          88oooY   88ooo88  88V8o 88  88 8P   \n" +
            "          88   88    88    88               88   b   88   88  88 V8o88  88 8b   \n" +
            "          88   8D    88    88               88   8D  88   88  88  V888  88  88  \n" +
            "          Y8888Y   Y8888Y  Y88888Y          Y8888P   YP   YP  VP   V8P  YP   YD \n" +
            "                                                                         \n" +
            "                                                                         \n" +
            "           d888b   d88888b  db   d8b   db  d8888b  d8b   db  d8b   db  d888888b \n" +
            "          88  88b  88       88   I8I   88    88    888o  88  888o  88     88    \n" +
            "          88       8888888  88   I8I   88    88    88V8o 88  88V8o 88     88    \n" +
            "          88  888  88       Y8   I8I   88    88    88 V8o88  88 V8o88     88    \n" +
            "          88   8   88        8b d8 8b d8     88    88  V888  88  V888     88    \n" +
            "           Y888P   Y88888P    8b8   8d8    Y8888P  VP   V8P  VP   V8P     YP    \n" +
            "                                                                                  ")





    var rouletteAtTable1: RouletteTable = RouletteTable(1, "Klaus Dieter", 0.00)
    var klausDieter: CasinoEmployees = CasinoEmployees(1, "Klaus Dieter", "Groupier", 36)
    var rainer: CasinoEmployees = CasinoEmployees(1,"Rainer", "Groupier", 48)
    var ernst: CasinoEmployees = CasinoEmployees(1,"Ernst", "Groupier", 31)
    rouletteAtTable1.printInfo()

    println("")

    var rouletteAtTable2: RouletteTable = RouletteTable(2, "Sascha Grammel", 0.00, 500000.00)                       //Vorbereitung für den zweiten Tisch
    var sascha: CasinoEmployees = CasinoEmployees(2, "Sascha Grammel", "Groupier", 45)
    rouletteAtTable2.printInfo()

    var rouletteGames: RouletteGames = RouletteGames(1)                         //Instanziierung der RouletteGames an Tisch 1
    var rouletteGamesHighroller: RouletteHighroller = RouletteHighroller(2)     //Instanziierung der RouletteGames an Tisch 2

    var klaus: CasinoPlayer = CasinoPlayer(1, "Klaus", 500.00, true, 0.01)
    var tatjana: CasinoPlayer = CasinoPlayer(1, "Tatjana", 500.00, true, 0.01)
    var mike: CasinoPlayer = CasinoPlayer(1, "Mike", 500.00, true, 0.02)
    var salva: CasinoPlayer = CasinoPlayer(1, "Salva", 500.00, false, 0.04)
    var claudia: CasinoPlayer = CasinoPlayer(1, "Claudia", 500.00, false, 0.03)

    var gonzales: CasinoPlayer = CasinoPlayer(2, "Gonzales", 10000.00, true, 0.1, true)
    var silvio: CasinoPlayer = CasinoPlayer(2, "Silvio", 10000.00, true, 0.08, true)

    val players: MutableList<CasinoPlayer> = mutableListOf(klaus, tatjana, mike, salva, claudia)
    val playersHighroller: MutableList<CasinoPlayer> = mutableListOf(gonzales, silvio)
    val groupiers: MutableList<CasinoEmployees> = mutableListOf(rainer, ernst)

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
        rouletteAtTable1.changeGroupier(groupiers, rouletteAtTable1, klausDieter)

    } while (goOn1 || goOn2)


        println("´`´`´`´`´`´`´`´`´`´`´`´`")
        println("| Das Spiel ist vorbei |")
        println("´`´`´`´`´`´`´`´`´`´`´`´`")

}