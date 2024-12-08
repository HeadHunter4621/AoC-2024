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
var iPart = 0


fun main () {
    for (element in equations) {
        val equationSplit = equations[iEquation].split(": ")
        for (element in equationSplit) {
            var part = equationSplit[iPart].split(" ")
            println(part)
            iPart += 1
        }
        println(equationSplit)
        iEquation += 1
    }
}