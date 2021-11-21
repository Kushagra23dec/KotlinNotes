/****** Overriding function and properties ***********/



open class Father4{
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
class Son4:Father4(){

    //Properties
    var bike:String = "K 10"

    override var car:String = "BMW X5"         // write override keyword to override it

    //Member Function
    fun show(){
        println("****************************")

        println("Son's Bike: $bike")
        println("Father's car: $car")
        println("Father's Money: $money")

    }


    // overrided function

    override  fun disp(){
        println("Son overrided disp()...")
    }



}



fun main(){

    val s = Son4()
    s.show()
    s.disp()
    val f = Father4()
    f.disp()


}