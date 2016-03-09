/**
  * Created by timaffka on 2/25/16.
  */
// A comment!
/* Another comment */
/** A documentation comment */
object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)

    go(n, 1)
  }

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  def fib(n: Int): Int = {
    def go(n: Int, a: Int, b: Int): Int = {
      if (n <=1) b
      else go(n-1, a+b, a)
    }

    go(n, 1, 0)
  }

  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))
  }

  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n+1)

    loop(0)
  }

  def isSorted[A](as: Array[A], ordered:(A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (n+1 >= as.length) true
      else if (ordered(as(n), as(n+1))) loop(n+1)
      else false
    }

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    println(formatResult("absolute value", -35, abs))
    println(formatResult("factorial", 6, factorial))
    println(fib(1),  fib(2),  fib(3), fib(4), fib(5), fib(6))

    println(findFirst(Array(7, 9, 13), (x: Int) => x ==9))
  }
}

