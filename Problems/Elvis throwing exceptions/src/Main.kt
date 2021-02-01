fun main() {
    // TODO
    val input = readLine() ?: throw IllegalStateException()
    println("Elvis says: $input")
}

fun isNumber(input: String): Any {
    return if (input.toIntOrNull() != null) input.toInt() else input
}