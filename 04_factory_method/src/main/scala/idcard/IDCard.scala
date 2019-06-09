package engineer.dame.factory_method.design_pattern.idcard
import engineer.dame.factory_method.design_pattern.framework._

case class IDCard(owner: String) extends Product {
  if (owner == null || owner.isEmpty) throw new Exception("IDCard must have non-empty String")
  println(createInitMessage())

  override def use(): Unit = {
    println(createUseMessage())
  }
  def createInitMessage() = {
    s"${owner}のカードを作ります。"
  }

  def createUseMessage() = {
    s"${owner}のカードを使います。"
  }
  def getOwner(): String = {
    owner
  }
}