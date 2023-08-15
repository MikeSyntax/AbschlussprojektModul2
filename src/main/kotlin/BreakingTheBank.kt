class BreakingTheBank(tableNumber: Int): Casino(tableNumber){

    fun breakingBank1(rouletteTable: RouletteTable, players: MutableList<CasinoPlayer>) {
        if (rouletteTable.bankTable <= 0) {
            bankHasMoney1 = false
            players.removeAll(players)
            println("${FontColors.YELLOW.type}------------------------------------------------------")
            println("     Die Bank an Roulette Tisch${FontColors.COLOREND.type} ${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type} ${FontColors.YELLOW.type}wurde gesprengt\n" +
                    "           und das Spiel ist hier zu Ende\n" +
                    "          alle Spieler verlassen den Tisch")
            println("------------------------------------------------------${FontColors.COLOREND.type}")
        }
    }

    fun breakingBank2(rouletteTable: RouletteTable, playersHighRoller: MutableList<CasinoPlayer>) {
        if (rouletteTable.bankTable <= 0) {
            bankHasMoney2 = false
            playersHighRoller.removeAll(playersHighRoller)
            println("${FontColors.YELLOW.type}------------------------------------------------------")
            println("     Die Bank an Roulette Tisch${FontColors.COLOREND.type} ${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type} ${FontColors.YELLOW.type}wurde gesprengt\n" +
                    "          und das Spiel ist hier zu Ende\n" +
                    "         alle Spieler verlassen den Tisch")
            println("------------------------------------------------------${FontColors.COLOREND.type}")
        }
    }
}