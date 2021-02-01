fun main() {
    val productType = readLine()!!
    val price = readLine()!!.toInt()
    val product = Product(price, productType)
    println(totalPrice(product))
}

class Product(val price: Int, val type: String)

fun totalPrice(product: Product): Int {
    val tax = when (product.type) {
        "headphones" -> 1.11
        "smartphone" -> 1.15
        "tv" -> 1.17
        "laptop" -> 1.19
        else -> 0.0
    }
    return (product.price * tax).toInt()
}