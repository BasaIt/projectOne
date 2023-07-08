



fun main(){
    val dataAuto = getDataAuto()

    val dataMovie = getDataMovie()

    val dataDroid = getDataDroid()

    val adType = readln()
    val steps = readln().toInt()
    var currentStep = 0
    do{
        currentStep++

        when(adType){
            "Авто" -> {
                showBillBoard(dataAuto)
            }
            "Кино" -> {
                showBillBoard(dataMovie)
            }
            "Дроиды" -> {
                showBillBoard(dataDroid)
            }
        }

        println()
    }while(currentStep < steps)
}

fun getDataAuto(): Array<String> {
    // Ваш код здесь
    val dataAuto = arrayOf("Только сегодня! Спорткар за 9990 кредитов! Спешите купить!","Встречайте первый Галактический спорткар с открытым верхом. Ограниченная серия уже в нашем магазине!","Опаздываешь на важные встречи? Покупай спорткар с квантовым двигателем всего за 29990 кредитов!")
    return dataAuto
}

fun getDataMovie(): Array<String> {
    // Ваш код здесь
    val dataMovie = arrayOf(
        "Новая часть культовой саги \"Звездные волны XIX\". Только в IMax5D!","Что победит - деньги или любовь? Продолжение легендарного фильма \"Летучая мышь в черном\" уже в кинотеатрах!","Ежегодная часть \"Елочки-Иголочки\" уже в кино! Скорее в кинотеатры!")
    return dataMovie
}

fun getDataDroid(): Array<String> {
    // Ваш код здесь
    val dataDroid = arrayOf("Заметил, что дроид уже не так эффективно работает? Чип IAMD уже в магазинах! Обнови своего дроида!","Мощнее в 1,5 раза! Дороже в 2 раза! Приобретай нашего дроида!","Любишь дорогих роботов? Прошлые поколения уже не радуют? Только для тебя! Золотой дроид с инкрустацией драгоценными камнями за 20000 кредитов!")

    return dataDroid
}

fun showBillBoard(data: Array<String>) {
    // Ваш код здесь
    for (i in data.indices)
        println(data[i])
}




//fun getDataAuto(): Array<String> {
//    // Ваш код здесь
//    val dataAuto = arrayOf("Только сегодня! Спорткар за 9990 кредитов! Спешите купить!",
//        "Встречайте первый Галактический спорткар с открытым верхом. Ограниченная серия уже в нашем магазине!",
//        "Опаздываешь на важные встречи? Покупай спорткар с квантовым двигателем всего за 29990 кредитов!")
//    var name = readln().toString()
//    var number  = readln().toInt()
//    var count = 0
//    when(name) {
//        "Авто" -> {
//            do {
//                for (i in dataAuto.indices)
//                    println(dataAuto[i])
//                count++
//            } while (count != number)
//        }
//    }
//    return dataAuto
//}
//fun getDataMovie(): Array<String> {
//    // Ваш код здесь
//    val dataMovie = arrayOf(
//        "Новая часть культовой саги \"Звездные волны XIX\". Только в IMax5D!",
//        "Что победит - деньги или любовь? Продолжение легендарного фильма \"Летучая мышь в черном\" уже в кинотеатрах!",
//        "Ежегодная часть \"Елочки-Иголочки\" уже в кино! Скорее в кинотеатры!"
//    )
//    var name = readln().toString()
//    var number = readln().toInt()
//    var count = 0
//    when (name) {
//        "Кино" -> {
//            do {
//                for (i in dataMovie.indices)
//                    println(dataMovie[i])
//                count++
//            } while (count != number)
//        }
//    }
//    return dataMovie
//}
//fun getDataDroid(): Array<String> {
//    // Ваш код здесь
//    val dataDroid = arrayOf("Заметил, что дроид уже не так эффективно работает? Чип IAMD уже в магазинах! Обнови своего дроида!",
//        "Мощнее в 1,5 раза! Дороже в 2 раза! Приобретай нашего дроида!",
//        "Любишь дорогих роботов? Прошлые поколения уже не радуют? Только для тебя! Золотой дроид с инкрустацией драгоценными камнями за 20000 кредитов!")
//    var name = readln().toString()
//    var number  = readln().toInt()
//    var count = 0
//    when(name){
//        "Дроиды"->{
//            do {
//                for (i in dataDroid.indices)
//                    println(dataDroid[i])
//                count++
//            }while (count != number)
//        }
//    }
//    return dataDroid
//}
//fun showBillBoard(data: Array<String>) {
//    // Ваш код здесь
//    val data = arrayOf(
//        "Только сегодня! Спорткар за 9990 кредитов! Спешите купить!",
//        "Новая часть культовой саги \"Звездные волны XIX\". Только в IMax5D!",
//        "Заметил, что дроид уже не так эффективно работает? Чип I.A.M.D.N. уже в магазинах! Обнови своего дроида!"
//    )
//    var name = readln().toString()
//    var number = readln().toInt()
//    var count = 0
//    for (i in data.indices)
//        println(data[i] + "\n")
//}
//fun arrray(){
//    val dataAuto = arrayOf(
//        "Только сегодня! Спорткар за 9990 кредитов! Спешите купить!"
//    )
//
//    val dataMovie = arrayOf(
//        "Новая часть культовой саги \"Звездные волны XIX\". Только в IMax5D!"
//    )
//
//    val dataDroid = arrayOf(
//        "Заметил, что дроид уже не так эффективно работает? Чип I.A.M.D.N. уже в магазинах! Обнови своего дроида!"
//    )
//
//    // пишите свой код здесь
//    var name = readln().toString()
//    var number  = readln().toInt()
//    var count = 0
//
//    when(name){
//        "Авто" ->{
//            do {
//                for (i in dataAuto.indices)
//                    println(dataAuto[i])
//                count++
//            }while (count != number)
//        }
//        "Кино"->{
//            do {
//                for (i in dataMovie.indices)
//                    println(dataMovie[i])
//                count++
//            }while (count != number)
//        }
//        "Дроиды"->{
//            do {
//                for (i in dataDroid.indices)
//                    println(dataDroid[i])
//                count++
//            }while (count != number)
//        }
//    }
//}

