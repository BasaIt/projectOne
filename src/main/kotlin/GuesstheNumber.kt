


fun main() {
    val game = 1
    val guide = 2
    val exit = 3
    var isFirstStart = true

    while (true) {
        printMainMenu(isFirstStart)
        val selectedItemMenu = readItemMenu()
        when (selectedItemMenu) {
            game -> runGame()
            guide -> showGuide()
            exit -> System.exit(0)
        }
        isFirstStart = false
    }
}

fun printMainMenu(isFirstStart:Boolean) {
    // Ваш код здесь
    if (!isFirstStart)
        println("")
    println("1. Запустить игру")
    println("2. Гид по игре")
    println("3. Выйти из игры")
}

fun readItemMenu(): Int {
    // Ваш код здесь
    val choice = readln().toInt()
    println("Выберите пункт:\n")
    when(choice){
        1 -> println("Идет запуск игры")

        2 -> println("Открывается гид по игре")

        3 -> println("Идет закрытие игры")
    }
    return choice
}

fun runGame() {
    // Ваш код здесь
    println("Введите число:")
    val num = readln().toInt()
    do {
        val number = readln().toInt()
        if (num == number) {
            println("Вы угадали число!")
        } else if (number > 100) {
            println("Число $number лежит за пределами заданного промежутка")
        } else if (num > number) {
            println("Загаданное число больше")
            println("Введите число:")
        } else if (num < number){
            println("Загаданное число меньше")
            println("Введите число:")
        }else{
            break
        }
    } while (num != number)

}

fun showGuide() {
    // Ваш код здесь
    println("Вопрос: Какая цель игры?")
    println("Ответ: Целью игры является отгадывание числа, придуманного ИИ \"Алиса\", за минимальное число попыток.\n")
    println("Вопрос: Сколько дается попыток?")
    println("Ответ: Количество попыток вычисляет Алиса по собственной формуле, и она отказывается раскрывать ее.\n")
    println("Вопрос: Есть ограничение по времени?")
    println("Ответ: Алиса очень терпеливая, она будет ждать вашего ответа до тех пор, пока ее Создатель не забудет оплатить счет за аренду сервера.\n")
}
