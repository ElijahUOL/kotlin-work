// Task 4.7: finding the longest line in a file
import kotlin.io.path.Path
import kotlin.io.path.forEachLine


fun main (args: Array<String>)
{
    val filePath = Path(args[0])
    var currentLine = 1
    var longestLineLength = 0
    var longestLine = 0
    filePath.forEachLine()
    {
        if (it.length > longestLineLength)
        {
            longestLineLength = it.length
            longestLine = currentLine
        }
        currentLine++
    }
    println("Line $longestLine is the longest (length = $longestLineLength)")
}