// Task 12.4.1: main program
fun main() {
    val p = Point(0.0, 0.0)
    val c = Circle(p, 4.0)
    val p1 = Point(1.0, 1.0)
    val p2 = Point(10.0, 10.0)
    println("%.2f".format(c.area()))
    println("%.2f".format(c.perimeter()))
    println (c contains p1)
    println (c contains p2)
}