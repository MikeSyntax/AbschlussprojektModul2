
// Eine Datenklasse NumberInfo, die Informationen über Gerade/Ungerade und Rot/Schwarz speichert
data class NumberInfo(val isEven: Boolean, val isRed: Boolean)

// Map mit Zuordnungen von Nummern zu NumberInfo-Objekten
val numberInfoMap = mapOf(
        1 to NumberInfo(false, true),    // Nummer 1: Ungerade, Rot
        2 to NumberInfo(true, false),
        3 to NumberInfo(false, true),
        4 to NumberInfo(true, false),
        5 to NumberInfo(false, true),
        6 to NumberInfo(true, false),
        7 to NumberInfo(false, true),
        8 to NumberInfo(true, false),
        9 to NumberInfo(false, true),
        10 to NumberInfo(true, false),
        11 to NumberInfo(false, false),
        12 to NumberInfo(true, true),
        13 to NumberInfo(false, false),
        14 to NumberInfo(true, true),
        15 to NumberInfo(false, false),
        16 to NumberInfo(true, true),
        17 to NumberInfo(false, false),
        18 to NumberInfo(true, true),
        19 to NumberInfo(false, true),
        20 to NumberInfo(true, false),
        21 to NumberInfo(false, true),
        22 to NumberInfo(true, false),
        23 to NumberInfo(false, true),
        24 to NumberInfo(true, false),
        25 to NumberInfo(false, true),
        26 to NumberInfo(true, false),
        27 to NumberInfo(false, true),
        28 to NumberInfo(true, false),
        29 to NumberInfo(false, false),
        30 to NumberInfo(true, true),
        31 to NumberInfo(false, false),
        32 to NumberInfo(true, true),
        33 to NumberInfo(false, false),
        34 to NumberInfo(true, true),
        35 to NumberInfo(false, false),
        36 to NumberInfo(true, true)
)