// Task 5.3.2: main program
fun main (args: Array<String>)
{
    if (args.size == 0)
    {
        rollDie()
    }
    else
    {
        val sides = args[0].substringAfter("d").toInt()
        val rolls = args[0].substringBefore("d").toInt()
        rollDie(sides, rolls)
    }
}