package Aquarium

fun main(args: Array<String>) {
    var book = Book("W. P.", "Tolkien", 1954)

    val (a,b,c) = book.getTitleAuthorYear()

    println("Here is your book $a, written by $b in $c")
}


open class Book(var title: String, var author: String, var year: Int){

    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
    }

    fun getTitleAndAuthor(): Pair<String, String> = Pair(title, author)
    fun getTitleAuthorYear(): Triple<String, String, Int> = Triple(title, author, year)
}

class EBook(title: String, author: String, var format: String = "text"): Book(title, author, 5){

    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
    }
}