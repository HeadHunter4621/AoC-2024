import java.io.File

//val input = File("input.txt")
val input = """MMMSXXMASM
    MSAMXMSMSA
    AMXSXMAAMM
    MSAMASMSMX
    XMASAMXAMM
    XXAMMXXAMA
    SMSMSASXSS
    SAXAMASAAA
    MAMMMXMMMM
    MXMXAXMASX""".trimIndent()

val dataX = input.split("\n")
val dataY = mutableListOf<String>()
var xIncrement = 0

fun main () {
    for(elements in dataX){
        dataY.add(dataX[xIncrement])
        xIncrement += 1
    }
    println(dataX[0])
}