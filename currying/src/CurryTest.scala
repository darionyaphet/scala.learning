/**
 * Methods may define multiple parameter lists.
 * When a method is called with a fewer number of parameter lists,
 * then this will yield a function taking the missing parameter lists as its arguments.
 *
 * Created by Darion.J.Yaphet on 15/8/20.
 */
object CurryTest extends App {
  def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p)


  // method modN is partially applied in the two filter calls; i.e.
  // only its first argument is actually applied.
  // The term modN(2) yields a function of type Int => Boolean
  // and is thus a possible candidate for the second argument of function filter.
  def modN(n: Int)(x: Int) = ((x % n) == 0)

  val number = List(0, 1, 2, 3, 4, 5, 6, 7)
  println(filter(number, modN(2)))
  println(filter(number, modN(3)))

  def add(x: Int)(y: Int) = x + y

  println("1 + 2 = " + add(1)(2))
}
