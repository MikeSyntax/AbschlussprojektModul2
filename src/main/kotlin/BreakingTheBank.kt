// Definition der Klasse BreakingTheBank, welche von der Casino Klasse erbt mit dem Parameter tableNumber
class BreakingTheBank(tableNumber: Int): Casino(tableNumber){

    // Funktion, um zu prüfen, ob die Bank am Tisch 1 pleite ist
    fun breakingBank1(rouletteTable: RouletteTable, players: MutableList<CasinoPlayer>) {
        if (rouletteTable.bankTable <= 0) {  // Wenn der Bankbetrag kleiner oder gleich null ist
            bankHasMoney1 = false            // Setze die Bank-Kontrollvariable für Tisch 1 auf false
            players.removeAll(players)       // Entferne alle Spieler von Tisch 1
            println("${FontColors.YELLOW.type}------------------------------------------------------")
            println("     Die Bank an Roulette Tisch${FontColors.COLOREND.type} ${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type} ${FontColors.YELLOW.type}wurde gesprengt\n" +
                    "           und das Spiel ist hier zu Ende\n" +
                    "          alle Spieler verlassen den Tisch")
            println("------------------------------------------------------${FontColors.COLOREND.type}")
        }
    }

    // Funktion, um zu prüfen, ob die Bank am High Roller Tisch 2 pleite ist
    fun breakingBank2(rouletteTable: RouletteTable, playersHighRoller: MutableList<CasinoPlayer>) {
        if (rouletteTable.bankTable <= 0) {  // Wenn der Bankbetrag kleiner oder gleich null ist
            bankHasMoney2 = false            // Setze die Bank-Kontrollvariable für Tisch 2 auf false
            playersHighRoller.removeAll(playersHighRoller)  // Entferne alle High Roller Spieler von Tisch 2
            println("${FontColors.YELLOW.type}------------------------------------------------------")
            println("     Die Bank an Roulette Tisch${FontColors.COLOREND.type} ${FontColors.BLUE.type}$tableNumber${FontColors.COLOREND.type} ${FontColors.YELLOW.type}wurde gesprengt\n" +
                    "          und das Spiel ist hier zu Ende\n" +
                    "         alle Spieler verlassen den Tisch")
            println("------------------------------------------------------${FontColors.COLOREND.type}")
        }
    }
}
