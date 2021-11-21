/************ Visibility Modifiers ******************/

/***
 Private means visible inside this class only(including all its members).
 Protected is same as private but is also visible in subclasses.
 internal means that any client inside this module who sees the declaring class sees its internal members.
 public means that any client who sees the declaring class sees its public members.
 ***/


open class Father6{
 // Properties
 var a:Int = 10
 var b:Int = 20
 var c:Int = 30
 var d:Int = 40

 // Member Function
 fun disp(){
  println("************************")

  println("A:$a")
  println("B:$b")
  println("C:$c")
  println("D:$d")
 }

 fun hello(){
  println("Hello Father")
 }

}

class Son6:Father6(){
 //Properties
 var bike:String = "K 10"

 // Member Function

 fun show(){
  println("************************")

  println("A:$a")
  println("B:$b")
  println("C:$c")
  println("D:$d")
  hello()
 }
}

fun main(){
 val s = Son6()
 s.show()
 s.disp()
 s.a = 101
 s.b = 102
 s.c = 103
 s.d = 104
 s.show()
 s.hello()

}