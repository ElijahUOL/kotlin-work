// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    print("""Pizza Menu:
        |
        |(a) Margherita
        |(b) Quattro Stagioni
        |(c) Seafood
        |(d) Hawaiian
        |
        |Choose your pizza (a-d): 
    """.trimMargin())
    val order = readln().lowercase()
    if (order.length != 1 || order in "e".."z")
    {
        println("Invalid choice!")
    }
    else
    {
        println("Order accepted")
    }
}
