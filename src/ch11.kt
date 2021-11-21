/*********** Inheritance with Secondary Constructor ********/
open class Father2{
    //properties
    var car:String
    var money:Int

    // Secondary Constructor
    constructor(car:String,money:Int){
        this.car = car
        this.money = money
    }

    // Member function
    fun disp(){
        println("Father's Car: $car")
        println("Father's Money: $money")
    }
}

// Son Class
class Son2:Father2{

    //Properties
    var bike:String

    // Secondary constructor
    constructor(car:String,money:Int,bike:String):super(car,money){
        this.bike = bike
    }

    //Member Function
    fun show(){
        println("****************************")

        println("Son's Bike: $bike")
        println("Father's car: $car")
        println("Father's Money: $money")

    }
}




fun main() {

    val s = Son2("Kia Carnival",10000000,"K 10")
    s.show()

    s.car = "BMW X5"
    s.money = 9400000

    s.show()

}