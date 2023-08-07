fun main(){

    var rouletteAtTable1: Roulette = Roulette(1,"Klaus Dieter", 0.00, 500000.00)
    var klausDieter: EmployeesCasino = EmployeesCasino("Klaus Dieter", "Groupier", 45)

    println("")

    var rouletteAtTable2: Roulette = Roulette(2,"Sascha Grammel", 0.00)
    var sascha: EmployeesCasino = EmployeesCasino("Sascha Grammel", "Groupier", 34)

    println("")

    rouletteAtTable1.printInfo()

    println("")

    rouletteAtTable2.printInfo()

    println("")

    rouletteAtTable1.countBank()
    rouletteAtTable1.countTip()

    println("")

    rouletteAtTable2.countBank()
    rouletteAtTable2.countTip()

    println("")

    var klaus: Player = Player("Klaus", 1000.00, true)
    var gamesIntro: GamesInRoulette = GamesInRoulette(1)
    gamesIntro.games(player, numbers)
    playerNumber(klaus)
    println("Das Rouletterad dreht sich, nichts geht mehr und es ist die ${rollingNumbers()}")

}