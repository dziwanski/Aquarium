package Spices

import sun.security.provider.ConfigFile

fun main(args: Array<String>) {
    val curry = Curry("Spicy", "mild")
    println(curry.color)


    val spiceCabinet = listOf(
        SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))
    for(element in spiceCabinet) println(element.label)

}

class SimpleSpice {
    val name: String = "curry"
    private val spiciness: String = "mild"

    val heat: Int
        get() = when(spiciness){ "mild" -> 5 else -> 0}
}

sealed class Spice(val name: String, private val spiciness: String = "mild", color: SpiceColor): SpiceColor by color{

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

    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor): Spice(name, spiciness, color), Grinder {

    override fun grind() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder{
    fun grind()
}


interface SpiceColor{
    val color: Color
}

object YellowSpiceColor: SpiceColor{
    override val color: Color = Color.YELLOW
}

data class SpiceContainer(val spice: Spice){
    val label = spice.name
}

enum class Color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}
