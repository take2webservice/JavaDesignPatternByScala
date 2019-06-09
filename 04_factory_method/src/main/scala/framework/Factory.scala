package engineer.dame.factory_method.design_pattern.framework

abstract class Factory {
  final def create(owner: String): Product = {
    val p: Product = createProduct(owner)
    registerProduct(p)
    p
  }
  def createProduct(owner: String): Product
  def registerProduct(product: Product): Unit
}