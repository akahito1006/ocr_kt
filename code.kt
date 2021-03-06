val zero = 0
val message = "Hello world !"
fun sayHello() = "hello everyone"

private lateinit var answer: String
private val question = "What is your name?"
fun main(args: Array<String>) {
    println(question)
    answer = "akahito"
    println("Your name is $answer")
        
}
// $
// What is your name?
// Your name is akahito

// Statementではなく、Expression
var kotlinVariable: String = when (var fortuneParams) {
    "0" -> "大吉"
    "1" -> "中吉"
    "2" -> "小吉"
    else -> "吉"
}
println(kotlinVariable)
// 大吉

// SQL文と可読性
var sql: String = "INSERT INTO customer_list (first_name, last_name, age) VALUES ('Wilman', 'Kala', '23')"

var organizedSQL: String = "INSERT INTO "
organizedSQL += "product_list (item, name, price) "
organizedSQL += "VALUES ('vaporizer', 'eGo ONE', '4,000')"
// INSERT INTO product_list (item, name, price) VALUES ('vaporizer', 'eGo ONE', '4,000')

// create function on Kotlin
fun main(args: Array<String>) {
    println("Hello, World")
}

// the function's parameters are separated by commas
// and to return an Int type value, the colon ":" is gonna be used at the end
private fun minOf(a: Int, b: Int): Int {
    return if (a<b) a else b
}

// in Kotlin, most control structures are expressions but statements
// like even "Hello World" actually returns a "Unit" typed value; the default type created by Kotlin
// also the "Unit" type corresponds to "void" in Java

fun main(args: Array<String>) {
    println("Hello world!")
}

var hello: Unit = main(arrayOf(""))

// functions of readability
// "=" is better than : Type and { braces }
fun sayHello(): Unit { println("Hello") }
fun sayHello(): Unit = println("Hello")
fun sayHello() = println("Hello")

// another example
fun getUrlApi() { return "http://www.nogoodreadability.api.com" }
fun getUrlApi(): String { return "http://www.notbad.api.com" }
fun getUtlApi() = "http://www.mr.readability.api.com"

// question
fun main(args: Array<String>) {

    // write code here!
    println("Welcome OpenClassrooms Students!")

    fun addNumbers(a: Int, b: Int) = a + b
    fun getUsernameUpperCase(username: String) = username.toUpperCase()
    fun isUsernameOfTeacher(username: String) = if (username == "Phil" || username == "George") true else false
    
    println(addNumbers(1, 2))
    println(getUsernameUpperCase("Phil"))
    println(isUsernameOfTeacher("Phil"))
}

// declare functions out of scope of main

fun addNumbers(a: Int, b: Int) = a + b
fun getUsernameUpperCase(username: String) = username.toUpperCase()
// if expressions can be more readable like... only below
fun isUsernameOfTeacher(username: String) = username == "Phil" || username == "George"

fun main(args: Array<String>) {
    println("Result is ${addNumbers(21, 21)}.") // 42
    println("username to uppercase : ${getUsernameUpperCase("phil")}.") // PHIL
    println("teacher? : ${isUsernameOfTeacher("Phil")}.") // true
}

