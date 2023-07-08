fun main() {
//        val analyze = "Анализ"
//        val pay = "Оплата"
//        val cancel = "Отмена"
//
//        printMainMenu()
//        val selectedItemMenu = readItemMenu()
//        when(selectedItemMenu){
//            analyze -> analyzeOrder()
//            pay -> payOrder()
//            cancel -> cancelOrder()
//        }
//}
fun printMainMenu() {
    // Ваш код здесь
    println("1. Посчитать стоимость продуктовой корзины")
    println("2. Оплатить покупку")
    println("3. Отменить покупку")
}
fun readIemMenu(): String {
    // Ваш код здесь
    val choice = readln()
    when(choice){
        "Анализ" -> println("Идет анализ продуктовой корзины\n")

        "Оплата" -> println("Происходит процесс оплаты\n")

        "Отмена" -> println("Идет отмена покупки\n")
    }
    return choice
}
fun analyzeOrder() {
    // Ваш код здесь
    val array = mutableListOf<String>("Макарошки", "" +
            "Гречка", "Сало",
        "Пшено", "Рис",
        "Кусок металла")
    val arr = mutableListOf<Int>(14, 69, 240, 31, 46, 10_000)
    var food = ""
    var count = 0
    var flag = false
    do {
        for (i in array.indices){
            food = readln().toString()
            if (array[i] in food){
                count+= arr[i]
                flag = true
                continue
            }else{
                flag = false
                println("Товар \"$food\" не найден в базе данных")
                break
            }
        }
        if (flag)
            println("Стоимость всех товаров в продуктовой корзине: $count кредитов")
        break
    }while (food != "Продуктовая корзина пустая")
}
fun payOrder() {
    // Ваш код здесь
    val food = readln().toString()
    val array = listOf<Int>(14, 69, 240, 31, 46, 10_000)
    val arr = listOf<String>("Макарошки", "Гречка", "Сало", "Пшено", "Рис", "Кусок металла")
    for (i in arr.indices){
        if (arr[i] == food){
            println("Товар \"$food\" стоит " + array[i] + " кредитов\n")
            break
        }
    }
}
fun cancelOrder() {
    // Ваш код здесь
    val arr = mutableListOf<String>("Макарошки", "Гречка", "Сало",
        "Пшено", "Рис", "Кусок металла")
    val array = mutableListOf<Int>(14, 69, 240, 31, 46, 10_000)
    var count = 0
    var food= ""
    do {
        val food = readln().toString()
        if (food != "Продуктовая корзина пустая")
            for (i in arr.indices){
                if (arr[i] == food){
                    count += array[i]
                    break
                }
            }else{
            break
        }
    } while (true)
    println("Стоимость всех товаров в продуктовой корзине: $count кредитов\n")
}
}