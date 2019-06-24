import engineer.dame.design_pattern.prototype._
import engineer.dame.design_pattern.prototype.framework._

object Main{
    def main(args: Array[String]): Unit = {
        val manager: Manager = new Manager
        val upen: UnderlinePen = new UnderlinePen('~')
        val mbox: MessageBox = new MessageBox('*')
        val sbox: MessageBox = new MessageBox('/')
        manager.register("strong message", upen)
        manager.register("warning box", mbox)
        manager.register("slash box", sbox)
        val p1: Product = manager.create("strong message")
        p1.use("Hello world.")
        val p2: Product = manager.create("warning box")
        p2.use("Hello world.")
        val p3: Product = manager.create("slash box")
        p3.use("Hello world.")
    }
}