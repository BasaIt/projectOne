import java.util.Calendar

class Worker(val name : String, val worker: String, val stage : Int) {
    val exception: Int
        get() = Calendar.getInstance().get(Calendar.YEAR)- stage

    fun work() = println("Работаю")
}