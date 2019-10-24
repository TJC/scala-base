package net.dryft

import java.nio.file.{Files, Path}
import org.scalatest._

// http://www.scalatest.org/user_guide
// http://scalamock.org/user-guide/

class MainSpec extends FlatSpec with Matchers {
  it should "1+1=2" in {
    (1+1) should be (2)
  }

  // Read the contents of a file in the test resources folder.
  def slurpResource(filename: String): String = Files.readString(Path.of(s"src/test/resources/$filename"))
}
