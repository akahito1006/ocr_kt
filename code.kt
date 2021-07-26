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