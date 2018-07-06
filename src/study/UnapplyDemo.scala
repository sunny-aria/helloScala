package study

/**
  * 提取器
  */
object UnapplyDemo {

  def apply (user:String,domain:String)= user+"@"+domain

  def unapply(str: String ): Option[(String,String)] ={
    val parts = str split "@"

    if(parts.length==2){
      println("提取器："+ parts(0)+","+parts(1))
      Some(parts(0),parts(1))
    }else{None}
  }


  /**
    * 抽取器模式匹配
    *
    * 如上所述，unapply方法的目的是提取正在寻找的特定值。当使用match语句比较提取器对象时，将自动执行unapply方法。
    */
  def testUnapply(x:Any)= x match {
    case UnapplyDemo(user,domain) => println(x)
    case _ => println("none")
  }


  def main(args: Array[String]): Unit = {
    /**
      * 当一个类的实例后跟括号为零个或多个参数的列表时，编译器会调用该实例上的apply方法。 可以在对象和类中定义apply方法。
      * 调用示例 UnapplyDemo("scala","yz.com") equals 调用 apply("scala1","yz.com")
      */
    println(UnapplyDemo("scala","yz.com"))
    println(apply("scala1","yz.com"))


    //unapply("Maxsu@gmail.com") equals Some("Maxsu", "gmail.com")
    //unapply("Maxsu Ali") equals None
    println(unapply("scala2@yz.com"))
    println(unapply("scala3 yz.com"))



    testUnapply(UnapplyDemo("scala","yz.com"))
  }
}
