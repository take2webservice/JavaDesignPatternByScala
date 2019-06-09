package engineer.dame.iterator.design_pattern

object Main {
  def main(args: Array[String]) {
    val bookshelf: BookShelf = new BookShelf(4)
    bookshelf.appendBook(new Book("Around the World"))
    bookshelf.appendBook(new Book("Bible"))
    bookshelf.appendBook(new Book("Cinderella"))
    bookshelf.appendBook(new Book("Daddy-Long-Legs"))
    val ite: Iterator[Book] = bookshelf.iterator()
    while (ite.hasNext()) {
      val book: Option[Book] = ite.next()
      book match {
        case s: Some[Book] => println(s.get.getName())
        case None          => println("none")
      }
    }
  }
}