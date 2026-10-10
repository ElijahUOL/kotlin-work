// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
// Name: Elijah Luehrmann
// Student Number: 201942447

fun redact(inputDocument: String, textToRedact: String, redactionChar: Char = 'X'): String {
    // Function takes input string provided in the first parameter and replaces the part that is specified
    // in the second parameter with the character provided in the third parameter, or 'X' if none is given

    // Creates a new redacted string of equal length to the text needing to be redacted
    val redactedSubstring = buildString {
        for (i in 0..textToRedact.length - 1) {
            append(redactionChar)
        }
    }
    // Replaces the string specified to be redacted with the redacted string of equal length
    val redactedString = inputDocument.replace(textToRedact, redactedSubstring)
    return redactedString
}