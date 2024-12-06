import java.io.File

//val inputMap = File("input.txt")
val inputMap = """
    ....#.....
    .........#
    ..........
    ..#.......
    .......#..
    ..........
    .#..^.....
    ........#.
    #.........
    ......#...
    """.trimIndent()
val mapWidth = 9

var direction = "N" //Can be N, E, S, W
var obstructed = false
var atEdge = false
var position = 0

fun checkEdge(): Boolean {
    if (direction == "N") {
        return try {
            direction[position - mapWidth]
            false
        } catch (e: StringIndexOutOfBoundsException) {
            true
        }
    } else if (direction == "E") {
        if (inputMap.get(position + 1) == '#') {
            return true
        } else {
            return false
        }
    } else if (direction == "S") {
        return try {
            direction[position - mapWidth]
            false
        } catch (e: StringIndexOutOfBoundsException) {
            true
        }
    } else if (direction == "W") {
        if (inputMap[position - 1] == '#') {
            return true
        } else {
            return false
        }
    }else{
        return false
    }
}

fun checkObstructed():Boolean {
    if (direction == "N") {
        if (inputMap[position - mapWidth] == '#') {
            return true
        } else {
            return false
        }
    } else if (direction == "E") {
        if (inputMap[position + 1] == '#') {
            return true
        } else {
            return false
        }
    } else if (direction == "S") {
        if (inputMap[position + mapWidth] == '#') {
            return true
        } else {
            return false
        }
    } else if (direction == "W") {
        if (inputMap[position - 1] == '#') {
            return true
        } else {
            return false
        }
    }else{
        return false
    }
}

fun move() {
    if (direction == "N"){
        position += mapWidth
    }else if (direction == "E"){
        position += 1
    }else if (direction == "S"){
        position -= mapWidth
    }else if (direction == "W"){
        position -= 1
    }
}

fun main () {}