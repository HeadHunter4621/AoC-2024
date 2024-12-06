import java.io.File

val rules = File("rules.txt").readLines()
val update  = File("updates.txt").readLines()

/*val rules = """
    47|53
    97|13
    97|61
    97|47
    75|29
    61|13
    75|53
    29|13
    97|29
    53|29
    61|53
    97|53
    61|29
    47|13
    75|47
    97|75
    47|61
    75|61
    47|29
    75|13
    53|13
    """.trimIndent().lines()
val update = """
    75,47,61,53,29
    97,61,53,29,13
    75,29,13
    75,97,47,61,53
    61,13,29
    97,13,75,29,47
    """.trimIndent().lines()*/

var updateList = mutableListOf<List<String>>()
var ruleList = mutableListOf<List<String>>()
var tempRuleList = mutableListOf<List<String>>()

var iRuleRead = 0
var iRuleApply = 0
var iUpdate = 0

var a = 0
var b:List<Pair<<List<String>>>, <List<String>>> = mutableListOf()

fun main () {
    for (elements in rules) { ruleList.add(elements.split("|")) }
    for (elements in update) { updateList.add(elements.split(",")) }

    ruleList.forEach {it.forEach {it.toInt()}}
    updateList.forEach {it.forEach {it.toInt()}}

    //println(updateList)
    //println(ruleList)

    for (elements in updateList) {
        tempRuleList = ruleList
        a = updateList[iUpdate].indexOf(ruleList[iRuleRead][0])
        if (a == -1) {
            tempRuleList.remove(ruleList[iRuleRead])
        }

        b = updateList[iRuleRead].a(updateList[iUpdate])
        println(b)

        iRuleRead += 1
        //println(a)
        //println(tempRuleList)
    }
    //println(ruleList)
}