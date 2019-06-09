import org.scalatest._
import scala.util.Try
import engineer.dame.iterator.design_pattern.Book
import engineer.dame.iterator.design_pattern.BookShelf
import engineer.dame.iterator.design_pattern.Iterator

class BookShelfSpec extends FlatSpec with DiagrammedAssertions {

  "function:appendBook" should "can append Book (up to limit)" in {
      val bookshelf = new BookShelf(1)
      val firstAppend = Try{bookshelf.appendBook(new Book("book1"))}
      assert(firstAppend.isSuccess)
      val secodAppend = Try{bookshelf.appendBook(new Book("book2"))}
      assert(secodAppend.isFailure)
  }

  "function:getLength" should "can return total Books count" in {
      val bookshelf = new BookShelf(1)
      assert(bookshelf.getLength === 0)
      val firstAppend = Try{bookshelf.appendBook(new Book("book1"))}
      assert(bookshelf.getLength === 1)
  }

  "function: getBookAt " should "can return a book specified  with parameter" in {
      val bookshelf = new BookShelf(2)
      val book = new Book("book1")
      bookshelf.appendBook(book)
      assert(bookshelf.getBookAt(0).get.getName() == book.getName())
      assert(bookshelf.getBookAt(1) == None)
      val outOfIndex = Try{bookshelf.getBookAt(2)}
      assert(outOfIndex.isFailure)
  }

  "function: itrator " should "can return Itrator object with self" in {
      val bookshelf = new BookShelf(2)
      val bookName = "book1"
      val book = new Book(bookName)
      bookshelf.appendBook(book)
      val ite: Iterator[Book] = bookshelf.iterator()
      val iteratorBook: Option[Book] = ite.next()
      assert(bookName == iteratorBook.get.getName())
  }
}