package com.bigdata.scala.chapter01

/**
 * @author Mocg
 *
 */
object Comment {
    def main(args: Array[String]): Unit = {
        println("hello world")

        sum(10, 20)
    }

    //tab 或者是tab+shift 整体移动
    /**
     * @deprecated 过期
     * @example
     * 输入n1 = 10 n2 = 20 return 30
     * @param n1
     * @param n2
     * @return 和
     */
    def sum(n1: Int, n2: Int): Int = {
        var str = "hell0" + "hell0" + "hello" + "hello" + "hello" + "hello" + "hello" + "hello" + "hello" + "hello" +
                "hello" + "hello"

        return n1 + n2
    }
}


