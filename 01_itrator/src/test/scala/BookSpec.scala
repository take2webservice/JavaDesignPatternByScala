import org.scalatest._
import scala.util.Try
import engineer.dame.iterator.design_pattern.Book

class BookSpec extends FlatSpec with DiagrammedAssertions {

  "constructor " should "can accept non-empty string" in {
      val hasNameTry: Try[Book] = Try { new Book("bookName") }
      assert(hasNameTry.isSuccess)
      val nullBookTry = Try { new Book(null) }
      assert(nullBookTry.isFailure)
      val emptyBookTry = Try { new Book("") }
      assert(emptyBookTry.isFailure)
  }
  
  "function:getName" should "can return a book name" in {
      val bookName: String = "Design Pattern"
      val book: Book = new Book(bookName)
      assert(bookName === book.getName() )
  }
}