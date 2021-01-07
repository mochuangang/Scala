package com.bigdata.scala.chapter01

/**
 * 看Array的源码
 * @author Mocg
 *
 */
object LookSourceCode {
    def main(args: Array[String]): Unit = {

        //定义一个Int类型的数组，元素个数为10个
        var arr = new Array[Int](10)
        //对代码进行格式化的快捷键ctrl+alt+l
        for(item <- arr){
            println("item=" + item)
        }
    }
}
