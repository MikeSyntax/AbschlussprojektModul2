//Globale Variablen
// Definition von globalen Variablen für verschiedene Gruppen von Zahlen
val first: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10,11,12)           // Erste Gruppe von Zahlen (1-12)
val second: List<Int> = listOf(13,14,15,16,17,18,19,20,21,22,23,24)   // Zweite Gruppe von Zahlen (13-24)
val third: List<Int> = listOf(25,26,27,28,29,30,31,32,33,34,35,36)    // Dritte Gruppe von Zahlen (25-36)
val firstHalf: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18)   // Erste Hälfte der Zahlen (1-18)
val secondHalf: List<Int> = listOf(19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36)  // Zweite Hälfte der Zahlen (19-36)
var blackNumbers: List<Int> = listOf(2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35)   // Schwarze Zahlen
var redNumbers: List<Int> = listOf(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36)   // Rote Zahlen
var numberIsEven: List<Int> = listOf(2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36)   // Gerade Zahlen
var numberIsNotEven: List<Int> = listOf(1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35)   // Ungerade Zahlen
val specialNumber: List<Int> = listOf(0)   // Besondere Zahl (0)
var goOn1 = true   // Kontrollvariable 1
var goOn2 = true   // Kontrollvariable 2
var bankHasMoney1 = true    // Kontrollvariable 3
var bankHasMoney2 = true    // Kontrollvariable 4
var round = 0   // Runden-Zähler
var roundHighRoller = 0   // Zähler für HighRoller-Runden

// Liste der letzten 10 gespielten Zahlen für verschiedene Runden
var listOfLastNumbers1: MutableList<String> = mutableListOf("23: impair, ${FontColors.RED.type}rouge${FontColors.COLOREND.type}", "15: impair, noir", "7: impair, ${FontColors.RED.type}rouge${FontColors.COLOREND.type}", "28: pair, noir", "25: impair, ${FontColors.RED.type}rouge${FontColors.COLOREND.type}", "2: pair, noir", "25: impair, ${FontColors.RED.type}rouge${FontColors.COLOREND.type}", "24: pair, noir", "24: pair, noir", "4: pair, noir")
var listOfLastNumbers2: MutableList<String> = mutableListOf("25: impair, ${FontColors.RED.type}rouge${FontColors.COLOREND.type}", "24: pair, noir", "24: pair, noir", "4: pair, noir", "23: impair, ${FontColors.RED.type}rouge${FontColors.COLOREND.type}", "15: impair, noir", "7: impair, ${FontColors.RED.type}rouge${FontColors.COLOREND.type}", "28: pair, noir", "25: impair, ${FontColors.RED.type}rouge${FontColors.COLOREND.type}", "2: pair, noir")









//val numbers: List<Int> = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36)
