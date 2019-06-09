package engineer.dame.template_method.design_pattern
class CharDisplay(ch: Char) extends AbstractDisplay {
  override def open(): Unit = { scala.Console.print("<<") }

  override def print(): Unit = { scala.Console.print(ch) }

  override def close(): Unit = { println(">>") }
}