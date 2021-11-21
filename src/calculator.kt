

class Calculator{

    // methods

    fun sum(a:Int, b:Int):Int{
        return a+b
    }

    // MULtiplication
    fun mul(a:Int, b:Int):Int{
        return a*b
    }

    fun sub(a:Int, b:Int):Int{
        return a-b
    }

    fun div(a:Int, b:Int):Int{
        return a/b
    }

    fun mod(a:Int, b:Int):Int{
        return a%b
    }

}

fun main(){

    val c1 = Calculator()

    print("Enter Two Integers: ")
    val a:Int = readLine()!!.toInt()
    val b:Int = readLine()!!.toInt()



    print("Enter 1 for Sum , 2 for Multiplication , 3 for Subtraction , 4 for division , 5 for modulo::  ")
    val ch:Int = readLine()!!.toInt()

    // when statement

    when(ch){

        1 ->     println("$a + $b =  ${ c1.sum(a, b) }")
        2 ->     println("$a * $b =  ${ c1.mul(a, b) }")
        3 ->     println("$a - $b =  ${ c1.sub(a, b) }")
        4 ->     println("$a / $b =  ${ c1.div(a, b) }")
        5 ->     println("$a % $b =  ${ c1.mod(a, b) }")

        else ->     println("Enter no b/w 1 and 5")




    }


}