package study

/**
  * map 测试
  */
object MapScala {

  def main(args: Array[String]): Unit = {
    // 空的map时要制定数据类型
    var a:Map[String,String] = Map();

    // 给map增加数据 用 +
    a += ("1"->"2")

    println(a)
    println(a.keys)
    println(a.values)
    // map 声明方式
    val b = Map("1"->"5","3"->"4")
    println(b.values)


  }
}
