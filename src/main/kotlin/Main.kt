import java.io.File

//val equations = File("input.txt").readLines()
val equations = """190: 10 19
3267: 81 40 27
83: 17 5
156: 15 6
7290: 6 8 6 15
161011: 16 10 13
192: 17 8 14
21037: 9 7 18 13
292: 11 6 16 20""".lines()

var iEquation = 0


fun main () {
    math(equations[iEquation])

}

fun math(equation:String) {
    var iMath = 0

    var equationParts = equation.split(" ")

    val total = equationParts[0].dropLast(1).toInt()
    var totalLength = total.toString().length

    var numbersidk = mutableListOf(equation.split(" "))
    var numbers = equation.drop(totalLength).split(" ")
    println(numbers)
}