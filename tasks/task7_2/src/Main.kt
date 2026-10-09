// Task 7.2: array comparison
fun main () {
    val numbers = intArrayOf(9, 6, 3, 2)

    val cls = numbers::class

    println(cls.qualifiedName)
    println(cls.java)

    val x = intArrayOf(9, 3, 6, 2, 8, 5)
    println(x[0])
    x[5] = 0
    for (i in x) {
        print("$i, ")
    }
    println()
    val y = x.slice(2..4)
    for (i in y) {
        print("$i, ")
    }
    println()
}