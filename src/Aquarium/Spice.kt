package Aquarium

class SimpleSpice {
    val name: String = "curry"
    private val spiciness: String = "mild"

    val heat: Int
        get() = when(spiciness){ "mild" -> 5 else -> 0}
}

class Spice(name: String, val spiciness: String = "mild"){

    init {
        println("Name: $name, spiciness: $spiciness, it is number: $heat")
    }

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }

}

fun makeSalt() = Spice("Salt")