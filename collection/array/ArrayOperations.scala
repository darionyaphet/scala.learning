
object Operations {
    def main(args :Array[String]): Unit = {
        val ints =  new Array[Int](10)
        val strings = new Array[String](10)
        val hello = Array("Hello","World")
        println(hello)
        hello(0) = "Goodbye"


       //
       import scala.collection.mutable.ArrayBuffer
       val buffer = ArrayBuffer[Int]()
       buffer += 1
       buffer += (2,3,4)
       buffer ++=Array(5,6,7)

    }
} 
