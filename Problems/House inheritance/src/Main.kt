fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = House(rooms, price)
    println(totalPrice(house))
}

class House(val rooms: Int, val price: Int)

fun totalPrice(house: House): Int {
    val getBasePrice = when {
        house.price < 0 -> 0
        house.price > 1_000_000 -> 1_000_000
        else -> house.price
    }
    val getCoef = when {
        house.rooms <= 1 -> 1.0
        house.rooms in 2..3 -> 1.2
        house.rooms == 4 -> 1.25
        house.rooms in 5..7 -> 1.4
        else -> 1.6
    }
    return (getBasePrice.toDouble() * getCoef).toInt()
}