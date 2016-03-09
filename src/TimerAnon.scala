/**
  * Created by timaffka on 2/3/16.
  */

object TimerAnon {
  def oncePerSecond (callback: () => Unit) {
    while (true) {callback(); Thread sleep 1000}
  }

  def main(args: Array[String]) {
    oncePerSecond(() => println("Time flies like an arrow ..."))
  }
}
