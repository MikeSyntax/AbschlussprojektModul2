import kotlin.math.round

class RouletteTable(tableNumber: Int, var groupierName: String, var tipForEmployees: Double, var bankTable: Double): Casino(tableNumber) {

    /* init {
        println("Das Roulette wurde mit der Tisch Nr. $tableNumber instanziiert")
    }*/

    constructor(tableNumber: Int, groupierName: String, tipForEmployees: Double) : this(
        tableNumber,
        groupierName,
        tipForEmployees,
        100000.00
    ) {

        // println("Das Roulette für Tisch Nr. $tableNumber wurde mit dem sekundären Konstruktor instanziiert")

    }

    //Methode zur Ausgabe aller Infos über den Roulettetisch
    fun printInfo() {
        print("Tischnummer: $tableNumber ")
        print("Groupiername: $groupierName ")
        print("Trinkgeldkasse : $tipForEmployees€ ")
        println("Bank am Tisch : $bankTable€")
    }

    //Methode zum Anzeigen des Standes der Bank am Roulettetisch
    fun countBank() {
        println("In der Bank am Roulettetisch $tableNumber befinden sich insgesamt $bankTable€")
    }

    //Methode zum Anzeigen der Trinkgeldkasse
    fun countTip() {
        println("In der Trinkgeldkasse am Roulettetisch $tableNumber befinden sich insgesamt ${round(tipForEmployees * 100) / 100}€")
    }

    //Methode zum Roulette Rad, die Kugel soll rollen und random eine Zahl auswählen
    fun rollingNumbers(): Int {
        return (0..36).random()
    }

    //Hauptmethode zum Spielen mit Eingabe des Spieler welches Spiel, mit Ausdruck der Zahl und der Liste mit den letzten 10 Zahlen und zurücksetzen der der Variablen mit den gespeicherten Spielerwahlen
    fun goPlay(players: List<CasinoPlayer>, rouletteGames: RouletteGames, rouletteTable: RouletteTable) {

        for (player in players) {
            rouletteGames.games(
                player,
                rouletteTable
            )                           //Willkommen alle Spieler am Roulettetisch 1 und bitte eine Auswahl treffen
            println("")
        }

        println("==================================")
        print("Nichts geht mehr")
        var rouletteNumber =
            rouletteTable.rollingNumbers()                     //das Rouletterad am Tisch 1 dreht sich und gibt eine zufällige Zahl als tableNumber zurück welche in der Klasse Roulette ermittelt wird
        println(" und es ist die $rouletteNumber")
        println("==================================")

        rouletteTable.infoOfNumbers(rouletteNumber)                             //Methode für die Rückmeldung ob die Zahl rot/schwarz oder gerade/ungerade usw. ist
        println("\n")
        rouletteNumbers(getInfo(rouletteNumber))                                //Hinzufügen der Nummer zur Liste der letzen 10 Zahlen wobei die 1 rausfällt und die neue Zahl ans Ende gesetzt wird
        println("Anzeige der letzten 10 Zahlen, ")
        printNumbers(listOfLastNumbers)                                         //Anzeigen der bearbeiteten Liste untereinander
        println("")

        for (player in players) {
            println(
                "${player.name} hat ${
                    player.getWin(
                        rouletteNumber,
                        rouletteTable
                    )
                }"
            )      //Gewinne jedes einzelnen Spielers prüfen
        }

        println("")
        rouletteTable.countBank()                                               //Aufrufen der Methode über den Stand der Bank
        rouletteTable.countTip()                                                //Aufrufen der Methode über den Stand der Trinkgeldkasse für die Angestellten
        println("")
        println("Machen Sie Ihre Einsätze, neues Spiel, neues Glück")

        for (player in players) {
            player.reset()                                                      //zurücksezten der Variablen in CasinoPlayer für das neue Spiel
        }

        println("")
    }

    //Hauptmethode zum Spielen des Highroller Tisches mit Eingabe des Spieler welches Spiel, mit Ausdruck der Zahl und der Liste mit den letzten 10 Zahlen und zurücksetzen der der Variablen mit den gespeicherten Spielerwahlen
    fun goPlayHighroler(players: List<CasinoPlayer>, rouletteGames: RouletteGames, rouletteTable: RouletteTable) {

        for (player in players) {
            rouletteGames.games(
                player,
                rouletteTable
            )                           //Willkommen alle Spieler am Roulettetisch 1 und bitte eine Auswahl treffen
            println("")
        }

        println("==================================")
        print("Nichts geht mehr")
        var rouletteNumber =
            rouletteTable.rollingNumbers()                     //das Rouletterad am Tisch 1 dreht sich und gibt eine zufällige Zahl als tableNumber zurück welche in der Klasse Roulette ermittelt wird
        println(" und es ist die $rouletteNumber")
        println("==================================")

        rouletteTable.infoOfNumbers(rouletteNumber)                             //Methode für die Rückmeldung ob die Zahl rot/schwarz oder gerade/ungerade usw. ist
        println("\n")
        rouletteNumbers(getInfo(rouletteNumber))                                //Hinzufügen der Nummer zur Liste der letzen 10 Zahlen wobei die 1 rausfällt und die neue Zahl ans Ende gesetzt wird
        println("Anzeige der letzten 10 Zahlen, ")
        printNumbers(listOfLastNumbers)                                         //Anzeigen der bearbeiteten Liste untereinander
        println("")

        for (player in players) {
            println(
                "${player.name} hat ${
                    player.getWin(
                        rouletteNumber,
                        rouletteTable
                    )
                }"
            )      //Gewinne jedes einzelnen Spielers prüfen
        }

        println("")
        rouletteTable.countBank()                                               //Aufrufen der Methode über den Stand der Bank
        rouletteTable.countTip()                                                //Aufrufen der Methode über den Stand der Trinkgeldkasse für die Angestellten
        println("")
        println("Machen Sie Ihre Einsätze, neues Spiel, neues Glück")

        for (player in players) {
            player.reset()                                                      //zurücksezten der Variablen in CasinoPlayer für das neue Spiel
        }

        println("")
    }

    fun changeGroupier(groupiers: List<CasinoEmployees>, rouletteTable: RouletteTable) {
        if (round == 10) {
            var newGroupier = groupiers.random()
            println("============================================================================================")
            println("Achtung es findet ein Groupierwechsel statt, bitte keine Einsätze im Moment")
            println("Willkommen im Casino am Tisch ${rouletteTable.tableNumber} mein Name ist ${newGroupier.name} und ich bin für die nächsten Runden Ihr ")
            println("============================================================================================")
            round = 0
        }
    }


    fun removePlayerWithNoMoney(players: MutableList<CasinoPlayer>) {                                           //Schleife falls ein Spieler kein Geld mehr hat
        var removePlayer = players.filter { player -> player.cash <= 0 }

        for (player in removePlayer) {
            println("===============================================================")
            println("${player.name} hat kein Geld mehr und muss den Tisch verlassen")
            println("===============================================================\n")
            players.remove(player)
            printListInfoAfterRemoving(players)
        }
        if (players.isEmpty()) {
            goOn1 = false
            println("Alle Spieler an Tisch 1 haben kein Geld mehr!")
        }
    }

    fun printListInfoAfterRemoving(players: List<CasinoPlayer>) {
        println("Folgende Spieler verbleiben")
        for (player in players) {
            println("${player.name}")
        }
    }

    //Die Liste wird mit dieser Schleife untereinander ausgegeben
    fun printNumbers(list: List<String>) {
        for (number in list) {
            println(number)
        }
    }

    //Funktion rot/schwarz gerade/ungerade und zero - Info aus der Map unter NumberInfo.kt
    fun getNumberInfo(number: Int): NumberInfo? {
        return numberInfoMap[number]
    }

    //Funktion Rot oder Schwarz die Info abholen und entsprechende Ausgabe
    fun getInfo(rouletteNumber: Int): String {
        val numberInfo = getNumberInfo(rouletteNumber)
        if (numberInfo != null) {
            val zero = if (rouletteNumber == 0) "Zero" else ""
            val evenOrNot = if (numberInfo.isEven) "pair" else "impair"
            val redOrBlack = if (numberInfo.isRed) "rouge" else "noir"
            return ("$rouletteNumber: $evenOrNot, $redOrBlack, $zero")
        } else {
            return "Ungültige Zahl"
        }
    }

    //Liste mit den gefallenen Kugeln plus die neue und die erste wird entfernt
    fun rouletteNumbers(getInfo: String): MutableList<String> {
        listOfLastNumbers.add(getInfo)
        listOfLastNumbers.removeFirst()                                  //Änderung mit if > 10 ersten Eintrag entfernen
        return listOfLastNumbers
    }

    fun infoOfNumbers(rouletteNumbers: Int) {
        when {
            (rouletteNumbers in first) -> {
                print("Die Zahl liegt im ersten Drittel zwischen 1-12")
            }

            (rouletteNumbers in second) -> {
                print("Die Zahl liegt im zweiten Drittel zwischen 13-24")
            }

            (rouletteNumbers in third) -> {
                print("Die Zahl liegt im dritten Drittel zwischen 25-36")
            }
        }
        when {
            (rouletteNumbers in firstHalf) -> {
                print(" und in der ersten Hälfte zwischen 1-18")
            }

            (rouletteNumbers in secondHalf) -> print(" und in der zweiten Hälfte zwischen 19-36")
        }
        when {
            (rouletteNumbers in blackNumbers) -> {
                print(" sie ist schwarz")
            }

            (rouletteNumbers in redNumbers) -> {
                print(" sie ist rot")
            }
        }
        when {
            (rouletteNumbers in numberIsEven) -> {
                print(" und gerade")
            }

            (rouletteNumbers in numberIsNotEven) -> {
                print(" und ungerade")
            }

            (rouletteNumbers in specialNumber) -> {
                print("Die Zahl ist Zero")
            }
        }
    }

    fun removePlayerHighrollerWithNoMoney(playersHighroller: MutableList<CasinoPlayer>) {                                           //Schleife falls ein Spieler kein Geld mehr hat
        var removePlayer = playersHighroller.filter { player -> player.cash <= 0 }

        for (player in removePlayer) {
            println("===============================================================")
            println("${player.name} hat kein Geld mehr und muss den Tisch verlassen")
            println("===============================================================\n")
            playersHighroller.remove(player)
            printListInfoAfterRemovingHighroller(playersHighroller)
        }
        if (playersHighroller.isEmpty()) {
            goOn1 = false
            println("Alle Spieler an Tisch 2 haben kein Geld mehr!")
        }
    }

    fun printListInfoAfterRemovingHighroller(playersHighroller: List<CasinoPlayer>) {
        println("Folgende Spieler verbleiben")
        for (player in playersHighroller) {
            println("${player.name}")
        }
    }
}