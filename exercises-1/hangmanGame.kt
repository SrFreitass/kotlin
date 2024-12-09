import kotlin.random.Random
import kotlin.system.exitProcess

fun verifyWord(wordHidden: List<String>, word: List<String>): Boolean {
    var count = 0

    wordHidden.forEach {
        if(it !== "_") {
            count++
        }
    }

    return count == word.size - 2
}


fun main() {
    val words = listOf("BANANA", "KOTLIN", "JAVA", "JAVASCRIPT", "CEBOLA", "MACACO", "ONITORRINCO")
    var lifes = 5;

    val word = words[Random.nextInt(0, words.size - 1)].split("")
    val wordHidden = mutableListOf<String>()

    word.forEach{
        if(it != "") {
            wordHidden.add("_")
        }
    }

    while (true) {


        println(wordHidden)
        println("\nVIDAS: $lifes")

        val character = readln()

        if(character.length > 1 || character.length < 1) {
            println("Letra inválida!")
            continue
        }


        if(wordHidden.contains(character)) {
            println("Você já colocou essa letra!")
            continue
        }

        var contains = false

        for ((i, char) in word.withIndex()) {
            if(char == character) {
                wordHidden[i-1] = character
                contains = true
            }
        }

        if(!contains) {
            println("Você errou! Perdou uma vida!")
        }

        if(!contains && --lifes <= 0) {
            println("VOCÊ PERDEU O JOGO DA FORCA! IT'S OVER")
            exitProcess(0)
        }

        if(verifyWord(wordHidden, word)) {
            println("VOCÊ GANHOU O JOGO DA FORCA!")
            exitProcess(0)
        }
    }
}