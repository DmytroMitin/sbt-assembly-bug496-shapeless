import org.scalatest._
import flatspec._
import matchers._

class Test extends AnyFlatSpec with should.Matchers {
  "1 + 1" should "be 2" in {
    1 + 1 should be (2)
  }
}
