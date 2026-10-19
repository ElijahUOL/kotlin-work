// Task 12.1: program that uses a Point object
fun main () {
    val p = Point(1.0, 1.0)
    val p1 = Point(4.5, 7.0)
    println(p.x)
    println(p.y)
    println(p.distance())
    println(p.distanceTo(p1))
}