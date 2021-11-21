/********** Constructor **************/
// Primary & Secondary Constructor

class Registration(email:String, password:String){
    //Properties
    var hName:String = ""
    var hAge:Int? = null
    var hEmail:String = email
    var hPassword:String
    var gender:String = "Female"
    // Secondary Constructor
        constructor(name:String, age:Int, email:String, password: String):this(email,password)
    {
            hName = name
            hAge = age

        }
    //Initializer Block               it is used for primary constructor
        init{
            hPassword = password
        }
    //Member Function

    fun disp(){

        println("Name:$hName \nAge:$hAge \nEmail:$hEmail \nPassword:$hPassword \nGender:$gender")
    }
}

fun main(){
    val r1 = Registration("Himawari", 9,"himawari@gmail.com","hiawwww")

    r1.disp()
}