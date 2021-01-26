package exp4s

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

/**
  * A simple test class exercising programmatic expression and exp4s
  */
class Exp4sProcessorTest extends AnyFlatSpec with Matchers {

  import Exp4sProcessor._

  "a formula" should "compile and print same result for the input when excercised with a programatic experssion" in {
    val iss               = -23d
    val valFromOldFormula = (sStrength: Double) => math.pow(10, (27.55 - (20 * math.log10(2412)) + math.abs(sStrength + 5)) / 20)
    val valFromNewFormula = compileFormula("pow(10, (27.55 - (20 * log10(2412)) + abs(a + 5)) / 20) with a", iss)
    valFromOldFormula(iss) shouldBe valFromNewFormula
  }

}
