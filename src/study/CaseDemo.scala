package study

/**
  * case 模式匹配
  */
object CaseDemo {
  /**
    * 简单的模式匹配
    * @param x
    * @return
    */
  def matchTest(x:Any):Any = x match {
    case 1 => "one"
    case "two" => 2
    case y:Int => "scala.Int"
    case _ =>x.toString
  }

  def main(args: Array[String]): Unit = {
    println(matchTest(1))
    println(matchTest("two"))
    println(matchTest(3))
    println(matchTest("test match case"))



    // 测试case 类模式匹配
    val alice = new Person("alice",25)
    val bob = new Person("bob",18)
    val lily = new Person("lily",32)

    for(person <- List(alice,bob,lily)){
      person match {
        case Person("alice",25) => println("hi"+person.name)
        case Person("bob",18) => println("hi bob. age:"+person.age)
        case Person(name,age) => println("name:"+name+",age:"+age)
      }
    }

  }

  //case 类匹配
  case class Person(name:String ,age:Int)

}
