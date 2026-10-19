// Task 12.3.3: Person class with initialiser block
import kotlinx.datetime.LocalDate

class Person (var name: String, val birth: LocalDate) {
    constructor(name:String, birth:String) : this(name, LocalDate.parse(birth))
    var isMarried = false

    init {
        require(name.isNotBlank()) {"Error: Name cannot be blank"}
    }
}