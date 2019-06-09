package engineer.dame.iterator.design_pattern

class BookShelfIterator(shelf: BookShelf) extends Iterator[Book] {
  private var index: Int = 0
  def hasNext(): Boolean = this.index < this.shelf.getLength()
  def next(): Option[Book] = {
    val book: Option[Book] = this.shelf.getBookAt(index)
    if (book != None) this.index += 1
    book
  }
}