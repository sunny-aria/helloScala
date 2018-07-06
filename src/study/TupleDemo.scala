package study

object TupleDemo {
  def main(args: Array[String]): Unit = {
    var t = (1,2,4,5,6)
    println(t._1)
    println(t._5)
    println("-------------------")
    t.productIterator.foreach(i=>println(i))
  }
}
