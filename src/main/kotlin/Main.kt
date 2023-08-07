fun main(){

    var rouletteAtTable1: Roulette = Roulette(1,"Klaus Dieter", 0.00, 500000.00)
    var klaus: MitarbeiterCasino = MitarbeiterCasino("Klaus Dieter", "Groupier", 45)

    println("")

    var rouletteAtTable2: Roulette = Roulette(2,"Sascha Grammel", 0.00)
    var sascha: MitarbeiterCasino = MitarbeiterCasino("Sascha Grammel", "Groupier", 34)

    println("")

    rouletteAtTable1.printInfo()

    println("")

    rouletteAtTable2.printInfo()

    println("")

    rouletteAtTable1.countTip()
    rouletteAtTable1.countBank()

    println("")
}