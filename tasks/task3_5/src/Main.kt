// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main()
{
    // Add your code here
    val filePath = Path("test.txt")
    val text = "Hello World! "
    filePath.writeText(text)
    filePath.appendText("Nevermind, goodbye")
    val textInFile = filePath.readText()
    println (textInFile)
}
