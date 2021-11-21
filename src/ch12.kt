/*********** Inheritance with Primary and Secondary Constructor ********/
open class Father3(_car:String,_money:Int){
    //properties
    var car:String = _car
    var money:Int  = _money

    // Member function
    fun disp(){
        println("Father's Car: $car")
        println("Father's Money: $money")
    }
}

// Son Class
class Son3:Father3{

    //Properties
    var bike:String

    // Secondary constructor
    constructor(_car:String,_money:Int,bike:String):super(_car, _money ){
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

    val s = Son3("Kia Carnival",10000000,"K 10")
    s.show()

    s.car = "BMW X5"
    s.money = 9400000

    s.show()

}