package koans.util

import java.nio.file.Files
import java.nio.file.Paths
import java.io.File

fun errorMessage(functionName: String) =
    "The function '$functionName' is implemented incorrectly\n"


/**
 * function to check whether the Task.kt contain "searchedString" on "lineNumber" line.
 */
fun checkCodeLineContains(
    lineNumber: Int,
    searchedString: String,
    filename: String = "/src/Task.kt"
): Boolean {
    val path = System.getProperty("user.dir")
    val lineString = Files.lines(Paths.get(path + filename))
        .skip((lineNumber - 1).toLong())
        .findFirst()
        .get()

    println("debug lineString = $lineString")

    return lineString.contains(searchedString)
}

/**
 * function to check whether the Task.kt contain "searchedString" on the whole file
 */
fun checkCodeContains(
    searchedString: String,
    filename: String = "/src/Task.kt"
): Boolean {
    val path = System.getProperty("user.dir")
    val fullFilename = path + filename
    val text = File(fullFilename).readText(Charsets.UTF_8)

    println("debug text = $text")

    return text.contains(searchedString)
}
