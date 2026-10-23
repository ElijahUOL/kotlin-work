// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main () {
    val date = LocalDate(2007, 6, 6)
    val p1 = Person("Elijah", date)
    println(p1.age)
}