/*********** Constructor *************/

// Primary Constructor

class Human(name:String, age:Int){

    // properties
    var hName:String
    var hAge:Int = age             // to add values from constructor to properties
    var gender:String = "Female"

    // Initializer Block

    init {
        hName = name
//        hAge = age
    }

    // member function
    fun disp(){
        println("Name = $hName")
        println("Age = $hAge")
        println("Gender = $gender")
    }
}

fun main(){
    val h1 = Human("Himawari", 9)

    h1.disp()
}