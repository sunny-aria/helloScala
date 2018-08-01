package study

/**
  * 功能描述：定长数组操作
  *
  * @Auther:  
  * @Date: 2018/7/31 
  */
object ArrayDemo {
  def main(args: Array[String]): Unit = {
    val strArr = Array("1","2","3") //这种调用方式其实是调用其apply方法进行数组创建操作
    val Array(f1,f2,f3) = strArr // 这种也是apply的方式
    println(f2)
    //定义一个10个长度的int类型的数组
    val a = Array[Int](10)
    //数组赋值
    a(0)=1

  }
}
