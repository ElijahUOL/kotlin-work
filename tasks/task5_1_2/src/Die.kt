// Task 5.1.2: rollDie() function
import kotlin.random.Random

fun rollDie(sides: Int)
{
    if (sides in setOf(4, 6, 8, 10, 12, 20))
    {
        println("Rolling a d$sides")
        val result = Random.nextInt(1, sides + 1)
        if (result == sides)
        {
            println("You rolled a natural $result!")
        }
        else
        {
            println("You rolled a $result")
        }
    }
    else
    {
        println("Error: you cannot have a $sides-sided die")
    }
}