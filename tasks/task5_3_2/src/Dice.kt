// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDie(sides: Int = 6, rolls: Int = 1)
{
    if (sides in setOf(4, 6, 8, 10, 12, 20))
    {
        var numberOfMaxRolls = 0;
        for (n in 1..rolls)
        {
            println("Rolling a d$sides")
            val result = Random.nextInt(1, sides + 1)
            if (result == sides) {
                println("You rolled a natural $result!")
                numberOfMaxRolls++
            } else {
                println("You rolled a $result")
            }
        }
        println("You rolled $numberOfMaxRolls natural $sides s!")
    }
    else
    {
        println("Error: you cannot have a $sides-sided die")
    }
}