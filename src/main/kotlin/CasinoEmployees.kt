class CasinoEmployees(tableNumber: Int, var name: String, var job: String, var age: Int): RouletteGames(tableNumber){
    init {
        println("Willkommen im Casino am Tisch $tableNumber mein Name ist $name und ich bin heute ihr $job")
    }


}