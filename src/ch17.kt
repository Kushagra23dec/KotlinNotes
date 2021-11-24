/******* Interface **************/

interface Father8{                  // we can't create instance / object of interface

    // Properties
    var car:String           // Abstract property  so it can't be initialized here

    //Member Function
    fun disp(){
        println("Father Car: $car")
    }

    fun hello()       // abstract function
}

class Son8:Father8{
    // Properties
    var bike:String = "K 10"

    // Implementing Father's Abstract property
    override  var car:String = "Alt 100"

    // Implementing Father's Abstract Method
    override fun hello() {
        println("Father's Abstract Hello")
    }

    fun show() {
        println(" Hello from show")
    }

}

fun main(){
    val s1 = Son8()

    s1.hello()
    s1.disp()
    s1.show()
}