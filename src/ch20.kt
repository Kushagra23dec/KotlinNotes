import java.lang.Exception

/********** Exception Handling **************/

fun main(){

    val result = try{
        val a = 10/2
        a
    }
    catch (e: Exception){
        e.message
    }

    println(result)

}