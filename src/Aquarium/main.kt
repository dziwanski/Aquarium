package Aquarium

fun main(args: Array<String>) {
    buildAquarium()

    val simpleSpice = SimpleSpice()
    println("Name: ${simpleSpice.name}\n" +
            "Heat: ${simpleSpice.heat}")

    val listOfSpice: List<Spice> = listOf(
        Spice("Oregano"),
        Spice("Kminek", "lagodne"),
        Spice("Ostra Papryka", "extremely spicy"),
        Spice("Srednia Papryka", "hot"))

    val listOfMoreSpicy = listOfSpice.filter { it.heat > 3 }
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length}" +
            "Width: ${myAquarium.width}" +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")

    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} liters with")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Small Aquarium: ${myAquarium2.volume} liters with " +
            "length ${myAquarium2.length} " +
            "width ${myAquarium2.width} " +
            "height ${myAquarium2.height}")
}