/********* Interface resolve Conflict ************/
interface A{
    fun callMe(){
        println("From Interface A")
    }


}


interface B{
    fun callMe(){
        println("From Interface B")
    }


}

class C: A,B{

    override fun callMe() {
        super<A>.callMe()
        super<B>.callMe()
    }

}

fun main(){
    val obj = C()
    obj.callMe()
}