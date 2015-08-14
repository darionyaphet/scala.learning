class Person {
  private var age = 0;

  def increment() {
    age += 1
  }

  def current = age
}

class Student {
  var age = 0
}


class Teacher() {
  var name: String = _
  private val age = 25
  private[this] val gender = "male"

  def this(name: String) {
    this
    this.name = name
  }

  def sayHello(): Unit = {
    println(this.name + ":" + this.age + " " + this.gender)
  }
}

class Teacher1 private(val name: String, val age: Int) {
  println("this is main constructor !")

  var gender: String = _
  println(gender)

  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }

  def sayHello(): Unit = {
    println(this.name + ":" + this.age + " " + this.gender)
  }
}


class Outer(val name: String) {
  outer =>

  class Inner(val name: String) {
    def info(inner: Inner): Unit = {
      println("Outer : " + outer.name + " Inner : " + inner.name)
    }
  }

}

object OOP {
  def main(args: Array[String]): Unit = {
    val person = new Person()
    person.increment()
    println(person.current)

    val student = new Student
    student.age = 10
    println(student.age)

    val teacher = new Teacher()
    teacher.name = "Darion"
    teacher.sayHello()

    val teacher1 = new Teacher1("Darion", 25, "male")
    teacher1.sayHello()

    val outer = new Outer("OUTER")
    val inner = new outer.Inner("INNER")
    inner.info(inner)
  }
}
