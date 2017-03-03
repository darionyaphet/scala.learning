package org.darion.yaphet.scala.tips

/**
  * Created by darionwang on 2017/3/3.
  *
  * For each iteration of your for loop, yield generates a value which will be remembered.
  * It's like the for loop has a buffer you can't see, and for each iteration of your for loop,
  * another item is added to that buffer. When your for loop finishes running,
  * it will return this collection of all the yielded values.
  *
  * The type of the collection that is returned is the same type that you were iterating over,
  * so a Map yields a Map, a List yields a List, and so on.
  *
  * Also, note that the initial collection is not changed;
  * the for/yield construct creates a new collection according to the algorithm you specify.
  */
object YieldExample {
  def main(args: Array[String]): Unit = {
    println(for (i <- 1 to 5) yield i)
    println(for (i <- 1 to 5) yield i * 2)
    println(for (i <- 1 to 5) yield i % 2)

    val array = Array(1, 2, 3, 4, 5)
    val even = for (i <- array if i % 2 == 0) yield i
    even.foreach(print(_))
  }
}
