package study

/**
  * object 修饰的类为静态类，
  * 此例为 伴生类，伴生对象，单例模式
  */
object Person {
  private val b:Int=20

  def main(args: Array[String]): Unit = {
    new Person().test()
  }
  def test2(): Unit ={
    println(Person.b)
  }
}

class Person{

  private var a:Int = 10
  private def test(): Unit ={
    println(a)
    //伴生类可以访问伴生对象的private 变量
    println(Person.b)
  }

}
