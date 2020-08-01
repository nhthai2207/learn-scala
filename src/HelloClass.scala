import java.lang.Integer

object MainHelloClass {


  def main(args: Array[String]): Unit = {
    var helloClass = new HelloClass
    helloClass.testList()
    helloClass.X(100)
    println(helloClass.x)

    testMix()
  }


  def multipleParameterList = {


  }



  def testMix(): Unit = {
    val d = new D
    println(d.message)
    println(d.upperCase)
  }
}

trait multiple {
  def foldLeft[B](z: B)(op: (B, A) => B): B
}

abstract class A {
  val message: String
}

class B extends A {
  val message = "Hi there"
}

trait C extends A {
  def upperCase() = {
    message.toUpperCase()
  }
}

class D extends B with C {

}

class HelloClass {
  private var _x = 0
  val square = (x: Int) => x ^ 2

  def x = _x
  def X(x: Int):  Unit = {
    _x = x
  }


  def testList(): Unit = {
    val list: List[Any] = List (
      "a string",
      1,
      true,
      'c',
      () => "function return string"
    )
    list.foreach(
      el => println(el)
    )
  }
}


