import org.scalatest._
import scala.util.Try
import engineer.dame.adapter.design_pattern.Banner

class BannerSpec extends FlatSpec with DiagrammedAssertions {

  "constructor " should "can accept non-empty string" in {
    val hasStrTry: Try[Banner] = Try { new Banner("message") }
    assert(hasStrTry.isSuccess)
    val nullTry: Try[Banner] = Try { new Banner(null) }
    assert(nullTry.isFailure)
    val emptyTry: Try[Banner] = Try { new Banner("") }
    assert(emptyTry.isFailure)
  }

  "function:createWithParren" should "can return (string)" in {
    val banner = new Banner("string")
    assert(banner.createWithParren() == "(string)")
  }

  "function:createWithAster" should "can return *string*" in {
    val banner = new Banner("string")
    assert(banner.createWithAster() == "*string*")
  }
}