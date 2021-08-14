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