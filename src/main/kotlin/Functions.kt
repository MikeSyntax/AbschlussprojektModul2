
//Die Liste wird mit dieser Schleife untereinander ausgegeben
fun printNumbers(list: List<String>) {
    for (number in list){
        println(number)
    }
}
//Funktion rot/schwarz gerade/ungerade und zero - Info aus der Map unter NumberInfo.kt
fun getNumberInfo(number: Int): NumberInfo? {
    return numberInfoMap[number]
}
//Funktion Rot oder Schwarz die Info abholen und entsprechende Ausgabe
fun getInfo(rouletteNumber: Int) : String {
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
fun rouletteNumbers(getInfo: String) : MutableList <String> {
    listOfLastNumbers.add(getInfo)
    listOfLastNumbers.removeFirst()                                  //Änderung mit if > 10 ersten Eintrag entfernen
    return listOfLastNumbers
}