package com.diferdin.tests.scala

/**
  * Created by antonio on 19/11/2016.
  */
object MyModule {

  def fibonacci(count: Int): Int = {

    @annotation.tailrec
    def loop(count: Int, value: Int, acc: Int): Int = count match {
      case 0 => acc
      case _ => loop(count -1, acc, value + acc)
    }

    loop(count, 1, 0)
  }
}

