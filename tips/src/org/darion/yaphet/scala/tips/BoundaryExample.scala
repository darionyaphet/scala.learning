package org.darion.yaphet.scala.tips

class Animal {
  def sayHello() = {
    println("animal say hello")
  }
}

class Fish extends Animal {
  override def sayHello(): Unit = {
    println("fish say hello")
  }
}

class Cat extends Animal {
  override def sayHello(): Unit = {
    println("cat say hello")
  }
}

class Dog extends Animal {
  override def sayHello(): Unit = {
    println("dog say hello")
  }
}

/**
  * Created by darionwang on 2017/3/3.
  */
object BoundaryExample {

  def upperBoundGreeting[T <: Animal](things: Seq[T]) =
    things map (_.sayHello())

  def lowerBoundGreeting[T >: Animal](things: Seq[T]) =
    things

  def main(args: Array[String]): Unit = {
    upperBoundGreeting(List(new Cat, new Dog, new Fish))
    lowerBoundGreeting(List(new Cat, new Dog, new Fish)).map(_.sayHello())
  }
}
