/*********** Constructor *************/

// Primary Constructor

class Person constructor(val name:String, val age:Int){             // datatype is required but val can be removed

    // Properties
    var gender:String = "Female"

    // Member function
    fun disp(){
        println("Name = $name")
        println("Age = $age")
        println("Gender = $gender")
    }

}

fun main(){
    val p1 = Person("Himawari", 8)
    val p2 = Person("Lakshmi", 28)

    p1.disp()
    println("/***********************************/")
    p2.disp()
}