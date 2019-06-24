import org.scalatest._
import scala.util.Try
import engineer.dame.design_pattern.prototype.framework._

class ProductSpec extends FlatSpec with DiagrammedAssertions {

  "Product constructer " should "create instance" in {
      val emptyTry: Try[Product] = Try { new Product }
      assert(emptyTry.isSuccess)
  }
}