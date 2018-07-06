package study

/**
  * Map ，Array 测试
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

    //数组声明方式
    var z:Array[String] =new Array[String](3)
    // var z= new Array[String](3)
    z(0)="a";z(1)="b";z(2)="c";
    //var z=Array("a","b","c")
    for (x <- z){
      println(x)
    }
  }
}
