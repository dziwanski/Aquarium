package Aquarium

class Shark: AquariumFish(), FishAction {
    override fun eat() {
        println("hunt and eat fish")
    }

    override val color: String = "gray"
}

class Plecosomus: AquariumFish(), FishAction {
    override fun eat() {
        println("munch on algae")
    }

    override val color: String = "gold"
}
