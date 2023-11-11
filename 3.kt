fun dacimalToBinary(decimal: Int): String {
    return Integer.toBinaryString(decimal)
}
    fun main(args: Array<String>) {
print("Введите число в 10-ичной системе: ")
val decimalNumber = readln().toInt()
println("$decimalNumber")
        val binarylNumber = dacimalToBinary(decimalNumber)
        println("Ваше число в 2-ичной системе: $binarylNumber")
    }
