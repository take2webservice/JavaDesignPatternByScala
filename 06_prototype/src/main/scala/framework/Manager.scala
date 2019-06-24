package engineer.dame.design_pattern.prototype.framework

class Manager {
    private var showcase: Map[String, Product] = Map.empty[String, Product]
    def register(name: String, proto: Product): Unit = {
        showcase = showcase + (name -> proto)
    }
    def create(protoname: String): Product = {
        val opt: Option[Product] = showcase.get(protoname)
        if (opt.isEmpty) throw new Exception(s"unknown protoname ${protoname}")
        val p: Product = opt.get.asInstanceOf[Product]
        p.createClone
    }
}