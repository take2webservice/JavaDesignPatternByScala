import engineer.dame.factory_method.design_pattern.idcard._
import engineer.dame.factory_method.design_pattern.framework._

object Main {
  def main(args: Array[String]): Unit = {
    val factory: Factory = new IDCardFactory()
    val card1: Product = factory.create("結城浩")
    val card2: Product = factory.create("とむら")
    val card3: Product = factory.create("佐藤花子")
    card1.use()
    card2.use()
    card3.use()
  }
}