package engineer.dame.factory_method.design_pattern.idcard
import engineer.dame.factory_method.design_pattern.framework._

class IDCardFactory extends Factory {
  private var owners: List[String] = List()
  def createProduct(owner: String): Product = new IDCard(owner)
  def registerProduct(product: Product): Unit = { owners = owners :+ product.asInstanceOf[IDCard].getOwner() }
  def getOwners(): List[String] = owners
}