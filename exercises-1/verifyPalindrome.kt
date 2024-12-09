import kotlin.system.exitProcess

fun main() {
    val word = readln().uppercase().trim()

    var j = word.length-1


    for(char in word) {
        if(char != word.get(j)) {
            println("Não é palindroma")
            exitProcess(0)
        }

        j--
    }

    println("É palindroma")
}
