/**
 * Generated by apidoc - http://www.apidoc.me
 * Service version: 0.1.0-SNAPSHOT
 * apidoc:0.9.48 http://localhost:9000/movio/apidoc-generator-attributes/0.1.0-SNAPSHOT/movio_scala_models
 */
package movio.apidoc.generator.attributes.v0.models {

  /**
   * Additional validation options not currently in the standard apidoc spec
   */
  case class FieldValidation(
    regex: _root_.scala.Option[String] = None,
    maximum: _root_.scala.Option[Long] = None,
    minimum: _root_.scala.Option[Long] = None
  ) {

  import Validation._



  }

  /**
   * Information needed for generating Kafka wrappers, consumers and producers.
   */
  case class KafkaProps(
    dataType: String,
    topic: String,
    messageGenerateKey: String = "java.util.UUID.randomUUID().toString"
  ) {

  import Validation._



  }

  /**
   * Additional code generation information for case class fields
   */
  case class ScalaFieldProps(
    `class`: _root_.scala.Option[String] = None,
    default: _root_.scala.Option[String] = None,
    example: _root_.scala.Option[String] = None
  ) {

  import Validation._



  }

  /**
   * Additional code generation information for case classes
   */
  case class ScalaModelProps(
    `extends`: _root_.scala.Option[Seq[String]] = None
  ) {

  import Validation._



  }

  object Validation {

    def validateLength(name: String, value: _root_.scala.Option[String], length: Int): Unit = {
      value foreach { value ⇒
        validateLength(name, value, length)
      }
    }

    def validateLength(name: String, value: String, length: Int): Unit = {
      require(value.length <= length, s"$name must be $length characters or less")
    }

    def validateLengthOfAll(name: String, values: _root_.scala.Option[Seq[String]], length: Int): Unit = {
      values foreach { values ⇒
        validateLengthOfAll(name, values, length)
      }
    }

    def validateLengthOfAll(name: String, values: Seq[String], length: Int): Unit = {
      values foreach { value ⇒
        validateLength(name, value, length)
      }
    }

    def validateRegex(name: String, value: String, regex: String): Unit = {
      require(regex.r.findFirstIn(value).isDefined, s"$name did not match regex: $regex")
    }

  }

}