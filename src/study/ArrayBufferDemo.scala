package study

import scala.collection.mutable.ArrayBuffer

/**
  * 功能描述：可变数组操作
  *
  * @Auther:
  * @Date: 2018/7/31 
  */
object ArrayBufferDemo {
  def main(args: Array[String]): Unit = {
    //创建String类型ArrayBuffer数组缓冲
    val a = ArrayBuffer[String]()
    //+=意思是在尾部添加元素
    a+="hello"
    //+=后面还可以跟多个元素的集合
    a+=("world","scala")
    println(a)
    //++=用于向数组中追加内容，++=右侧可以是任何集合
    //追加Array数组
    a++=Array("welcome","to","scala")
    //追加list数组
    a++=List("to","spark")
    a.trimEnd(1)
    a.trimStart(1)
    a.foreach(println)
    println("--------------------")
    //创建整型数组
    var intArray= ArrayBuffer(1,1,2)
    intArray.insert(0,7,8,9)
    intArray.foreach(println)
  }
}
