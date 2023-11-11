fun main(args: Array<String>) {
    print("Введите 1 число:")
    var number1 = readln().toDouble()
    print("Введите 2 число:")
    var number2 = readln().toDouble()
    print("Введите операцию (*, /, +, -):")
    var operator = readln()

        var result = when (operator){
            "*" -> number1 * number2
            "/" -> number1 / number2
            "+" -> number1 + number2
            "-" -> number1 - number2
            else -> {
                println("Такой операции нет")
            }

    }
    print("$number1 $operator $number2 = $result :")
}  
