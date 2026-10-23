// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main () {
    val date = LocalDate(1997, 8, 23)
    val p1 = Person("ElijaH", date)
    println(p1.name)
}