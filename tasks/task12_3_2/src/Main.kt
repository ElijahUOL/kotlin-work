// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(20007, 6, 6)
    val dateString = "2007-06-06"
    val p = Person("Elijah Luehrmann", dateString)
    println(p.name)
    println(p.birth)
    println(p.isMarried)
}