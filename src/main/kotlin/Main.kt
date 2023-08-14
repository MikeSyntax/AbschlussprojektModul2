fun main() {
    println("")
    println(
        "${FontColors.GREEN.type}          d8888b   d8888b  d88888b          d8888b     d8b    d8b   db  db   dD        \n" +
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
                "           Y888P   Y88888P    8b8   8d8    Y8888P  VP   V8P  VP   V8P     YP (immer!)${FontColors.COLOREND.type}\n" +
                "                                                                                         ")

    // Wartepause von 1 Sekunde
    Thread.sleep(1000)

    // Erstellung eines RouletteTable-Objekts für Tisch 1 mit Croupier Dieter
    var rouletteAtTable1: RouletteTable = RouletteTable(1, "Dieter", 0.00)

    // Erstellung von CasinoEmployees-Objekten für Croupiers Dieter, Rainer und Ernst
    var dieter: CasinoEmployees = CasinoEmployees(1, "Dieter", "Croupier", 36)
    var rainer: CasinoEmployees = CasinoEmployees(1, "Rainer", "Croupier", 48)
    var ernst: CasinoEmployees = CasinoEmployees(1, "Ernst", "Croupier", 31)

    // Ausgabe von Informationen über den Roulette-Tisch 1
    rouletteAtTable1.printInfo()

    // Ausgabe einer Leerzeile
    println("")

    // Erstellung eines RouletteTable-Objekts für Tisch 2 mit Croupier Sascha und vorbereiteten Geld- und Trinkgeldbeträgen
    var rouletteAtTable2: RouletteTable = RouletteTable(2, "Sascha", 0.00, 500000.00, 1000.00, 10000.00)

    // Erstellung von CasinoHighRollerEmployees-Objekten für Croupiers Sascha und Christian
    var sascha: CasinoHighRollerEmployees = CasinoHighRollerEmployees(2, "Sascha", "Croupier", 45)
    var christian: CasinoHighRollerEmployees = CasinoHighRollerEmployees(2, "Christian", "Croupier", 57)
    var siegfried: CasinoHighRollerEmployees = CasinoHighRollerEmployees(2, "Siegfried", "Croupier", 44)

    // Ausgabe von Informationen über den Roulette-Tisch 2
    rouletteAtTable2.printInfo()

    // Instanziierung eines RouletteGames-Objekts an Tisch 1
    var rouletteGames: RouletteGames = RouletteGames(1)

    // Instanziierung eines RouletteHighRoller-Objekts an Tisch 2
    var rouletteGamesHighRoller: RouletteHighRoller = RouletteHighRoller(2)

    // Erstellung von CasinoPlayer-Objekten für verschiedene Spieler
    var klaus: CasinoPlayer = CasinoPlayer(1, "Klaus", 500.00, true, 0.01, 23)
    var tatjana: CasinoPlayer = CasinoPlayer(1, "Tatjana", 500.00, true, 0.01, 59)
    var mike: CasinoPlayer = CasinoPlayer(1, "Mike", 500.00, true, 0.02, 45)
    var salva: CasinoPlayer = CasinoPlayer(1, "Salva", 500.00, false, 0.04, 71)
    var claudia: CasinoPlayer = CasinoPlayer(1, "Claudia", 500.00, false, 0.03, 26)
    var enrico: CasinoPlayer = CasinoPlayer(1, "Enrico", 50.00, false, 0.00, 19)

    // Erstellung von CasinoPlayer-Objekten für High Roller Spieler
    var gonzales: CasinoPlayer = CasinoPlayer(2, "Gonzales", 20000.00, true, 0.1, 26, true)
    var silvio: CasinoPlayer = CasinoPlayer(2, "Silvio", 20000.00, true, 0.08, 65, true)
    var daniel: CasinoPlayer = CasinoPlayer(2, "Daniel", 25000.00, true, 0.02, 34,true)

    // Erstellung eines CasinoEntranceControl-Objekts für die Einlasskontrolle
    val entrance: CasinoEntranceControl = CasinoEntranceControl()

    // Liste von CasinoPlayer-Objekten, die Einlass ins Casino wollen
    val playersWantEntrance: MutableList<CasinoPlayer> = mutableListOf(klaus, tatjana, enrico, mike, salva, claudia)

    // Leere Liste von CasinoPlayer-Objekten für den tatsächlichen Einlass
    val players: MutableList<CasinoPlayer> = mutableListOf()

    // Liste von High Roller CasinoPlayer-Objekten für den Einlass
    val playersHighRoller: MutableList<CasinoPlayer> = mutableListOf(gonzales, silvio, daniel)

    // Liste von CasinoEmployees-Objekten, die Croupiers am Tisch
    val croupiers: MutableList<CasinoEmployees> = mutableListOf(rainer, ernst, dieter)

    // Liste von High Roller CasinoHighRollerEmployees-Objekten für die High Roller Tische
    val highRollerCroupiers: MutableList<CasinoHighRollerEmployees> = mutableListOf(christian, siegfried, sascha)

    // Ausgabe einer Leerzeile
    println("")

    // Ausgabe einer Meldung über die Einlasskontrolle und Altersprüfung
    println("Hier wird die ${FontColors.RED.type}Einlasskontrolle${FontColors.COLOREND.type} durchgeführt und das Alter geprüft")

    // Schleife durch die Liste von Spielern, die Einlass wollen, und Aufruf der Einlasskontrolle
    for (player in playersWantEntrance) {
        entrance.entranceControl(player, players)
    }

    // Ausgabe einer Leerzeile
    println("")

    // Schleife durch die Liste von Spielern am Tisch 1 und Aufruf der introduce()-Methode
    println("${FontColors.YELLOW.type}Tisch Nummer ${rouletteAtTable1.tableNumber}${FontColors.COLOREND.type}")
    for (player in players) {
        player.introduce()
    }

    // Ausgabe einer Leerzeile
    println("")

    // Schleife durch die Liste von High Roller Spielern am Tisch 2 und Aufruf der introduce()-Methode
    println("${FontColors.YELLOW.type}Tisch Nummer ${rouletteAtTable2.tableNumber}${FontColors.COLOREND.type}")
    for (player in playersHighRoller) {
        player.introduce()
    }

    // Ausgabe einer Leerzeile
    println("")

    // Schleife, die das Spiel abwickelt, solange goOn1 oder goOn2 wahr ist
    do {
        // Spielen am Tisch 1
        rouletteAtTable1.goPlay(players, rouletteGames, rouletteAtTable1)
        // Entfernen von Spielern ohne Geld am Tisch 1
        rouletteAtTable1.removePlayerWithNoMoney(players)

        // Spielen am High Roller Tisch 2
        rouletteAtTable2.goPlayHighRoller(playersHighRoller, rouletteGamesHighRoller, rouletteAtTable2)
        // Entfernen von High Roller Spielern ohne Geld am Tisch 2
        rouletteAtTable2.removePlayerHighRollerWithNoMoney(playersHighRoller)

        // Erhöhen der Runde am Tisch 1
        round++
        // Ändern des Croupiers am Tisch 1
        dieter.changeCroupier(croupiers, rouletteAtTable1)

        // Erhöhen der Runde am High Roller Tisch 2
        roundHighRoller++
        // Ändern des High Roller Croupiers am Tisch 2
        sascha.changeHighRollerCroupier(highRollerCroupiers, rouletteAtTable2)

        // Die Schleife wird ausgeführt, solange goOn1 oder goOn2 wahr ist
    } while (goOn1 || goOn2)

    println("")
    // Ausgabe einer Meldung, wenn das Spiel vorbei ist
    println("${FontColors.RED.type}´`´`´`´`´`´`´`´`´`´`´`´``´`´`´`´`´`´`´`´`´`´`´``´`´`´`´`´`´`´`´")
    println("| Alle Spieler haben ihr Geld verspielt, das Spiel ist vorbei |")
    println("´`´`´`´`´`´`´`´`´`´`´`´``´`´`´`´`´`´`´`´`´`´`´``´`´`´`´`´`´`´`´${FontColors.COLOREND.type}")
}
