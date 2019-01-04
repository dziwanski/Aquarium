package Aquarium

open class Book(var title: String, var author: String){

    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
    }
}

class EBook(): Book(){
    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
    }
}