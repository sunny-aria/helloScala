package study

import scala.util.matching.Regex

/**
  * Regex 正则表达式
  * new Regex() or   .r 生成正则表达式
  */
object RegexDemo {
  def main(args: Array[String]): Unit = {
    var pattern = new Regex("(s|S)cala")
    val str = "Scala hello. scala."

    println(pattern findFirstIn str)
    println((pattern.findAllIn(str)).mkString(","))

    var pattern2 = "[sS]cala".r

    println((pattern2 findAllIn str).mkString(","))
  }

}
