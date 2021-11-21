/********** Constructor **************/
// Primary & Secondary Constructor

class Registration1(_email:String, _password:String){
    //Properties
    var name:String = ""
    var age:Int? = null
    var email:String
    var password:String
    var gender:String = "Female"
    // Secondary Constructor
        constructor(name:String, age:Int, email:String, password: String):this(email,password)
    {
            this.name = name
            this.age = age

        }
    //Initializer Block               it is used for primary constructor
        init{
            password = _password
            email = _email
        }
    //Member Function

    fun disp(){

        println("Name:$name \nAge:$age \nEmail:$email \nPassword:$password \nGender:$gender")
    }
}

fun main(){
    val r1 = Registration1("Himawari", 9,"himawari@gmail.com","hiawwww")

    r1.disp()
}