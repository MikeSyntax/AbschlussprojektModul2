enum class FontColors(val type: String) {
        RED("\u001B[31m"),
        GREEN("\u001B[32m"),
        YELLOW("\u001B[33m"),
        COLOREND("\u001B[0m")
    }



/*
${FontColors.RED.type}
${FontColors.GREEN.type}
${FontColors.YELLOW.type}

${FontColors.COLOREND.type}
*/