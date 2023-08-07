class Player(val name: String, var cash: Double, var drink: Boolean) {

    init {
        println("Der Spieler $name wurde initialisiert. $name hat $cash € und er hat ein Getränk $drink")
    }


    fun introduce(){
        println("Hallo, ich bin $name")
    }
}