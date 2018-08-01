package study

import java.io.File

/**
  * 功能描述：
  *
  * @Auther: sunny
  * @Date: 2018/7/31 
  */
object ForeachDemo {
  def main(args: Array[String]): Unit = {
    val files = (new File("d:\\")).listFiles();
    /*for(file <- files){
      println(file.getName)
    }*/
    println("-------------------")
    for (i <- 1 to(10,2)){
      println(i)
    }
    println("---循环增加if条件---")
    for(i <- 1 to 20 if i>10) println(i)
    println("---for 多个条件 用; 隔开---")
    for(i <- 1 to 20 if i>10; if i<18) println(i)
    println("---生成结果返回1.---")
    val scalaFiles = for{
      file <- files
      if file.getName.startsWith("new")
    } yield  file

    scalaFiles.foreach(println)

    println("---生成结果返回2.---")
    val forFileLengths = for{
      file <- files
      if file.getName.startsWith("new")
    } yield  file.getName.length

    forFileLengths.foreach(println)
  }
}
