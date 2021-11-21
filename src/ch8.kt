/******** Getter and Setter ***********/
class User(_id:Int, _name:String, _age:Int){

    val id:Int = _id
    get() = field

    var name:String = _name
    get() = field
    set(value){
        field = value
    }

    var age:Int = _age
        get() = field
        set(value){
            field = value
        }
}

fun main(){
    val u = User(1,"Himawari",9)
    println(u.id)
    println(u.name)
    println(u.age)


    u.name = "Shinichi"
    u.age = 13

    println(u.id)
    println(u.name)
    println(u.age)

}