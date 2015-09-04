object Example {
  def main(args: Array[String]): Unit = {
    val person_json = """{
                     "name": "Joe Doe",
                     "age": 45,
                     "kids": ["Frank", "Marta", "Joan"]
                     }"""

    val person = scala.util.parsing.json.JSON.parseFull(person_json)

    // returns "Joe Doe"
    person match {
      case Some(m: Map[String, Any]) => m("name") match {
        case s: String => s
      }
    }
  }
}