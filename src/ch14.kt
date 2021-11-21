/*********** Super **************/

/****** Overriding function and properties ***********/



open class Father5{
    //properties

    open var car:String = "Kia Carnival"    // open that you want to override
    var money:Int = 10000000
    // Member function
    open fun disp(){
        println("****************************")

        println("Father's Car: $car")
        println("Father's Money: $money")
    }
}

// Son Class
class Son5:Father5(){

    //Properties
    var bike:String = "K 10"

    override var car:String = "BMW X5"         // write override keyword to override it
    var fcar:String = super.car             // to take father's car also, it is like super(is father).car
    //Member Function
    fun show(){
        println("****************************")

        println("Son's Bike: $bike")
        println("Son's Car: $car")
        println("Father's car: $fcar")
        println("Father's Money: $money")

    }


    // overrided function

    override  fun disp(){
        println("Son overrided disp()...")
    }



}



fun main(){

    val s = Son5()
    s.show()
    s.disp()
    val f = Father5()
    f.disp()


}