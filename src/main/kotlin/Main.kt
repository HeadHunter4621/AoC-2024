import java.io.File
import kotlin.math.abs

val data = File("src/input.txt").readText()

var splittingIncriment = 0
var addingIncriment = 0

var pairDifference = 0
var totalDifference = 0

var leftList = mutableListOf<Int>()
var rightList = mutableListOf<Int>()

var sortedLeftList:List<Int> = mutableListOf<Int>()
var sortedRightList:List<Int> = mutableListOf<Int>()

var leftNumber = 0
var rightNumber = 0

fun main () {

    val line: List<String> = data.split("\n")
    for (elements in line) {
        val numbers = line[splittingIncriment].split("   ")

        leftNumber = numbers[0].toInt()
        rightNumber = numbers[1].toInt()

        leftList.add(leftNumber)
        rightList.add(rightNumber)

        leftList.sort()
        rightList.sort()

        splittingIncriment += 1
    }

    for (element in leftList) {
        pairDifference = abs(leftList[addingIncriment] - rightList[addingIncriment])
        totalDifference += pairDifference
        addingIncriment += 1
    }
    println(leftList)
    println(rightList)
    println(totalDifference)
}