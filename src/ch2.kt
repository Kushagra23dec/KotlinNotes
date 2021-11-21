/****** Class and Object **********/

// creating class iln kt

class Mobile{
    // Properties
    var model: String = "100k"
    var price: Float = 1234.5F

    // member function
    fun disp(){
        println("Model: $model  Price: $price")
    }


}


fun main(){

    val lg = Mobile()  // object creation in kt

    lg.disp()

    lg.model = "LG 100k"
    lg.price = 3000.3F
    lg.disp()


    val realMe = Mobile()

    realMe.model = "RealMe 2"
    realMe.price = 5900.99f

    realMe.disp()
}
