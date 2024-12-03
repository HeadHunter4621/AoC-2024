import java.io.File
import kotlin.math.absoluteValue

val data = File("input.txt").readLines()

var safeTotal = 0
var reportTick = 0
var levelTick = 0
var increasing = false

fun main () {
    val reportList = data.split("\n")
    for (element in reportList) {
        var report = element.split(" ")
        if (checkReport(report) == true) {safeTotal += 1}
        println(report)

    println(safeTotal)
}

fun checkReport(report: List<String>):Boolean {
    if (report[1] > report[0]) {
        increasing = true
    }else{
        increasing = false
    }

    if (increasing) {
        return report.zipWithNext().all { (a, b) -> (a < b) && ((a.toInt()-b.toInt()).absoluteValue <= 3)}
    }else{
        return report.zipWithNext().all { (a, b) -> (a > b) && ((a.toInt()-b.toInt()).absoluteValue <= 3)}
    }
}