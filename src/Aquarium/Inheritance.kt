package Aquarium

fun main(args: Array<String>){
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishColor{
    val color: String
}

class Plecostomus(fishColor: FishColor = GoldColor):
    FishColor by fishColor,
    FishAction by PrintingFishAction("a loot of algae")

object GoldColor: FishColor{ // Singleton
    override val color: String = "gold"
}

object RedColor: FishColor{
    override val color: String = "red"
}

class PrintingFishAction(private val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}

interface AquariumAction{
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim(){
        println("swim")
    }
}

interface FishAction {
    fun eat()
}

abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}