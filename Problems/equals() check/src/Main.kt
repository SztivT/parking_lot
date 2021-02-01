import java.util.*

data class Client(val name: String, val age: Int, val balance: Int)

val scanner = Scanner(System.`in`)
fun main() {
    val c1 = Client(scanner.next(), scanner.nextInt(), scanner.nextInt())
    val c2 = Client(scanner.next(), scanner.nextInt(), scanner.nextInt())
    println(isClientsEqual(c1, c2))
}
fun isClientsEqual(c1: Client, c2: Client): Boolean {
    if (c1.name != c2.name) return false
    if (c1.age != c2.age) return false
    return true
}