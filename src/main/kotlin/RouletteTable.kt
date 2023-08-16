// Import der round-Funktion aus dem Kotlin-Math-Modul
import kotlin.math.round

// Definition der Klasse RouletteTable, die von der Klasse Casino erbt
class RouletteTable(tableNumber: Int, var croupierName: String, var tipForEmployees: Double, var bankTable: Double, var minEinsatz: Double, var maximalerEinsatz: Double): Casino(tableNumber) {

    /*
    Kommentierte Zeilen im Klassen-Initializer (init-Block).
    Die folgenden Zeilen sind auskommentiert und werden nicht ausgeführt:
    */
    /* init {
        println("Das Roulette wurde mit der Tisch Nr. $tableNumber instanziiert")
    }*/

    // Sekundärer Konstruktor, der den primären Konstruktor aufruft und fehlende Parameter mit Standardwerten füllt
    constructor(tableNumber: Int, croupierName: String, tipForEmployees: Double) : this(tableNumber, croupierName, tipForEmployees, 100000.00, 10.00, 1000.00) {

        // Kommentierte Zeile innerhalb des sekundären Konstruktors
        // println("Das Roulette für Tisch Nr. $tableNumber wurde mit dem sekundären Konstruktor instanziiert")

    }

    // Methode zur Ausgabe aller Informationen über den Roulettetisch
    fun printInfo() {
        // Ausgabe der Tischnummer mit gelber Schriftfarbe
        println("Roulette Tisch: ${FontColors.BLUE.type}$tableNumber")
        println("-----------------${FontColors.COLOREND.type}")
        Thread.sleep(500)
        // Ausgabe des Croupier-Namens mit gelber Schriftfarbe
        println("Croupier Name: ${FontColors.YELLOW.type}$croupierName${FontColors.COLOREND.type}")
        Thread.sleep(500)
        // Ausgabe des Trinkgeldbetrags für Mitarbeiter mit gelber Schriftfarbe
        println("Trinkgeldkasse : ${FontColors.YELLOW.type}$tipForEmployees€${FontColors.COLOREND.type}")
        Thread.sleep(500)
        // Ausgabe des Bankbetrags am Tisch mit gelber Schriftfarbe
        println("Bank am Tisch : ${FontColors.YELLOW.type}$bankTable€${FontColors.COLOREND.type}")
        Thread.sleep(500)
        // Ausgabe des Mindesteinsatzes mit gelber Schriftfarbe und Pause
        print("Mindesteinsatz: ${FontColors.YELLOW.type}$minEinsatz€${FontColors.COLOREND.type} und ")
        Thread.sleep(500)
        // Ausgabe des Maximaleinsatzes mit gelber Schriftfarbe
        println("Maximaleinsatz: ${FontColors.YELLOW.type}$maximalerEinsatz€${FontColors.COLOREND.type}")
        // Verzögerung der Ausführung für 1000 Millisekunden (1 Sekunde)
        Thread.sleep(1000)
    }

    // Methode zum Anzeigen des Standes der Bank am Roulettetisch
    fun countBank() {
        // Ausgabe des Bankstands am Roulettetisch mit roter Schriftfarbe
        println("In der Bank am Roulette Tisch ${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type} befinden sich insgesamt ${FontColors.RED.type}$bankTable€${FontColors.COLOREND.type}")
    }

    // Methode zum Anzeigen der Trinkgeldkasse
    fun countTip() {
        // Berechnung des Trinkgeldbetrags auf zwei Dezimalstellen gerundet
        val roundedTip = round(tipForEmployees * 100) / 100
        // Ausgabe des Trinkgeldstands am Roulettetisch mit roter Schriftfarbe
        println("In der Trinkgeldkasse am Roulette Tisch ${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type} befinden sich insgesamt ${FontColors.RED.type}$roundedTip€${FontColors.COLOREND.type}")
    }

    // Methode zum Roulette Rad, die Kugel soll rollen und random eine Zahl auswählen
    fun rollingNumbers(): Int {
        // Generiere eine zufällige Zahl zwischen 0 und 36 (einschließlich)
        return (0..36).random()
    }

    // Hauptmethode zum Spielen mit Eingabe der Spieler welches Spiel, mit Ausdruck der Zahl und der Liste mit den letzten 10 Zahlen und zurücksetzen der Variablen mit der gespeicherten Spielerauswahl
    fun goPlay(players: MutableList<CasinoPlayer>, rouletteGames: RouletteGames, rouletteTable: RouletteTable) {

        // Schleife, um die Spieler durch das Spiel zu führen
        for (player in players) {
            rouletteGames.games(player, rouletteTable)  // Aufruf der Methode, um das Spiel für jeden Spieler zu starten
            println("")
        }

        println("===========================================")
        print("${FontColors.GREEN.type}Nichts geht mehr")
        // Das Roulette-Rad am Tisch dreht sich und gibt eine zufällige Zahl zurück
        var rouletteNumber = rouletteTable.rollingNumbers()
        print(" und es ist die ")

            print(".")
            Thread.sleep(500)
            print(".")
            Thread.sleep(500)
            print(".")
            Thread.sleep(500)
            print(".")
            Thread.sleep(500)
            print(".")
            Thread.sleep(500)
            print(".")
            Thread.sleep(500)
            print(".")
            Thread.sleep(500)
            print(".")
            Thread.sleep(500)
            print(".")
            Thread.sleep(500)

        println("$rouletteNumber${FontColors.COLOREND.type}")
        println("===========================================")

        // Aufruf einer Methode zur Anzeige von Informationen über die gezogene Zahl
        rouletteTable.infoOfNumbers(rouletteNumber)
        println("\n")

        // Hinzufügen der gezogenen Zahl zur Liste der letzten 10 Zahlen und Anzeigen der Liste
        rouletteNumbers1(getInfo(rouletteNumber))
        println("${FontColors.YELLOW.type}Anzeige der letzten 10 Zahlen an Roulette Tisch${FontColors.COLOREND.type} ${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type}")
        printNumbers(listOfLastNumbers1)
        println("")

        // Überprüfung der Gewinne für jeden Spieler
        for (player in players) {
            println("${player.name} hat ${player.getWin(rouletteNumber, rouletteTable)}")
        }

        println("")
        rouletteTable.countBank()  // Anzeige des Bankstands
        rouletteTable.countTip()   // Anzeige des Trinkgeldstands für Angestellte
        println("")
        println("${FontColors.GREEN.type}Machen Sie Ihre Einsätze, neues Spiel, neues Glück${FontColors.COLOREND.type}")

        // Zurücksetzen der Spielerdaten für das nächste Spiel
        for (player in players) {
            player.reset()
        }
        println("")
    }

    // Hauptmethode zum Spielen des HighRoller Tisches mit Eingabe des Spielers welches Spiel, mit Ausdruck der Zahl und der Liste mit den letzten 10 Zahlen und zurücksetzen der Variablen mit den gespeicherten Spielerwahlen
    fun goPlayHighRoller(
        playersHighRoller: MutableList<CasinoPlayer>,
        rouletteGamesHighRoller: RouletteGames,
        rouletteTable: RouletteTable
    ) {

        // Schleife, um die HighRoller-Spieler durch das Spiel zu führen
        for (player in playersHighRoller) {
            rouletteGamesHighRoller.games(
                player,
                rouletteTable
            )  // Aufruf der Methode, um das Spiel für jeden HighRoller-Spieler zu starten
            println("")
        }

        println("===========================================")
        print("${FontColors.GREEN.type}Nichts geht mehr")
        // Das Roulette-Rad am Tisch dreht sich und gibt eine zufällige Zahl zurück
        var rouletteNumber = rouletteTable.rollingNumbers()
        print(" und es ist die ")

        print(".")
        Thread.sleep(500)
        print(".")
        Thread.sleep(500)
        print(".")
        Thread.sleep(500)
        print(".")
        Thread.sleep(500)
        print(".")
        Thread.sleep(500)
        print(".")
        Thread.sleep(500)
        print(".")
        Thread.sleep(500)
        print(".")
        Thread.sleep(500)
        print(".")
        Thread.sleep(500)

        println("$rouletteNumber${FontColors.COLOREND.type}")
        println("===========================================")
        // Aufruf einer Methode zur Anzeige von Informationen über die gezogene Zahl
        rouletteTable.infoOfNumbers(rouletteNumber)
        println("\n")

        // Hinzufügen der gezogenen Zahl zur Liste der letzten 10 Zahlen und Anzeigen der Liste
        rouletteNumbers2(getInfo(rouletteNumber))
        println("${FontColors.YELLOW.type}Anzeige der letzten 10 Zahlen an Roulette Tisch${FontColors.COLOREND.type} ${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type}")
        printNumbers(listOfLastNumbers2)
        println("")

        // Überprüfung der Gewinne für jeden HighRoller-Spieler
        for (player in playersHighRoller) {
            println("${player.name} hat ${player.getWin(rouletteNumber, rouletteTable)}")
        }

        println("")
        rouletteTable.countBank()  // Anzeige des Bankstands
        rouletteTable.countTip()   // Anzeige des Trinkgeldstands für Angestellte
        println("")
        println("${FontColors.GREEN.type}Machen Sie Ihre Einsätze, neues Spiel, neues Glück${FontColors.COLOREND.type}")

        // Zurücksetzen der Spielerdaten für das nächste Spiel
        for (player in playersHighRoller) {
            player.reset()
        }

        println("")
    }

    // Methode zum Entfernen von Spielern ohne Geld aus der Liste der HighRoller-Spieler
    fun removePlayerWithNoMoney(players: MutableList<CasinoPlayer>) {
        // Filtern der Spieler, die kein Geld mehr haben
        var removePlayer = players.filter { player -> player.cash <= 0 }

        // Schleife, um Spieler ohne Geld zu entfernen
        for (player in removePlayer) {
            println("${FontColors.YELLOW.type}====================================================================")
            println("${FontColors.COLOREND.type}${FontColors.BLUE.type}${player.name}${FontColors.COLOREND.type}${FontColors.YELLOW.type} hat kein Geld mehr und muss den Roulette Tisch ${FontColors.COLOREND.type}${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type}${FontColors.YELLOW.type} verlassen")
            println("====================================================================${FontColors.COLOREND.type}\n")
            players.remove(player)
            // Ausgabe der Liste der verbleibenden Spieler nach Entfernen
            printListInfoAfterRemoving(players)
        }

        // Überprüfung, ob keine Spieler mehr übrig sind, aber die Ausgabe nur wenn die Bank nicht pleite war
        if (players.isEmpty() && bankHasMoney1) {
            goOn1 = false
            println("${FontColors.RED.type}|––––––––––––––––––––––––––--–––––––––––--------––--––––-|")
            println("| Alle Spieler an Roulette Tisch ${FontColors.COLOREND.type}${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type}${FontColors.RED.type} haben kein Geld mehr! |")
            println("|––––––––––––––––––––––––––--–––––––––––––-––---------––-|${FontColors.COLOREND.type}")
            println("")
        }
    }

    // Methode zur Ausgabe der verbleibenden Spieler nach Entfernen von Spielern ohne Geld
    fun printListInfoAfterRemoving(players: MutableList<CasinoPlayer>) {
        println("Folgende Spieler verbleiben")
        println("---------------------------")
        println("")
        for (player in players) {
            println(player.name)
            Thread.sleep(500)
            println("")
        }
    }

    // Methode zur Ausgabe einer Liste von Elementen untereinander
    fun printNumbers(list: MutableList<String>) {
        for (number in list) {
            println(number)
        }
    }

    // Funktion zur Rückgabe von Informationen (rot/schwarz, gerade/ungerade, zero) aus der Map "numberInfoMap" basierend auf der gezogenen Zahl
    fun getNumberInfo(number: Int): NumberInfo? {
        return numberInfoMap[number]
    }

    // Funktion zur Abfrage von Informationen (rot/schwarz und gerade/ungerade) basierend auf der gezogenen Zahl und Rückgabe der entsprechenden Ausgabe
    fun getInfo(rouletteNumber: Int): String {
        // Abfrage von Informationen (rot/schwarz und gerade/ungerade) aus der Map "numberInfoMap"
        val numberInfo = getNumberInfo(rouletteNumber)
        if (numberInfo != null) {
            // Bestimmen, ob die Zahl gerade oder ungerade ist
            val evenOrNot = if (numberInfo.isEven) "pair" else "impair"
            // Bestimmen, ob die Zahl rot oder schwarz ist
            val redOrBlack = if (numberInfo.isRed) "${FontColors.RED.type}rouge${FontColors.COLOREND.type}" else "noir"
            // Rückgabe der formatierten Information
            return ("$rouletteNumber: $evenOrNot, $redOrBlack")
        } else {
            // Bestimmen, ob die Zahl eine Zero ist
            val zero = if (rouletteNumber == 0) "${FontColors.GREEN.type}Zero${FontColors.COLOREND.type}" else ""
            // Rückgabe der formatierten Information
            return ("$rouletteNumber: $zero")
        }
    }

    // Funktion zum Aktualisieren der Liste mit gefallenen Kugeln, wobei die erste entfernt wird, wenn mehr als 10 Elemente vorhanden sind
    fun rouletteNumbers1(getInfo: String): MutableList<String> {
        // Hinzufügen der neuen Information zur Liste
        listOfLastNumbers1.add(getInfo)
        // Überprüfen, ob die Liste mehr als 10 Elemente enthält, und entfernen des ersten Elements
        if (listOfLastNumbers1.size > 10) {
            listOfLastNumbers1.removeFirst()
        }
        // Rückgabe der aktualisierten Liste
        return listOfLastNumbers1
    }

    // Funktion zum Aktualisieren der HighRoller-Liste mit gefallenen Kugeln, wobei die erste entfernt wird, wenn mehr als 10 Elemente vorhanden sind
    fun rouletteNumbers2(getInfo: String): MutableList<String> {
        // Hinzufügen der neuen Information zur HighRoller-Liste
        listOfLastNumbers2.add(getInfo)
        // Überprüfen, ob die HighRoller-Liste mehr als 10 Elemente enthält, und entfernen des ersten Elements
        if (listOfLastNumbers2.size > 10) {
            listOfLastNumbers2.removeFirst()
        }
        // Rückgabe der aktualisierten HighRoller-Liste
        return listOfLastNumbers2
    }

    // Funktion zur Ausgabe von Informationen über die gezogene Zahl basierend auf verschiedenen Kriterien (Drittel, Hälfte, Farbe, gerade/ungerade)
    fun infoOfNumbers(rouletteNumbers: Int) {
        // Überprüfen, ob die gezogene Zahl im ersten Drittel liegt
        when {
            (rouletteNumbers in first) -> {
                // Ausgabe, wenn die Zahl im ersten Drittel liegt
                print("Die Zahl liegt ${FontColors.YELLOW.type}im 1. Drittel${FontColors.COLOREND.type} zwischen 1-12")
            }
            // Überprüfen, ob die gezogene Zahl im zweiten Drittel liegt
            (rouletteNumbers in second) -> {
                // Ausgabe, wenn die Zahl im zweiten Drittel liegt
                print("Die Zahl liegt ${FontColors.YELLOW.type}im 2. Drittel${FontColors.COLOREND.type} zwischen 13-24")
            }
            // Überprüfen, ob die gezogene Zahl im dritten Drittel liegt
            (rouletteNumbers in third) -> {
                // Ausgabe, wenn die Zahl im dritten Drittel liegt
                print("Die Zahl liegt ${FontColors.YELLOW.type}im 3. Drittel${FontColors.COLOREND.type} zwischen 25-36")
            }
        }

        // Überprüfen, ob die Zahl in der ersten Hälfte liegt
        when {
            (rouletteNumbers in firstHalf) -> {
                // Ausgabe, wenn die Zahl in der ersten Hälfte liegt
                print(" und in der ${FontColors.YELLOW.type}1. Hälfte${FontColors.COLOREND.type} zwischen 1-18")
            }
            // Überprüfen, ob die Zahl in der zweiten Hälfte liegt
            (rouletteNumbers in secondHalf) -> {
                // Ausgabe, wenn die Zahl in der zweiten Hälfte liegt
                print(" und in der ${FontColors.YELLOW.type}2. Hälfte${FontColors.COLOREND.type} zwischen 19-36")
            }
        }

        // Überprüfen, ob die Zahl eine schwarze Zahl ist
        when {
            (rouletteNumbers in blackNumbers) -> {
                // Ausgabe, wenn die Zahl schwarz ist
                print(" sie ist ${FontColors.YELLOW.type}schwarz${FontColors.COLOREND.type}")
            }
            // Überprüfen, ob die Zahl eine rote Zahl ist
            (rouletteNumbers in redNumbers) -> {
                // Ausgabe, wenn die Zahl rot ist
                print(" sie ist ${FontColors.RED.type}rot${FontColors.COLOREND.type}")
            }
        }

        // Überprüfen, ob die Zahl gerade ist
        when {
            (rouletteNumbers in numberIsEven) -> {
                // Ausgabe, wenn die Zahl gerade ist
                print(" und ${FontColors.YELLOW.type}gerade${FontColors.COLOREND.type}")
            }
            // Überprüfen, ob die Zahl ungerade ist
            (rouletteNumbers in numberIsNotEven) -> {
                // Ausgabe, wenn die Zahl ungerade ist
                print(" und ${FontColors.YELLOW.type}ungerade${FontColors.COLOREND.type}")
            }
            // Überprüfen, ob die Zahl die spezielle Zahl Zero ist
            (rouletteNumbers in specialNumber) -> {
                // Ausgabe, wenn die Zahl Zero ist
                print("Die Zahl ist ${FontColors.GREEN.type}Zero${FontColors.COLOREND.type}")
            }
        }
    }

    // Methode zum Entfernen von HighRoller-Spielern ohne Geld aus der Liste
    fun removePlayerHighRollerWithNoMoney(playersHighRoller: MutableList<CasinoPlayer>) {
        // Filtern der Spieler, die kein Geld mehr haben
        var removePlayer = playersHighRoller.filter { player -> player.cash <= 0 }

        // Schleife zum Durchgehen der zu entfernenden Spieler
        for (player in removePlayer) {
            // Ausgabe einer Trennlinie und Meldung für den Spieler, der den Tisch verlassen muss
            println("${FontColors.YELLOW.type}====================================================================")
            println("${FontColors.COLOREND.type}${FontColors.BLUE.type}${player.name}${FontColors.COLOREND.type}${FontColors.YELLOW.type} hat kein Geld mehr und muss den Roulette Tisch ${FontColors.COLOREND.type}${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type}${FontColors.YELLOW.type} verlassen")
            println("====================================================================${FontColors.COLOREND.type}\n")

            // Entfernen des Spielers aus der Liste
            playersHighRoller.remove(player)
            // Ausgabe der verbleibenden HighRoller-Spieler nach Entfernen
            printListInfoAfterRemovingHighRoller(playersHighRoller)
        }

        // Überprüfen, ob keine HighRoller-Spieler mehr übrig sind, aber die Ausgabe nur, wenn die Bank nicht pleite war
        if (playersHighRoller.isEmpty() && bankHasMoney2) {
            // Setzen der Variable goOn2 auf false, um das Spiel zu beenden
            goOn2 = false
            // Ausgabe einer Meldung, dass alle Spieler kein Geld mehr haben
            println("${FontColors.RED.type}|––––––––––––––––––––––––––--–––––––––––-–--------–-––––-|")
            println("| Alle Spieler an Roulette Tisch ${FontColors.COLOREND.type}${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type}${FontColors.RED.type} haben kein Geld mehr! |")
            println("|––––––––––––––––––––––––––--–––––––––––––-––---------––-|${FontColors.COLOREND.type}")
            println("")
        }
    }

    // Methode zur Ausgabe der verbleibenden HighRoller-Spieler nach Entfernen von Spielern ohne Geld
    fun printListInfoAfterRemovingHighRoller(playersHighRoller: MutableList<CasinoPlayer>) {
        // Ausgabe einer Überschrift und Trennlinie
        println("Folgende Spieler verbleiben")
        println("---------------------------")
        println("")

        // Schleife zum Durchgehen der verbleibenden HighRoller-Spieler und Ausgabe ihrer Namen
        for (player in playersHighRoller) {
            println(player.name)
            Thread.sleep(500)
            println("")

        }
    }
}