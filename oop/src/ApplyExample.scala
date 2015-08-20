/**
 * Created by Darion.J.Yaphet on 15/8/20.
 */
object ApplyTest {
  def apply() = {
    println("Using Apply in Object")
    new ApplyTest()
  }
}

class ApplyTest {

  def apply() = println("Using Apply in Class")

}


object ApplyExample {
  def main(args: Array[String]): Unit = {
    //val applyTest = ApplyTest()
    //applyTest.apply

    val applyTest = new ApplyTest
    applyTest()
  }
}