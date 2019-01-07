package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    val size: Int

    init {
        println("init 1")
    }

    constructor(): this(true,9){
        println("running secondary constructor")
    }

    init {
        println("init 2")
    }
    init {
        size = if (friendly) volumeNeeded
        else volumeNeeded * 2
    }

    init {
        println("init 3")
    }
}

fun makeDefaultFish() = Fish(true, 50)


fun fishExample() {
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}