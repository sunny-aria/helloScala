package study

/**
  * 方法参数用val ，其他情况可以var ，val
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
  }
}
