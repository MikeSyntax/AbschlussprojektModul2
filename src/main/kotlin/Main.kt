fun main() {
    println("")
    println("${FontColors.GREEN.type}          d8888b   d8888b  d88888b          d8888b     d8b    d8b   db  db   dD        \n" +
            "          88   8D    88    88               88   8D  d8   8b  888o  88  88  8P         \n" +
            "          88   88    88    88888            88oooY   88ooo88  88V8o 88  88 8P          \n" +
            "          88   88    88    88               88   b   88   88  88 V8o88  88 8b          \n" +
            "          88   8D    88    88               88   8D  88   88  88  V888  88  88         \n" +
            "          Y8888Y   Y8888Y  Y88888Y          Y8888P   YP   YP  VP   V8P  YP   YD        \n" +
            "                                                                                       \n" +
            "                                                                                       \n" +
            "           d888b   d88888b  db   d8b   db  d8888b  d8b   db  d8b   db  d888888b        \n" +
            "          88  88b  88       88   I8I   88    88    888o  88  888o  88     88           \n" +
            "          88       8888888  88   I8I   88    88    88V8o 88  88V8o 88     88           \n" +
            "          88  888  88       Y8   I8I   88    88    88 V8o88  88 V8o88     88           \n" +
            "          88   8   88        8b d8 8b d8     88    88  V888  88  V888     88           \n" +
            "           Y888P   Y88888P    8b8   8d8    Y8888P  VP   V8P  VP   V8P     YP           \n" +
            "                                                                                         ${FontColors.COLOREND.type}")


    Thread.sleep(1000)
    var rouletteAtTable1: RouletteTable = RouletteTable(1, "Dieter", 0.00)
    var dieter: CasinoEmployees = CasinoEmployees(1, "Dieter", "Croupier", 36)
    var rainer: CasinoEmployees = CasinoEmployees(1,"Rainer", "Croupier", 48)
    var ernst: CasinoEmployees = CasinoEmployees(1,"Ernst", "Croupier", 31)
    rouletteAtTable1.printInfo()

    println("")

    var rouletteAtTable2: RouletteTable = RouletteTable(2, "Sascha", 0.00, 500000.00, 1000.00, 10000.00)                       //Vorbereitung für den zweiten Tisch
    var sascha: CasinoHighRollerEmployees = CasinoHighRollerEmployees(2, "Sascha", "Croupier", 45)
    var christian: CasinoHighRollerEmployees = CasinoHighRollerEmployees(2,"Christian", "Croupier", 57)
    rouletteAtTable2.printInfo()

    var rouletteGames: RouletteGames = RouletteGames(1)                         //Instanziierung der RouletteGames an Tisch 1
    var rouletteGamesHighRoller: RouletteHighRoller = RouletteHighRoller(2)     //Instanziierung der RouletteGames an Tisch 2

    var klaus: CasinoPlayer = CasinoPlayer(1, "Klaus", 500.00, true, 0.01,23)
    var tatjana: CasinoPlayer = CasinoPlayer(1, "Tatjana", 500.00, true, 0.01,59)
    var mike: CasinoPlayer = CasinoPlayer(1, "Mike", 500.00, true, 0.02,45)
    var salva: CasinoPlayer = CasinoPlayer(1, "Salva", 500.00, false, 0.04,71)
    var claudia: CasinoPlayer = CasinoPlayer(1, "Claudia", 500.00, false, 0.03,26)
    var enrico: CasinoPlayer = CasinoPlayer(1,"Enrico", 50.00, false, 0.00, 19)

    var gonzales: CasinoPlayer = CasinoPlayer(2, "Gonzales", 10000.00, true, 0.1, 26,true)
    var silvio: CasinoPlayer = CasinoPlayer(2, "Silvio", 10000.00, true, 0.08, 65,true)

    val entrance : CasinoEntranceControl = CasinoEntranceControl()
    val playersWantEntrance: MutableList<CasinoPlayer> = mutableListOf(klaus, tatjana, enrico, mike, salva, claudia)
    val players: MutableList<CasinoPlayer> = mutableListOf()
    val playersHighRoller: MutableList<CasinoPlayer> = mutableListOf(gonzales, silvio)
    val croupiers: MutableList<CasinoEmployees> = mutableListOf(rainer, ernst, dieter)
    val highRollerCroupiers : MutableList<CasinoHighRollerEmployees> = mutableListOf(christian, sascha)

    println("")
    println("Hier wird die ${FontColors.RED.type}Einlasskontrolle${FontColors.COLOREND.type} durchgeführt und das Alter geprüft")
    for (player in playersWantEntrance) {
        entrance.entranceControl(player, players)
    }

    println("")
    println("${FontColors.YELLOW.type}Tisch Nummer ${rouletteAtTable1.tableNumber}${FontColors.COLOREND.type}")
    for (player in players) {
        player.introduce()
    }

    println("")
    println("${FontColors.YELLOW.type}Tisch Nummer ${rouletteAtTable2.tableNumber}${FontColors.COLOREND.type}")
    for (player in playersHighRoller) {
        player.introduce()
    }

    println("")

    do {
        rouletteAtTable1.goPlay(players, rouletteGames, rouletteAtTable1)
        rouletteAtTable1.removePlayerWithNoMoney(players)

        rouletteAtTable2.goPlayHighRoller(playersHighRoller, rouletteGamesHighRoller, rouletteAtTable2)
        rouletteAtTable2.removePlayerHighRollerWithNoMoney(playersHighRoller)

        round++
        dieter.changeCroupier(croupiers, rouletteAtTable1)
        roundHighRoller++
        sascha.changeHighRollerCroupier(highRollerCroupiers, rouletteAtTable2)

    } while (goOn1 || goOn2)

        println("${FontColors.RED.type}´`´`´`´`´`´`´`´`´`´`´`´``´`´`´`´`´`´`´`´`´`´`´``´`´`´`´`´`´`´`´")
        println("| Alle Spieler haben ihr Geld verspielt, das Spiel ist vorbei |")
        println("´`´`´`´`´`´`´`´`´`´`´`´``´`´`´`´`´`´`´`´`´`´`´``´`´`´`´`´`´`´`´${FontColors.COLOREND.type}")

}