package study

/**
  * tuple 测试
  */
object TupleDemo {

  def main(args: Array[String]): Unit = {
    val t = (1,2,4,5,6)
    val (f1,f2,f3,f4,f5) = t
    println(t._1)
    println(t._5)
    println("-------------------")
    t.productIterator.foreach(i=>println(i))
    println("-------------------")
    println(f1)
  }
}
