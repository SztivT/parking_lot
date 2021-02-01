import java.util.*

// do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main() {
    // implement your code here
    val scanner = Scanner(System.`in`)
    val height = scanner.nextInt()
    val length1 = scanner.nextInt()
    val length2 = scanner.nextInt()
    val width = scanner.nextInt()
    val box1 = Box(height, length1, width)
    val box2 = box1.copy(length = length2)
    println(box1)
    println(box2)
}