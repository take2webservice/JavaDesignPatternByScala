import org.scalatest._
import scala.util.Try
import engineer.dame.factory_method.design_pattern.idcard._

class StringDisplaySpec extends FlatSpec with DiagrammedAssertions {

  "constructor " should "can accept non-empty string" in {
      val emptyTry: Try[IDCard] = Try { new IDCard("") }
      assert(emptyTry.isFailure)
      val nullTry: Try[IDCard] = Try { new IDCard(null) }
      assert(nullTry.isFailure)
      val nonEmptyTry: Try[IDCard] = Try { new IDCard("take2iseki") }
      assert(nonEmptyTry.isSuccess)
  }
  
  "function:createUseMessage" should "can return $ownerのカードを使います。" in {
      val card = new IDCard("take2iseki")
      assert(card.createUseMessage() == "take2isekiのカードを使います。")
  }

  "function:createInitMessage" should "can return $ownerのカードを作ります。" in {
      val card = new IDCard("take2iseki")
      assert(card.createInitMessage() == "take2isekiのカードを作ります。")
  }

  "function:getOwner" should "can return owner" in {
      val card = new IDCard("take2iseki")
      assert(card.getOwner() == "take2iseki")
  }
}