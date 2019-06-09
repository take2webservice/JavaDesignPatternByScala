import org.scalatest._
import scala.util.Try
import engineer.dame.template_method.design_pattern.framework._

class StringDisplaySpec extends FlatSpec with DiagrammedAssertions {

  "constructor " should "can accept non-empty string" in {
      val nullTry: Try[StringDisplay] = Try { new StringDisplay(null) }
      assert(nullTry.isFailure)
      val nonEmptyTry: Try[StringDisplay] = Try { new StringDisplay("string") }
      assert(nonEmptyTry.isSuccess)
  }
  
  "function:createLine" should "can return (string)" in {
      val sd = new StringDisplay("string")
      assert(sd.createLine() == "+------+")
  }

  "function:encloseStr" should "can return *string*" in {
    val sd = new StringDisplay("string")
    assert(sd.encloseStr() == "|string|")
  }
}