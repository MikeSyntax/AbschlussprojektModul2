data class NumberInfo(val isEven: Boolean, val isRed: Boolean, val isGreen: Boolean)
//Map mit rot, schwarz oder zero
val numberInfoMap = mapOf(
    0 to NumberInfo(false, false, true),
    1 to NumberInfo(false, true, false),
    2 to NumberInfo(true, false, false),
    3 to NumberInfo(false, true, false),
    4 to NumberInfo(true, false, false),
    5 to NumberInfo(false, true, false),
    6 to NumberInfo(true, false, false),
    7 to NumberInfo(false, true, false),
    8 to NumberInfo(true, false, false),
    9 to NumberInfo(false, true, false),
    10 to NumberInfo(true, false, false),
    11 to NumberInfo(false, false, false),
    12 to NumberInfo(true, true, false),
    13 to NumberInfo(false, false, false),
    14 to NumberInfo(true, true, false),
    15 to NumberInfo(false, false, false),
    16 to NumberInfo(true, true, false),
    17 to NumberInfo(false, false, false),
    18 to NumberInfo(true, true, false),
    19 to NumberInfo(false, true, false),
    20 to NumberInfo(true, false, false),
    21 to NumberInfo(false, true, false),
    22 to NumberInfo(true, false, false),
    23 to NumberInfo(false, true, false),
    24 to NumberInfo(true, false, false),
    25 to NumberInfo(false, true, false),
    26 to NumberInfo(true, false, false),
    27 to NumberInfo(false, true, false),
    28 to NumberInfo(true, false, false),
    29 to NumberInfo(false, false, false),
    30 to NumberInfo(true, true, false),
    31 to NumberInfo(false, false, false),
    32 to NumberInfo(true, true, false),
    33 to NumberInfo(false, false, false),
    34 to NumberInfo(true, true, false),
    35 to NumberInfo(false, false, false),
    36 to NumberInfo(true, true, false)
)





































/*
enum class NumberType {
    EVEN,
    ODD,
    RED,
    BLACK,
    GREEN
}

data class NumberInfoEnum(val type: NumberType)


// Map mit den Informationen zu den Nummern
val numberInfoMapEnum = mapOf(
    0 to NumberInfoEnum(NumberType.GREEN),   // Zero ist grün
    1 to NumberInfoEnum(NumberType.RED, NumberType.ODD),
    2 to NumberInfoEnum(NumberType.BLACK),
)

data class NumberInfobald(val type: NumberType)

// Map mit den Informationen zu den Nummern
val numberInfoMap = mapOf(
    0 to NumberInfobald(NumberType.GREEN),
    1 to NumberInfobald(NumberType.RED, NumberType.ODD),   // Nummer 1 ist rot und ungerade
    2 to NumberInfobald(NumberType.BLACK, NumberType.EVEN),*/