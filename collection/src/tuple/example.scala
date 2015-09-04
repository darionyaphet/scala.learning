package tuple


object example {
  def main(args: Array[String]): Unit = {
    val tuple = (0, "darion")
    println(tuple._1)
    println(tuple._2)

    //http://alvinalexander.com/scala/scala-tuple-examples-syntax
    val stuff = (42, "fish")
    println(stuff.getClass)

    //    println((1, 2, 3).getClass)
    //    println((1, 2, 3, 4).getClass)
    //    println((1, 2, 3, 4, 5).getClass)

    val darion = ("darion", 25, 13)
    println(darion._1)
    //    println(thing._2)
    //    println(thing._3)

    val (name, age, luckNumber) = darion
    println(name + " " + age + " " + luckNumber)

    //darion.productIterator.foreach(print) darion2513

    println(darion.toString())

    //In another cool feature, you can create a tuple using this syntax:1 -> "a"


    //http://alvinalexander.com/scala/using-scala-map-tuples-in-anonymous-function
    val x = Map(1 -> "foo", 2 -> "bar")


  }

}
