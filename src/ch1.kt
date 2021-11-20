import java.lang.Exception
import java.lang.NullPointerException
import java.util.*
import javax.security.sasl.AuthorizeCallback

//fun main(){
//    print("Hello Kotlin")
//}

//fun main(args:Array<String>){
//    print("Hello Kotlin")
//}

/* Multi-line
  comment */

// single line comment...


/* Data types */

//val i = "hello"
//
//fun main(){
//    print(i)
//}

/*  variables   */

//fun main(){
//    var roll = 10
//    var mobileNumber = 999999999L
//    var price = 90.2f
//    var totalCost = 234325.343
//    var gender = 'F'
//    var name = "Sonam"
//    var isActive = true
//
//    println(roll)
//    println(mobileNumber)
//    println(price)
//    println(totalCost)
//    println(gender)
//    println(name)
//    println(isActive)
//}


// specific type

//fun main(){
//    var roll:Int = 10
//    var mobileNumber:Long = 999999999L
//    var price:Float = 90.2f
//    var totalCost:Double = 234325.343
//    var gender:Char = 'F'
//    var name:String = "Sonam"
//    var isActive:Boolean = true
//
//    println(roll)
//    print(name)
//}

// # Dynamic Type

//fun main(){
//    val i:Int = 10 // Constant
//
//
//    println(i)
//
//    println(10 + 20)
//    val a = 10
//
//    println(a)
//
//    println("Value is $a")
//    // or
//    println("Value is "+ a)
//
//
//    val b = 20
//    println("Value a=$a and b=$b")
//    println("Value of a+b = ${a+b}")
//}



/* Arithmetical Operators */

//fun main(){
//    val a = 5
//    val b = 2
//
//    println(a+b)
//    println(a-b)
//    println(a*b)
//    println(a/b)
//    println(a%b)
//
//    for (i in b..a)
//        println(i)
//
//}

/* Comparison Operator */

//fun main(){
//    val a = 5
//    val b = 2
//    println(a==b)
//    println(a!=b)
//    println(a<=b)
//    println(a>=b)
//    println(a<b)
//
//}

/********* Equality and Inequality Operators **********/

//fun main(){
//    val a = 5
//    val b = 5
//    println(a == b)
//    println(a != b)
//
//}


/************* Logical Operators ***************/

//fun main(){
//    val a = 30
//    val b = 20
//    val c = 10
//
////    println( (a > b) && (b > c) )
////    println( (a > b) || (b > c) )
////    println( (a < b) && (b > c) )
////    println( (a < b) && (b > c) )
//
//println(!(a<b))
//
//
//}

/************ Increment and Decrement Operator  **********/

//fun main(){
//    var a = 5
//    println(a++) // here a is still 5
//    println(a)  // but here a is updated to 6
//    println(a--) // here a is still 6
//    println(a) // but here a is updated to 5
//
//    println(++a)
//    println(--a)
//
//}


/************ Augmented Assignment *********/
//
//fun main(){
//    var a =20
//
//    a+=5
//    println(a)
//
//    a*=5
//    println(a)
//
//    a-=5
//    println(a)
//
//    a/=5
//    println(a)
//
//    a%=5
//    println(a)
//
//
//}


/************* User Input ************/

// # Using readLine()

//fun main(){
//    print("Enter Your Name:  ")
//    val name: String? = readLine()      // null safety...
//
//    println(name)
//
//    println(name!!::class.simpleName)
//}

//
//fun main(){
//    var i:Int = 10
//    while (true){
//        println(i)
//        i=2+3*i
//    }
//}


//fun main(args:Array<String>){
//
//    print("Enter Name: ")
//   var name:String? = readLine()
//
//    println("Name:$name")
//    // to check data type; variablename!!::class.simpleName it will return datatype....
//    println(name!!::class.simpleName) // !! is required for null safety
//
//    var i = readLine()!!.toInt()    // use !! after readline()
//    println("i:$i")
//    println(i::class.simpleName)
//
//    var f = readLine()!!.toFloat()
//
//    println("f: $f")
//    println(f::class.simpleName)
//
//
//
//}

 // Taking input via scanner class...
//fun main(){
//    var scanner = Scanner(System.`in`)
//    val name = scanner.next()
//    println("Name:$name")
//    println(name::class.simpleName)
//    var roll = scanner.nextInt()
//    println("Roll:$roll")
//    println(roll::class.simpleName)
//
//}


/****************** String     ***************/
/* String are immutable. Once you initialize a string, you can't change it's value or assign a new value to it. All operations that
* transforms strings return their result in a new string object, leaving the original string unchanged...  */


//fun main(){
//    val str:String = "Hello"
//    println(str)
//    println(str[0])
//    println(str[2])
//    for(i in str){
//        println(i)
//    }
//}

// String concatenation...
//fun main(){
//    val str1: String = "Hello"
//    val str2: String = "World"
//
//    println(str1+ " " + str2)
//
//    println("100" + 40)
//   // println(40 + "400") it gives error
//
//}



// Stirng literals
// # Escape string

//fun main(){
//    println("Hello\nworld!")
//    println("Hello\tworld!")
//    println("Hello\\&*&&*&*") // out of topic but useful
//
//    val msg = """Hello this is a paragraph and
//         It will help in writing in second line
//         and third line
//    """.trimMargin()        // use either .trimIndent() or .trimMargin()
//
//    println(msg)
//}


/** String Template */

//fun main(){
//    val str  = "Kotlin"
//    val str2 = "World"
//    println("This is  $str")
//
//    println("$str $str2")
//
//    println("${str.uppercase()}")
//}


/*************** If expression **********************/


//fun main(){
//    val a = 20
//    val b = 10
//    var max = 0
//
//    if (a>b){
//        println("true")
//    }
//    else{
//        println("False")
//    }
//
//    if (a>b) max = a
//
//    println(max)
//
//    var min = 0
//
//    min = if(a>b) b else a
//    println("Min:$min")
//}


/** when Expression */
// // similar to switch
//fun main(){
//    val x = 33
//
////    when(x){
////        1 -> print("One")
////        2,4,6,8 -> print("Even nos")
////       in 10..50 -> print(" if any thing comes form 10 to 50 ")
////        7 -> { println("to write")
////                println("Multiple statements")
////                }
////        else -> print("No not valid")
////    }
//
//    when("Sat"){
//        "Sunday", "Sat" -> println("Holiday")
//        "Monday" -> println("Working day")
//    }
//}


/************* FOR LOOP **********************/

// Syntax for(item in collection)

//fun main(){
////    for(item in 1..6) println(item)
//    for(item in 1..6){
//       print("Step: ")
//        println(item)
//    }
//
//    for(item in 6 downTo 1){
//        print("Step: ")
//        println(item)
//    }
//var n = 9
//    for(i in 1..n)
//    {
//        for(k in i..n-1 ) print(" ")
//        for (j in 1..i){
//            print("*")
//        }
//        println("")
//    }
//
//
//}


/********* While loop */

//fun main(){
//    var x = 0
//    while(x < 6){
//     x++
//
//     println(x)
//    }
//}

//fun t(){
//    println("Hello from t()")
//}
//
//fun t1(): Int {
//    println("Hello from a returning")
//    return 5
//}
//
//fun sum(a: Int, b: Int): Int{
//
//    return a+b
//}
//fun main(args:Array<String>){
//
//    t()
//    println(t1())
//
//    println("Sum: ${sum(4,6)}")
//
//    try{
//    println(args[0])
//    }
//    catch (e: Exception){
//        println(e)
//    }
//}


// Higher Order Function
//fun main(){
//
//    hOF(10, 20, ::sum)
//}
//fun hOF(a: Int, b:Int, callback:(Int, Int) -> Int){
//    println(callback(a,b))
//}
//
//
//
//fun sum(a: Int, b: Int): Int{
//
//    return a+b
//}

// Lambda Expression
//
//fun main(){
//   var add =  {a: Int, b: Int -> a + b}
//
//    println(add(4, 6))
//
//    val mul:(Int, Int) -> Int ={a,b -> a*b}
//
//    println(mul(4,6))
//}
//
//fun main(){
////    hOF(10, 20, { a:Int, b:Int -> a+b })
//    hOF(10, 20  ){ a:Int, b:Int -> a+b }
//
//}
//fun hOF(a: Int, b:Int, callback:(Int, Int) -> Int){
//    println(callback(a,b))
//}

// #Anonymous Function

//
//fun  main(){
//   var add =  fun(a:Int, b:Int):Int { return a+b}
//
//
//    println(add(3,2))
//}


/************************ Null safety *****************************/

//fun main(){
//    var name1:String = "Kushagra"   // IT can not be null
//   //  name1 = null  it is not allowed
//
//    var name2:String? = "Upadhyaya"         // String? allows name2 to have null value
//
//    var name1len = name1.length
//    println(name1len)

//    var name2len = name2.length // length property not works in string that allow null
    // Option 1: check null in condition

//    var name2len = if (name2 != null ) name2.length else -1
//    println(name2len)

    // Option 2: Safe call
//    var name2len = name2?.length        // name2? indicates that if name2 is null it gives null and if not null then length
//    println(name2len)
//    name2 = null
//      name2len = name2?.length        // name2? indicates that if name2 is null it gives null and if not null then length
//    println(name2len)

    //Option 3: the !! Operator
    // the not-null assertion operator(!!) converts any value to a non-null type and throws an exception if the value is null


//
//    var name2len = name2!!.length
//
//    println(name2len)

    // but if it will be null then it will throw exception




//}



/****************** Array ********************/

// # arrayOf()

//fun main(){

//    var data = arrayOf("Kushagra", "Upadhyaya", 21, 'M')
////    println(data[1])
//
//    for(i in 0..data.size - 1){
//        println(data[i])
//    }


//    var data1 = arrayOf<String>("Kushagra", "Upadhyaya")

//    for(x in 0..data1.size-1){
//        println(data1[x])
//    }
//
//    data1[0] = "Manas"
//
//    println(data1[0])


    // or use set

//    data1.set(0, "Kushagra")
//    println(data1[0])

//    var e = data1.get(0)
//    println(e)

//    data1.set(2,"Computer Science Engineering")     // # it gives error
//    println(data1[2])

    // we can not add value to the array , it size is fixed


    // Loop Array and their Index

//    for (name in data1.indices){
//
//        println(" index:$name value:${data1[name]}")
//    }
//

    /********** For each loop  */
//
//    data1.forEach { name-> println(name) }
//
//
//}


// # Array () constructor

//fun main(){
//    val roll = Array(5,{i-> i*2})
//        for(rl in roll){
//            println(rl)
//        }
//}



// # Built-in Methods
//fun main(){
//    val roll = intArrayOf(111,112,113,114)  // here i is small in int
//        for(rl in roll){
//            println(rl)
//        }
//
//        val ch = charArrayOf('M', 'F')
//        for(i in ch){
//            println(i)
//        }
//}


/******** User Input Array ****************/

//fun main(){
//    print("Enter Number of Student: ")
//    val num = readLine()!!.toInt()
//    println(" ")
//    print("Enter student name: ")
//    val students = Array(num) {readLine()!!}
//
//    for (student in students){
//        println(student)
//    }
//
//}


/**************** List ***********************/

// List is an ordered collection with access to elements by indices - integers numbers that reflect their position.
// Elements can occur more than once in a list.

//fun main(){

//    val data = listOf("Kushagra", "Upadhyaya", 21, 'M', "Kushagra")
//
//    println(data)           // it gives data inside square brackets
//
//    for ( i in data.indices){
//        println(data[i])
//    }
//
//    println(data.get(2))
//
//    println(" size of data: ${ data.size }")
//
//    data.forEach{d -> println(d)}


    /****** List is umMutable by default  so no update and no adding of extra elements" **/
//    println(" /****** List is umMutable by default  so no update and no adding of extra elements\" **/")
//    val names = listOf<String>("Kushagra", "Upadhyaya")
//
//    println(names)


//    val data = mutableListOf("Kushagra", "Upadhyaya", 21, 'M')
//
//    for(i in data){
//        println(i)
//    }
//
//    println(" Size of data: ${data.size}")
//
//    // # to update it
//    data[2] = 22
//    println(data)
//
//    // to add a new data
//
//    data.add(4,"Btech")
//
//    println("data: $data and size of data: ${data.size}")
//
//
//   val x =  data.removeAt(4)
//    println("Updated List: $data and deleted Element is: $x")
//
//
//}


// # Use Input in list
//fun main(){
//
//    val num = readLine()!!.toInt()
//        val students = List<String>(num){readLine()!!}          // to take elements in list by user using list constructor
//
//        for ( i in students){
//            println(i)
//        }
//}




/*************** Set *******/

// set is a collection o unique elements. It reflects the mathematical abstraction of set: a group of objects without repetition
// Generally, the order of set elements has no significance. set is unordered


//fun main(){
//
//    val data = setOf("Kushagra", "Upadhyaya", 21, 'M', "Kushagra")  //  it removes repeated elements automatically
//
//    println(data)
//
//    for ( i in data){
//        println(i)
//    }
//    println(data.size)
//
//    val data1 = setOf<String>("Kushagar", "Upadhyaya")
//    println(data1)
//
//    var data3 = mutableSetOf("Kushagra", "Upadhyaya", 22)
//    println(data3)
//
//    // we can not update in set, but remove and add
//
//    data3.remove(22)
//    println(data3)
//
//    data3.add("22")
//    println(data3)
//
//}