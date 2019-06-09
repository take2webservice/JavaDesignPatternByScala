package engineer.dame.template_method.design_pattern
class StringDisplay(str: String) extends AbstractDisplay {
  if (str == null) throw new Exception("StringDisplay must have non-empty String")
  val width: Int = str.getBytes().length
  override def open(): Unit = printLine()

  override def print(): Unit = { println(encloseStr()) }

  override def close(): Unit = printLine()

  def printLine(): Unit = {
    println(createLine())
  }

  def createLine(): String = s"+${"-" * width}+"

  def encloseStr(): String = s"|${str}|"
}
