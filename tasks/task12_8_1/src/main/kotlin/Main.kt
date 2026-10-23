// Task 12.8.1: demo program for Day enum class
fun main() {
    print ("Enter a day of the week: ")
    try {
        val day = Day.valueOf(readln())
        println("Today is $day")
    }
    catch (error: IllegalArgumentException){
        println("Error: Invalid day entered")
        println()
        println("Please enter one of the following:")
        for (day in Day.entries){
            println(day)
        }
    }


}