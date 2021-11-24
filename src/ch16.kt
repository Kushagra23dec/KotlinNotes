/******** Abstract class and Abstract Method *************/

abstract class Father7{         // Abstract class are always open, but we can't create its object
    // Properties
    var car:String = "Alt 100"

    //Member function
    fun disp(){
        println(car)
    }

    // Abstract Method

    abstract fun hello()
}


class  Son7:Father7(){
    //Member function
    fun show(){
        println("Father car: $car")
    }

    //  Father class's abstract function's definition
    override fun hello(){
        println("Hello for Hello function.")
    }


}

fun main(){
    val s1 = Son7()
    s1.show()
    s1.disp()
    s1.hello()
//    val f1 = Father7()         // cann't create object/instance of abstract class

}