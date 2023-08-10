fun main(){
    println("")
    var rouletteAtTable1: RouletteTable = RouletteTable(1,"Klaus Dieter",0.00)
    var klausDieter: CasinoEmployees = CasinoEmployees(1, "Klaus Dieter","Groupier",36)
    rouletteAtTable1.printInfo()
    println("")
    var rouletteAtTable2: RouletteTable = RouletteTable(2,"Sascha Grammel",0.00, 500000.00)                       //Vorbereitung für den zweiten Tisch
    var sascha: CasinoEmployees = CasinoEmployees(2, "Sascha Grammel","Groupier",45)
    rouletteAtTable2.printInfo()
    var rouletteGamesHighroller: RouletteGamesHighroller = RouletteGamesHighroller(2)
    var rouletteGames: RouletteGames = RouletteGames(1)             //Instanziierung der RouletteGames an Tisch 1
    var klaus: CasinoPlayer = CasinoPlayer(1,"Klaus", 600.00, true, 0.01)
    var tatjana: CasinoPlayer = CasinoPlayer(1,"Tatjana", 500.00, true, 0.01)
    var mike: CasinoPlayer = CasinoPlayer(1,"Mike", 750.00, true, 0.02)
    var salva: CasinoPlayer = CasinoPlayer(1,"Salva", 800.00, false, 0.04)
    var claudia: CasinoPlayer = CasinoPlayer(1,"Claudia", 1000.00, false,0.03)

    var gonzales: CasinoPlayer = CasinoPlayer(2,"Gonzales", 100000.00, true, 0.1,true)
    val players = mutableListOf(klaus,tatjana,mike,salva,claudia)
    val playersHighroller = mutableListOf(gonzales)
    println("")

    for (player in players) {
        player.introduce()
    }
    for (player in playersHighroller){
        player.introduce()
    }

    println("")

    do {
        rouletteAtTable1.goPlay(players, rouletteGames, rouletteAtTable1)
        rouletteAtTable2.goPlayHighroler(playersHighroller, rouletteGamesHighroller, rouletteAtTable2)
    } while (goOn == !false && klaus.cash >= 0 && tatjana.cash >= 0 &&
        mike.cash >= 0 && salva.cash >= 0 && claudia.cash >= 0 && gonzales.cash >= 0)


    println("")
}