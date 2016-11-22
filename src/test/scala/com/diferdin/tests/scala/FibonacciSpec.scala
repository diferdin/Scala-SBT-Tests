package com.diferdin.tests.scala

import org.scalatest._

class FibonacciSpec  extends FlatSpec {

  "A Fibonacci sequence" should "return zero if input is zero" in {
    assert(MyModule.fibonacci(0) == 0)
  }

  "A Fibonacci sequence" should "return one if input is one" in {
    assert(MyModule.fibonacci(1) == 1)
  }

  "A Fibonacci sequence" should "return the correct value for positive inputs" in {
    assert(MyModule.fibonacci(11) == 89)
  }
}
