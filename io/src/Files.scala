import scala.io.Source

/**
 * Created by Darion.J.Yaphet on 15/8/11.
 */
object Files {

  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("data.in")
    for (line <- file.getLines) {
      println(line)
    }

    val site = Source.fromURL("http://spark.apache.org")
    for (line <- site.getLines) println(line)
  }
}
