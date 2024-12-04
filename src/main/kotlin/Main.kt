import java.io.File
import kotlin.math.absoluteValue

val data:List<String> = File("input.txt").readLines()
/*val data:List<String> = """
    7 6 4 2 1
    1 2 7 8 9
    9 7 6 2 1
    1 3 2 4 5
    8 6 4 4 1
    1 3 6 7 9
    """.trimIndent().split("\n")*/

var safeTotal = 0
var i = 0
var reportTick = 0
var levelTick = 0
var increasing = false

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

fun main () {
    val reportList = data
    for (element in reportList) {
        var report = element.split(" ")
        if (checkReport(report) == true) {
            safeTotal += 1
        }else{
            safeTotal += 0
        }
        println("$report  ${checkReport(report)}")
    }
        println(safeTotal)
}

