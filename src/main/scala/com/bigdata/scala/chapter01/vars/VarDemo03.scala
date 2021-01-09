package com.bigdata.scala.chapter01.vars

/**
 * 反编译查看 var 与 val
 * val 修饰的变量在编译后，等同于加上final
 *
    public final class VarDemo03$
    {
      public static  MODULE$;
      private String name;
      private final int age;

 * @author Mocg
 *
 */
object VarDemo03 {
    var name = "hello"
    val age = 100
    def main(args: Array[String]): Unit = {
        println("ok")
    }
}
