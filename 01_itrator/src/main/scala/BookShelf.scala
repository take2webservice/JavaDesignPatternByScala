package engineer.dame.iterator.design_pattern
class BookShelf(maxsize: Int) extends Aggregate[Book] {
  private val books: Array[Book] = new Array[Book](maxsize)
  private var last: Int = 0

  def appendBook(book: Book): Unit = {
    if (this.last >= this.books.length) throw new Exception(s"this shelf can contain ${this.books.length}. now contains ${this.last} books")
    this.books(last) = book
    this.last += 1
  }

  def getLength(): Int = this.last

  def getBookAt(index: Int): Option[Book] = {
    if (index > this.books.length) throw new Exception(s"index out of bounds. specified index is ${index}, books length is ${this.books.length}")
    if (this.books(index) != null) Some(this.books(index))
    else None
  }

  def iterator(): Iterator[Book] = new BookShelfIterator(this)
}