fun main() {
    val amount = 5000_00
    val commission = if (amount * 0.0075 < 35_00) 35_00 else (amount * 0.0075).toInt()
    println("Комиссия = ${commission / 100} руб. ${commission % 100} коп.")
}