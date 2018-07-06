package study

/**
  * 线程demo
  */
object ThreadDemo {
  def main(args: Array[String]): Unit = {
    var demo  = new demo();
    var t = new Thread(demo);
    t.start()

    println("-------------------------")
    val t2 = new demo2()
    t2.start()
    println("-------------------------")


    var t1= new demo3(1)
    var t22= new demo3(22)
    var t3= new demo3(3)
    var t4= new demo3(4)
    t1.start()
    t1.join()
    t22.start()
    t3.start()
    t4.start()

  }

}

/**
  * 继承Runnable
  */
class demo extends Runnable{
  override def run(): Unit = println("demo thread is running...")
}

/**
  * 继承Thread
  */
class demo2 extends Thread{
  override def run(): Unit = println("demo2 thread is running...")
}

class demo3(ic:Int) extends Thread{
  val  i:Int = ic;
  override def run(): Unit = println("demo"+i+" thread is running...")
}