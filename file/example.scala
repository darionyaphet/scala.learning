import scala.io.Source

object simple {
    def main(args:Array[String]) : Unit ={
        val file = Source.fromFile("data.in")
        for(line <- file.getLines){
            println(line)
        }

        val site = Source.fromURL("http://spark.apache.org")
        for(line <- site.getLines) println(line)
    }
}
