package list

/**
 * Created by Darion.J.Yaphet on 15/9/4.
 */
object example {
  def main(args: Array[String]) {
    val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Monday", "Saturday")
    println(days)
    println(days.reverse)
    println(days.mkString(", "))

    val l = "Hello" :: "Hi" :: "Hah" :: "WOW" :: "WOOW" :: Nil
    println(l)

    val wow = l ::: List("WOOOW", "WOOOOW")
    println(wow)

    println(wow(3))

    //Sunday Monday Monday
    println(days.count(element => element.length == 6))

    println(days.drop(2))
    println(days.dropRight(2))
    println(days.filter(element => element.length == 6))

    println(days.foreach(element => print(element + ", ")))
    println(days.head + " --> " + days.last)

    println(days.init)
    println(days.tail)

    println(days.sortWith(_.compareTo(_) < 0))
  }
}
