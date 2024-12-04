import java.io.File

val input = File("input.txt").readLines().toString()
//val input = """xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))"""

val regex = """(?:(?!(?:don't\(\).*?do\(\)).*?).)*mul\((\d+,\d+)\)""".toRegex()
val mulPairList:List<String> = regex.findAll(input).map { it.groupValues[1] }.toList()
var numOne = 0
var numTwo = 0
var pair:List<String> = listOf()
var pairIncrement = 0
var pairMultiplied = 0
var total = 0

fun main () {
    for (elements in mulPairList) {
        pair = mulPairList[pairIncrement].split(",")
        pairMultiplied = pair[0].toInt() * pair[1].toInt()
        total += pairMultiplied
        pairIncrement += 1
        println("$pair   $pairMultiplied")
    }
    println(total)
}