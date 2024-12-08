fun main() {
   if(isOdd(3) == 0) {
       println("Is odd");
   } else {
       println("Is even");
   }

    // Não precisa de ordem ao colocar o nome da variável e =
    println(sum(n2 = 2))
}

// Tipando função, similar ao TypeScript, não infere função
fun isOdd(number: Int): Int {
    return number % 2;
}

// Argumento padrão
fun sum(n1: Int = 1, n2: Int): Int {
    return n1 + n2;
}



