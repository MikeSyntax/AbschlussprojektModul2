var listOfLastNumbers: MutableList<String> = mutableListOf("23: impair, rouge", "15: impair, noir", "7: impair, rouge", "28: pair, noir", "25: impair, rouge", "2: pair, noir", "25: impair, rouge", "24: pair, noir", "24: pair, noir", "4: pair, noir")

//Die Liste wird mit dieser Schleife untereinander ausgegeben
fun printNumbers(list: List<String>) {
    for (number in list){
        println(number)
    }
}
//Funktion rot/schwarz gerade/ungerade und zero - Info aus der Map
fun getNumberInfo(number: Int): NumberInfo? {
    return numberInfoMap[number]
}
//Funktion Rot oder Schwarz die Info abholen und entsprechende Ausgabe
fun getInfo(tableNumber: Int) : String {
    val numberInfo = getNumberInfo(tableNumber)
    if (numberInfo != null) {
        val zero = if (tableNumber == 0) "Zero" else ""
        val evenOrNot = if (numberInfo.isEven) "pair" else "impair"
        val redOrBlack = if (numberInfo.isRed) "rouge" else "noir"
        val print = ("$tableNumber: $evenOrNot, $redOrBlack, $zero")
        return print
    } else {
        return "Ungültige Zahl"
    }
}
//Liste mit den gefallenen Kugeln plus die neue und die erste wird entfernt
fun rouletteNumbers(getInfo: String) : MutableList <String> {
    listOfLastNumbers.add(getInfo)
    listOfLastNumbers.removeFirst()                                  //Änderung mit if > 10 ersten Eintrag entfernen
    return listOfLastNumbers
}