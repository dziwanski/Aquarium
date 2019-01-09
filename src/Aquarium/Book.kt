package Aquarium

import kotlin.contracts.contract

fun main(args: Array<String>) {
    var book = Book("W. P.", "Tolkien", 1954)

    val (a,b,c) = book.getTitleAuthorYear()

    println("Here is your book $a, written by $b in $c")

    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("Hamlet") })


    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)
}
var user: Int = 0
const val maximumBorrow: Int = 10

open class Book(var title: String, var author: String, var year: Int){

    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
    }

    fun getTitleAndAuthor(): Pair<String, String> = Pair(title, author)
    fun getTitleAuthorYear(): Triple<String, String, Int> = Triple(title, author, year)

    fun canBorrow() = user > 9

    fun printUrl() = Constants.BASE_URL + title +".html"


    companion object {
        const val baseUrl
    }

}

object Constants{
    const val BASE_URL = "URL Address"
}

class EBook(title: String, author: String, var format: String = "text"): Book(title, author, 5){

    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
    }
}