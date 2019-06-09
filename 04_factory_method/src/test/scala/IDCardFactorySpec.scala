import org.scalatest._
import engineer.dame.factory_method.design_pattern.idcard._

class IDCardFactorySpec extends FlatSpec with DiagrammedAssertions {
  
  "function:createProduct" should "can return new Product" in {
    val name = "take2iseki"
    val factory = new IDCardFactory()
    assert(factory.createProduct(name) == new IDCard(name) )
  }

  "function:registerProduct" should "can regist product's ownere" in {
    val name = "take2iseki"
    val name2 = "take3iseki"
    val name3 = "take4iseki"
    val factory = new IDCardFactory()
    factory.registerProduct(factory.createProduct(name))
    factory.registerProduct(factory.createProduct(name2))
    factory.registerProduct(factory.createProduct(name3))
    assert(factory.getOwners() == List(name, name2, name3))
  }
}