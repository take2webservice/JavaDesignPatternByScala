import engineer.dame.design_pattern.prototype.framework._
class MessageBox(decochar: Char) extends Product {
    def use(s: String): Unit =  {
        val length: Int = s.getBytes().length
        println("")
        println(decochar.toString * length)
        println(s"${decochar}${s}${decochar}")
        println(decochar.toString * length)
        println("")
    }
    def createClone: Product = {
        clone.asInstanceOf[Product]
    }
}