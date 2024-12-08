import kotlin.random.Random

fun main() {
    val theNumber = Random.nextInt(0, 100);
    var count = 0;

    while(true) {
        val num = readln().toInt();
        count++;

        if(num == theNumber) {
            println("Você acertou o número misterioso!");
            println("Foram $count tentativas!")
            break;
        } else if(num > theNumber) {
            println("Número misterioso é menor!");
        } else {
            println("Número misterioso é maior!");
        }
    }
}
