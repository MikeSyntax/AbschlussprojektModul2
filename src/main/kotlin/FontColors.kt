// Definition des Enumerations FontColors zur Darstellung von Farbcodes in der Konsole
enum class FontColors(val type: String) {
    RED("\u001B[31m"),      // Roter Text
    GREEN("\u001B[32m"),    // Grüner Text
    YELLOW("\u001B[33m"),   // Gelber Text
    BLUE("\u001B[94m"),     // Blauer Text
    COLOREND("\u001B[0m"),  // Beenden der Farbeinstellungen
}

/*
   Die folgenden Zeilen sind nur zur Veranschaulichung des Farbschemas
   und wurden auskommentiert, um den Code nicht zu beeinflussen.

   Verwendung der Farbcodes:
   ${FontColors.RED.type}   - Roter Text
   ${FontColors.GREEN.type} - Grüner Text
   ${FontColors.YELLOW.type}- Gelber Text
   ${FontColors.BLUE.type}- Blauer Text
   ${FontColors.COLOREND.type} - Beenden der Farbeinstellungen
*/
