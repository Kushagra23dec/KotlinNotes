/*********** Inheritance with Primary Constructor  ********/
open class Father1(_car:String, _money:Int){
    //properties
    var car:String = _car
    var money:Int = _money
    // Member function
    fun disp(){
        println("Father's Car: $car")
        println("Father's Money: $money")
    }
}

// Son Class
class Son1(_car: String, _money: Int, _bike:String):Father1(_car,_money){

    //Properties
    var bike:String = _bike

    //Member Function
    fun show(){
        println("****************************")

        println("Son's Bike: $bike")
        println("Father's car: $car")
        println("Father's Money: $money")

    }
}




fun main() {

    val s = Son1("Kia Carnival",10000000,"K 10")
    s.show()

    s.car = "BMW X5"
    s.money = 9400000

    s.show()

}