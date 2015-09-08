/**
 * Created by Darion.J.Yaphet on 15/9/8.
 * http://docs.scala-lang.org/zh-cn/overviews/core/implicit-classes.html
 *
 * http://stackoverflow.com/questions/11931623/how-to-use-scala-2-10-implicit-classes
 */
object ImplicitClasses {

  implicit class IntWithTimes(x: Int) {
    def times[A](f: => A): Unit = {
      def loop(current: Int): Unit =
        if (current > 0) {
          f
          loop(current - 1)
        }
      loop(x)
    }
  }

  def main(args: Array[String]) {
    5 times println("Hello Darion ~")
  }
}
