import engineer.dame.design_pattern.prototype.framework._
class UnderlinePen(ulchar: Char) extends Product {
    def use(s: String): Unit =  {
        val length: Int = s.getBytes().length
        println("")
        println(ulchar.toString * length)
        println(s""""${s}"""")
        println(ulchar.toString * length)
        println("")
    }
    def createClone: Product = {
        clone.asInstanceOf[Product]
    }
}