/*********** Inheritance ********/
open class Father{
    //properties
    var car:String = "Kia Carnival"
    var money:Int = 10000000
    // Member function
    fun disp(){
        println("Father's Car: $car")
        println("Father's Money: $money")
    }
}

// Son Class
class Son:Father(){

    //Properties
    var bike:String = "K 10"

    //Member Function
    fun show(){
        println("****************************")

        println("Son's Bike: $bike")
        println("Father's car: $car")
        println("Father's Money: $money")

    }
}

// Daughter class
class Daughter:Father(){

    //Properties
    var bike:String = "Duke 390"

    //Member Function
    fun show(){
        println("****************************")
        println("Daughter's Bike: $bike")
        println("Father's car: $car")
        println("Father's Money: $money")
    }
}


fun main(){

    val s = Son()
    s.show()

    val d = Daughter()



    s.car = "BMW X5"
    s.money = 9400000


    s.show()

    d.show()
}