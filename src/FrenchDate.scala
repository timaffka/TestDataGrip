import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
//    println(df format now)
    println(df.format(now))
    val x = 5
    println(1 + 2 * 3 / x)
    println(1. + (2))
    println( (1).+ ( ( (2).*(3) )./ (x) ) )
  }
}
