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
//Globale Variablen
//val zahlen: List<Int> = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36)
val first: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
val second: List<Int> = listOf(13,14,15,16,17,18,19,20,21,22,23,24)
val third: List<Int> = listOf(25,26,27,28,29,30,31,32,33,34,35,36)
val firstHalf: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18)
val secondHalf: List<Int> = listOf(19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36)
var blackNumbers: List<Int> = listOf(2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35)
var redNumbers: List<Int> = listOf(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36)
var numberIsEven: List<Int> = listOf(2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36)
var numberIsNotEven: List<Int> = listOf(1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35)
val specialNumber: List<Int> = listOf(0)


fun infoOfNumbers(tableNumbers: Int){
    when {
        (tableNumbers in first) -> { print("Die Zahl liegt im ersten Drittel 1-12")
        }
        (tableNumbers in second) -> { print("Die Zahl liegt im zweiten Drittel 13-24")
        }
        (tableNumbers in third) -> { print("Die Zahl liegt im dritten Drittel 25-36")
        }
    }
    when {
        (tableNumbers in firstHalf) -> { print(" und in der ersten Hälfte 1-18")
        }
        (tableNumbers in secondHalf) -> print(" und in der zweiten Hälfte 19-36")
    }
    when {
        (tableNumbers in blackNumbers) -> { print(" sie ist schwarz")
        }
        (tableNumbers in redNumbers) -> { print(" sie ist rot")
        }
    }
    when {
        (tableNumbers in numberIsEven) -> { print(" und gerade")
        }
        (tableNumbers in numberIsNotEven) -> { print(" und ungerade")
        }
        (tableNumbers in specialNumber) -> { print("Die Zahl ist Zero")
        }
    }
}