package study

/**
  * 方法参数用val ，其他情况可以var ，val
  * val 声明变量，它是一个不能被改变的变量
  * var 声明变量，是一个可变变量
  * @param x
  * @param y
  */
class Point(val x:Int,val y:Int){
  var xc = x
  var yc = y

  def move(xb:Int,yb:Int): Unit ={
    xc = xc+xb;
    yc = yc+yb;
    println(xc+","+yc)
  }
}

object Demo {
  def main(args: Array[String]): Unit = {
    val point = new Point(10,10);
    point.move(15,15);

    var a = 100
    println(a)
    a =200
    println(a)
    val b = 100
    println(b)

  }
}
