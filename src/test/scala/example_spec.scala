package net.dryft
import org.scalatest._

// http://www.scalatest.org/user_guide
// http://scalamock.org/user-guide/

class MainSpec extends FlatSpec with Matchers {
  it should "1+1=2" in {
    (1+1) should be (2)
  }
}
