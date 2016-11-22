import com.diferdin.tests.scala.MyModule

/**
  * Created by antonio on 22/11/2016.
  */
object Application {

  def main(args: Array[String]): Unit = {
    val msg = "Fibonacci(%d) is %d."format(32, MyModule.fibonacci(32))
    println(msg)
  }
}
