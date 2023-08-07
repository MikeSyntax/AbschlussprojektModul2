open class Roulette(tableNumber: Int, var groupierName: String, var tipForEmployees: Double, var bankTable: Double): Casino(tableNumber){

    init {
        println("Das Roulette wurde mit der Tisch Nr. $tableNumber instanziiert")
    }

    constructor(tableNumber: Int, groupierName: String, tipForEmployees: Double): this(tableNumber, groupierName, tipForEmployees, 100000.00){

        println("Das Roulette für Tisch Nr. $tableNumber wurde mit dem secondären Constructor instanziiert")

    }
    fun printInfo(){
        println("Tischnummer: $tableNumber")
        println("Groupiername: $groupierName")
        println("Trinkgeldkasse : $tipForEmployees€")
        println("Bank am Tisch : $bankTable€")
    }

    fun countBank(){
        println("In der Bank am Roulettetisch $tableNumber befinden sich insgesamt $bankTable€")
    }

    fun countTip(){
        println("In der Trinkgeldkasse am Roulettetisch $tableNumber befinden sich insgesamt $tipForEmployees€")
    }
}