 /********** Constructor **************/
 // Secondary Constructor

 class People{

 //Properties
    var name:String
    var hAge:Int

     // Secondary Constructor  // scope of name and age is inside constructor only...
     constructor(name:String, age:Int){    // here name:String can not be var , can be val
         println("Constructor Called")

         this.name = name
         hAge = age

     }

// Member functions

     fun disp(){
         println("Name: $name \nAge: $hAge")
     }

 }

 fun main(){

     val p1 = People("Hemawari", 9)
     p1.disp()

 }