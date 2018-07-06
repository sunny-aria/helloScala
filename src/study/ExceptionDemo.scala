package study

/**
  * 异常处理
  */
object ExceptionExample {
  def main(args: Array[String]): Unit = {
    var demo = new demoException()
//    demo.divide(2,0)
    demo.divide(2,1)

    try{
    demo.divide2(3,0)
    }catch {
      case e:ArithmeticException => println(e)
    }

    demo.divide3(4,0)

  }
}
class demoException{
  def divide(a:Int,b:Int): Unit ={
    //try catch 捕获异常
    try {
      a/b
      throw new RuntimeException("error.")
    }catch {
      case e:ArithmeticException => println(e)
      case ex:Throwable => println("found a unkown exception"+ex)
    }
  }

  //方法throws 异常
  @throws(classOf[ArithmeticException])
  def divide2(a:Int,b:Int): Unit ={
    a/b
  }

  // 抛出异常
  def divide3(a:Int,b:Int): Unit ={
    if(b==0){
      throw new ArithmeticException(" / by zero...")
    }
  }

}
