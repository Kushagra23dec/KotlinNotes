/********* calling java from kotlin *******/

fun main(){
    val obj = MyJava()

    obj.setValue(23)
    println(obj.getValue())
}