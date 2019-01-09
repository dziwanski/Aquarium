package Aquarium

import kotlin.math.PI

open class Aquarium(var length: Int = 100,
                    var width: Int = 20,
                    var height: Int = 40) {

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {height = (value * 1_000) / (width * length)}

    open var water = volume * 0.9

    constructor(numberOfFish: Int): this() {
        val water = numberOfFish * 2000
        val tank = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }

}

class TowerTank(): Aquarium() {
    override var water = volume * 0.8
    override var volume: Int
        get() = (width * height * length / 1_000 * PI).toInt()
        set(value) { height = (value * 1_000) / (width * length)}
}

fun String.hasSpaces(): Boolean{
    val found = this.find{it == ' '}
    return found != null
}

fun String.hasSpaces2() = find { it == ' ' } != null

fun extensionsExample(){
    "Does it have spaces?".hasSpaces()
}

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int): AquariumPlant("Green", size)

fun AquariumPlant.isRed() = color == "Red"

fun AquariumPlant.print() = println("AquariumPlant")

fun GreenLeafyPlant.print() = kotlin.io.println("GreenLeafyPlant")

fun staticExample() {
    val plant = GreenLeafyPlant(size = 50)
    plant.print()

    val aquariumPlant: AquariumPlant = plant

}
