import kotlin.math.round

class RouletteTable(tableNumber: Int, var groupierName: String, var tipForEmployees: Double, var bankTable: Double): Casino(tableNumber){

   /* init {
        println("Das Roulette wurde mit der Tisch Nr. $tableNumber instanziiert")
    }*/

    constructor(tableNumber: Int, groupierName: String, tipForEmployees: Double): this(tableNumber, groupierName, tipForEmployees, 100000.00){

       // println("Das Roulette für Tisch Nr. $tableNumber wurde mit dem sekundären Konstruktor instanziiert")

    }
    fun printInfo(){
        print("Tischnummer: $tableNumber ")
        print("Groupiername: $groupierName ")
        print("Trinkgeldkasse : $tipForEmployees€ ")
        println("Bank am Tisch : $bankTable€")
    }

    fun countBank(){
        println("In der Bank am Roulettetisch $tableNumber befinden sich insgesamt $bankTable€")
    }

    fun countTip(){
        println("In der Trinkgeldkasse am Roulettetisch $tableNumber befinden sich insgesamt ${ round(tipForEmployees*100) /100}€")
    }

    fun rollingNumbers(): Int {
        return (0..36).random()

    }

    fun infoOfNumbers(rouletteNumbers: Int){
        when {
            (rouletteNumbers in first) -> { print("Die Zahl liegt im ersten Drittel zwischen 1-12")
            }
            (rouletteNumbers in second) -> { print("Die Zahl liegt im zweiten Drittel zwischen 13-24")
            }
            (rouletteNumbers in third) -> { print("Die Zahl liegt im dritten Drittel zwischen 25-36")
            }
        }
        when {
            (rouletteNumbers in firstHalf) -> { print(" und in der ersten Hälfte zwischen 1-18")
            }
            (rouletteNumbers in secondHalf) -> print(" und in der zweiten Hälfte zwischen 19-36")
        }
        when {
            (rouletteNumbers in blackNumbers) -> { print(" sie ist schwarz")
            }
            (rouletteNumbers in redNumbers) -> { print(" sie ist rot")
            }
        }
        when {
            (rouletteNumbers in numberIsEven) -> { print(" und gerade")
            }
            (rouletteNumbers in numberIsNotEven) -> { print(" und ungerade")
            }
            (rouletteNumbers in specialNumber) -> { print("Die Zahl ist Zero")
            }
        }
    }


}