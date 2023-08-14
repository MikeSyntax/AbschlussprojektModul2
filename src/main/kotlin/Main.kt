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



    var rouletteAtTable1: RouletteTable = RouletteTable(1, "Dieter", 0.00)
    var dieter: CasinoEmployees = CasinoEmployees(1, "Dieter", "Croupier", 36)
    var rainer: CasinoEmployees = CasinoEmployees(1,"Rainer", "Croupier", 48)
    var ernst: CasinoEmployees = CasinoEmployees(1,"Ernst", "Croupier", 31)
    rouletteAtTable1.printInfo()

    println("")

    var rouletteAtTable2: RouletteTable = RouletteTable(2, "Sascha", 0.00, 500000.00)                       //Vorbereitung für den zweiten Tisch
    var sascha: CasinoHighrolerEmployees = CasinoHighrolerEmployees(2, "Sascha", "Croupier", 45)
    var christian: CasinoHighrolerEmployees = CasinoHighrolerEmployees(2,"Christian", "Croupier", 57)
    rouletteAtTable2.printInfo()

    var rouletteGames: RouletteGames = RouletteGames(1)                         //Instanziierung der RouletteGames an Tisch 1
    var rouletteGamesHighroler: RouletteHighroler = RouletteHighroler(2)     //Instanziierung der RouletteGames an Tisch 2

    var klaus: CasinoPlayer = CasinoPlayer(1, "Klaus", 500.00, true, 0.01,23)
    var tatjana: CasinoPlayer = CasinoPlayer(1, "Tatjana", 500.00, true, 0.01,59)
    var mike: CasinoPlayer = CasinoPlayer(1, "Mike", 500.00, true, 0.02,45)
    var salva: CasinoPlayer = CasinoPlayer(1, "Salva", 500.00, false, 0.04,71)
    var claudia: CasinoPlayer = CasinoPlayer(1, "Claudia", 500.00, false, 0.03,26)
    var enrico: CasinoPlayer = CasinoPlayer(1,"Enrico", 50.00, false, 0.00, 19)

    var gonzales: CasinoPlayer = CasinoPlayer(2, "Gonzales", 10000.00, true, 0.1, 26,true)
    var silvio: CasinoPlayer = CasinoPlayer(2, "Silvio", 10000.00, true, 0.08, 65,true)

    val entrance : CasinoEntranceControl = CasinoEntranceControl()
    val playersWantEntrance: MutableList<CasinoPlayer> = mutableListOf(klaus, tatjana, mike, salva, claudia, enrico)
    val players: MutableList<CasinoPlayer> = mutableListOf()
    val playersHighroler: MutableList<CasinoPlayer> = mutableListOf(gonzales, silvio)
    val croupiers: MutableList<CasinoEmployees> = mutableListOf(rainer, ernst, dieter)
    val highrolerCroupiers : MutableList<CasinoHighrolerEmployees> = mutableListOf(christian, sascha)

    println("")
    println("Hier wird die Einlasskontrolle durchgeführt und das Alter geprüft")
    for (player in playersWantEntrance) {
        entrance.entranceControl(player, players)
    }

    println("")
    println("Tisch Nummer ${rouletteAtTable1.tableNumber}")
    for (player in players) {
        player.introduce()
    }

    println("")
    println("Tisch Nummer ${rouletteAtTable2.tableNumber}")
    for (player in playersHighroler) {
        player.introduce()
    }

    println("")

    do {
        rouletteAtTable1.goPlay(players, rouletteGames, rouletteAtTable1)
        rouletteAtTable1.removePlayerWithNoMoney(players)

        rouletteAtTable2.goPlayHighroler(playersHighroler, rouletteGamesHighroler, rouletteAtTable2)
        rouletteAtTable2.removePlayerHighrolerWithNoMoney(playersHighroler)

        round++
        dieter.changeCroupier(croupiers, rouletteAtTable1)
        roundHighroler++
        sascha.changeHighrolerCroupier(highrolerCroupiers, rouletteAtTable2)

    } while (goOn1 || goOn2)


        println("´`´`´`´`´`´`´`´`´`´`´`´`")
        println("| Das Spiel ist vorbei |")
        println("´`´`´`´`´`´`´`´`´`´`´`´`")

}