package com.bigdata.scala.chapter01.vars

/**
 * @author Mocg
 *
 */
object VarDemo01 {
    def main(args: Array[String]): Unit = {
        var age: Int = 10
        var sal: Double = 10.9
        var name: String = "tom"
        var isPass: Boolean = true

        //在scala中，小数默认是Double，整数默认是Int
        var score: Float = 70.9f
        println(s"${age}, ${isPass}")

    }
}
