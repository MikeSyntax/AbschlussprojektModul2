import kotlin.math.round

class RouletteTable(tableNumber: Int, var croupierName: String, var tipForEmployees: Double, var bankTable: Double, var minEinsatz: Double, var maximalerEinsatz: Double): Casino(tableNumber) {

    /* init {
        println("Das Roulette wurde mit der Tisch Nr. $tableNumber instanziiert")
    }*/

    constructor(tableNumber: Int, croupierName: String, tipForEmployees: Double) : this(tableNumber, croupierName, tipForEmployees, 100000.00, 10.00, 1000.00) {

        // println("Das Roulette für Tisch Nr. $tableNumber wurde mit dem sekundären Konstruktor instanziiert")

    }

    //Methode zur Ausgabe aller Informationen über den Roulettetisch
    fun printInfo() {
        println("Tischnummer: ${FontColors.YELLOW.type}$tableNumber${FontColors.COLOREND.type}")
        println("Croupier Name: ${FontColors.YELLOW.type}$croupierName${FontColors.COLOREND.type}")
        println("Trinkgeldkasse : ${FontColors.YELLOW.type}$tipForEmployees€${FontColors.COLOREND.type}")
        println("Bank am Tisch : ${FontColors.YELLOW.type}$bankTable€${FontColors.COLOREND.type}")
        print("Mindesteinsatz: ${FontColors.YELLOW.type}$minEinsatz€${FontColors.COLOREND.type} und ")
        println("Maximaleinsatz: ${FontColors.YELLOW.type}$maximalerEinsatz€${FontColors.COLOREND.type}")
        Thread.sleep(1000)
    }

    //Methode zum Anzeigen des Standes der Bank am Roulettetisch
    fun countBank() {
        println("In der Bank am Roulettetisch $tableNumber befinden sich insgesamt ${FontColors.RED.type}$bankTable€${FontColors.COLOREND.type}")
    }

    //Methode zum Anzeigen der Trinkgeldkasse
    fun countTip() {
        println("In der Trinkgeldkasse am Roulettetisch $tableNumber befinden sich insgesamt ${FontColors.RED.type}${round(tipForEmployees * 100) / 100}€${FontColors.COLOREND.type}")
    }

    //Methode zum Roulette Rad, die Kugel soll rollen und random eine Zahl auswählen
    fun rollingNumbers(): Int {
        return (0..36).random()
    }

    //Hauptmethode zum Spielen mit Eingabe der Spieler welches Spiel, mit Ausdruck der Zahl und der Liste mit den letzten 10 Zahlen und zurücksetzen der Variablen mit der gespeicherten Spielerauswahl
    fun goPlay(players: MutableList<CasinoPlayer>, rouletteGames: RouletteGames, rouletteTable: RouletteTable) {

        for (player in players) {
            rouletteGames.games(player, rouletteTable)                           //Willkommen alle Spieler am Roulettetisch 1 und bitte eine Auswahl treffen
            println("")
        }

        println("==================================")
        print("${FontColors.GREEN.type}Nichts geht mehr")
        var rouletteNumber = rouletteTable.rollingNumbers()                     //das Roulette Rad am Tisch 1 dreht sich und gibt eine zufällige Zahl als tableNumber zurück, welche in der Klasse Roulette ermittelt wird
        println(" und es ist die $rouletteNumber${FontColors.COLOREND.type}")
        println("==================================")

        rouletteTable.infoOfNumbers(rouletteNumber)                             //Methode für die Rückmeldung, ob die Zahl rot/schwarz oder gerade/ungerade usw. ist
        println("\n")
        rouletteNumbers1(getInfo(rouletteNumber))                                //Hinzufügen der Nummer zur Liste der letzten 10 Zahlen wobei die 1 rausfällt und die neue Zahl ans Ende gesetzt wird
        println("${FontColors.YELLOW.type}Anzeige der letzten 10 Zahlen an Tisch $tableNumber${FontColors.COLOREND.type}")
        printNumbers(listOfLastNumbers1)                                         //Anzeigen der bearbeiteten Liste untereinander
        println("")

        for (player in players) {
            println("${player.name} hat ${player.getWin(rouletteNumber, rouletteTable)}")      //Gewinne jedes einzelnen Spielers prüfen
        }

        println("")
        rouletteTable.countBank()                                               //Aufrufen der Methode über den Stand der Bank
        rouletteTable.countTip()                                                //Aufrufen der Methode über den Stand der Trinkgeldkasse für die Angestellten
        println("")
        println("${FontColors.GREEN.type}Machen Sie Ihre Einsätze, neues Spiel, neues Glück${FontColors.COLOREND.type}")

        for (player in players) {
            player.reset()                                                      //zurücksetzen der Variablen in CasinoPlayer für das neue Spiel
        }
        println("")

    }

    //Hauptmethode zum Spielen des HighRoller Tisches mit Eingabe des Spielers welches Spiel, mit Ausdruck der Zahl und der Liste mit den letzten 10 Zahlen und zurücksetzen der Variablen mit den gespeicherten Spielerwahlen
    fun goPlayHighRoller(playersHighRoller: MutableList<CasinoPlayer>, rouletteGamesHighRoller: RouletteGames, rouletteTable: RouletteTable) {

        for (player in playersHighRoller) { rouletteGamesHighRoller.games(player, rouletteTable)                           //Willkommen alle Spieler am Roulettetisch 1 und bitte eine Auswahl treffen
            println("")
        }

        println("==================================")
        print("${FontColors.GREEN.type}Nichts geht mehr")
        var rouletteNumber = rouletteTable.rollingNumbers()                     //das Rouletterad am Tisch 1 dreht sich und gibt eine zufällige Zahl als tableNumber zurück welche in der Klasse Roulette ermittelt wird
        println(" und es ist die $rouletteNumber${FontColors.COLOREND.type}")
        println("==================================")

        rouletteTable.infoOfNumbers(rouletteNumber)                             //Methode für die Rückmeldung, ob die Zahl rot/schwarz oder gerade/ungerade usw. ist
        println("\n")
        rouletteNumbers2(getInfo(rouletteNumber))                                //Hinzufügen der Nummer zur Liste der letzten 10 Zahlen wobei die 1 rausfällt und die neue Zahl ans Ende gesetzt wird
        println("${FontColors.YELLOW.type}Anzeige der letzten 10 Zahlen an Tisch $tableNumber${FontColors.COLOREND.type}")
        printNumbers(listOfLastNumbers2)                                         //Anzeigen der bearbeiteten Liste untereinander
        println("")

        for (player in playersHighRoller) {
            println("${player.name} hat ${player.getWin(rouletteNumber, rouletteTable)}")      //Gewinne jedes einzelnen Spielers prüfen
        }

        println("")
        rouletteTable.countBank()                                               //Aufrufen der Methode über den Stand der Bank
        rouletteTable.countTip()                                                //Aufrufen der Methode über den Stand der Trinkgeldkasse für die Angestellten
        println("")
        println("${FontColors.GREEN.type}Machen Sie Ihre Einsätze, neues Spiel, neues Glück${FontColors.COLOREND.type}")

        for (player in playersHighRoller) {
            player.reset()                                                      //zurücksetzen der Variablen in CasinoPlayer für das neue Spiel
        }

        println("")
    }



    fun removePlayerWithNoMoney(playersHighRoller: MutableList<CasinoPlayer>) {                                           //Schleife, falls ein Spieler kein Geld mehr hat
        var removePlayer = playersHighRoller.filter { player -> player.cash <= 0 }

        for (player in removePlayer) {
            println("${FontColors.YELLOW.type}===============================================================")
            println("${player.name} hat kein Geld mehr und muss den Tisch verlassen")
            println("===============================================================${FontColors.COLOREND.type}\n")
            playersHighRoller.remove(player)
            printListInfoAfterRemoving(playersHighRoller)
        }
        if (playersHighRoller.isEmpty()) {
            goOn1 = false
            println("${FontColors.RED.type}|––––––––––––––––––––––––––--–––––––––––––-––––-|")
            println("| Alle Spieler an Tisch 1 haben kein Geld mehr! |")
            println("|––––––––––––––––––––––––––--–––––––––––––-––––-|${FontColors.COLOREND.type}")
            println("")
        }
    }

    fun printListInfoAfterRemoving(playersHighRoller: List<CasinoPlayer>) {
        println("Folgende Spieler verbleiben")
        println("---------------------------")
        println("")
        for (player in playersHighRoller) {
            println(player.name)
        }
    }

    //Die Liste wird mit dieser Schleife untereinander ausgegeben
    fun printNumbers(list: List<String>) {
        for (number in list) {
            println(number)
        }
    }

    //Funktion rot/schwarz gerade/ungerade und zero - Informationen aus der Map unter NumberInfo
    fun getNumberInfo(number: Int): NumberInfo? {
        return numberInfoMap[number]
    }

    //Funktion rot/schwarz und gerade/ungerade, die Informationen abholen und entsprechende Ausgabe
    fun getInfo(rouletteNumber: Int): String {
        val numberInfo = getNumberInfo(rouletteNumber)
        if (numberInfo != null) {
            val evenOrNot = if (numberInfo.isEven) "pair" else "impair"
            val redOrBlack = if (numberInfo.isRed) "${FontColors.RED.type}rouge${FontColors.COLOREND.type}" else "noir"
            return ("$rouletteNumber: $evenOrNot, $redOrBlack")
        } else {
            val zero = if (rouletteNumber == 0) "${FontColors.GREEN.type}Zero${FontColors.COLOREND.type}" else ""
            return ("$rouletteNumber: $zero")
        }
    }

    //Liste mit den gefallenen Kugeln plus die neue und die erste wird entfernt
    fun rouletteNumbers1(getInfo: String): MutableList<String> {
        listOfLastNumbers1.add(getInfo)
        listOfLastNumbers1.removeFirst()                                  //Änderung mit if > 10 ersten Eintrag entfernen
        return listOfLastNumbers1
    }

    //HighRollerListe mit den gefallenen Kugeln plus die neue und die erste wird entfernt
    fun rouletteNumbers2(getInfo: String): MutableList<String> {
        listOfLastNumbers2.add(getInfo)
        listOfLastNumbers2.removeFirst()                                  //Änderung mit if > 10 ersten Eintrag entfernen
        return listOfLastNumbers2
    }

    fun infoOfNumbers(rouletteNumbers: Int) {
        when {
            (rouletteNumbers in first) -> {
                print("Die Zahl liegt ${FontColors.YELLOW.type}im 1. Drittel${FontColors.COLOREND.type} zwischen 1-12")
            }

            (rouletteNumbers in second) -> {
                print("Die Zahl liegt ${FontColors.YELLOW.type}im 2. Drittel${FontColors.COLOREND.type} zwischen 13-24")
            }

            (rouletteNumbers in third) -> {
                print("Die Zahl liegt ${FontColors.YELLOW.type}im 3. Drittel${FontColors.COLOREND.type} zwischen 25-36")
            }
        }
        when {
            (rouletteNumbers in firstHalf) -> {
                print(" und in der ${FontColors.YELLOW.type}1. Hälfte${FontColors.COLOREND.type} zwischen 1-18")
            }

            (rouletteNumbers in secondHalf) -> {
                print(" und in der ${FontColors.YELLOW.type}2. Hälfte${FontColors.COLOREND.type} zwischen 19-36")
            }
        }
        when {
            (rouletteNumbers in blackNumbers) -> {
                print(" sie ist ${FontColors.YELLOW.type}schwarz${FontColors.COLOREND.type}")
            }

            (rouletteNumbers in redNumbers) -> {
                print(" sie ist ${FontColors.YELLOW.type}rot${FontColors.COLOREND.type}")
            }
        }
        when {
            (rouletteNumbers in numberIsEven) -> {
                print(" und ${FontColors.YELLOW.type}gerade${FontColors.COLOREND.type}")
            }

            (rouletteNumbers in numberIsNotEven) -> {
                print(" und ${FontColors.YELLOW.type}ungerade${FontColors.COLOREND.type}")
            }

            (rouletteNumbers in specialNumber) -> {
                print("Die Zahl ist ${FontColors.YELLOW.type}Zero${FontColors.COLOREND.type}")
            }
        }
    }

    fun removePlayerHighRollerWithNoMoney(playersHighRoller: MutableList<CasinoPlayer>) {                                           //Schleife, falls ein Spieler kein Geld mehr hat
        var removePlayer = playersHighRoller.filter { player -> player.cash <= 0 }

        for (player in removePlayer) {
            println("${FontColors.YELLOW.type}===============================================================")
            println("${player.name} hat kein Geld mehr und muss den Tisch verlassen")
            println("===============================================================${FontColors.COLOREND.type}\n")
            playersHighRoller.remove(player)
            printListInfoAfterRemovingHighRoller(playersHighRoller)
        }
        if (playersHighRoller.isEmpty()) {
            goOn2 = false
            println("${FontColors.RED.type}|––––––––––––––––––––––––––--–––––––––––––-––––-|")
            println("| Alle Spieler an Tisch 2 haben kein Geld mehr! |")
            println("|––––––––––––––––––––––––––--–––––––––––––-––––-|${FontColors.COLOREND.type}")
            println("")

        }
    }

    fun printListInfoAfterRemovingHighRoller(playersHighRoller: List<CasinoPlayer>) {
        println("Folgende Spieler verbleiben")
        println("---------------------------")
        println("")
        for (player in playersHighRoller) {
            println(player.name)
        }
    }
}