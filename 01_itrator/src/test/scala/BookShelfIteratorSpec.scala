import org.scalatest._
import scala.util.Try
import engineer.dame.iterator.design_pattern.Book
import engineer.dame.iterator.design_pattern.BookShelf
import engineer.dame.iterator.design_pattern.BookShelfIterator

class BookShelfIteratorSpec extends FlatSpec with DiagrammedAssertions {
  "function:next" should "can return next book" in {
    val shelf = new BookShelf(2)
    val bookName = "book1"
    shelf.appendBook(new Book(bookName))
    val ite = new BookShelfIterator(shelf)
    val book1 = ite.next()
    assert(bookName == book1.get.getName())
    val nonBook = ite.next()
    assert(nonBook == None)
  }

  "function:hasNext" should "check can return next book?" in {
    val shelf = new BookShelf(2)
    shelf.appendBook(new Book("book1"))
    val ite = new BookShelfIterator(shelf)
    assert(ite.hasNext == true)
    val book1 = ite.next()
    assert(ite.hasNext == false)
  }
}