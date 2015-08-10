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

object OOP {
  def main(args: Array[String]): Unit = {
    val person = new Person()
    person.increment()
    println(person.current)

    val student = new Student
    student.age = 10
    println(student.age)
  }
}
