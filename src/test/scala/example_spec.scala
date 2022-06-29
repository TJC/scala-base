package net.dryft

import java.nio.file.{Files, Path}

import org.scalatest.flatspec.AnyFlatSpecLike
import org.scalatest.matchers.should.Matchers

// http://www.scalatest.org/user_guide
// http://scalamock.org/user-guide/

class MainSpec extends AnyFlatSpecLike with Matchers {
  it should "1+1=2" in {
    (1+1) should be (2)
  }

  // Read the contents of a file in the test resources folder.
  def slurpResource(filename: String): String = Files.readString(Path.of(s"src/test/resources/$filename"))
}
