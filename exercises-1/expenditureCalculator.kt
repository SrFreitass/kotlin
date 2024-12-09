import kotlin.collections.mutableListOf

fun main() {
    // Arrayof, listOf é tamanho fixo, não é o que queremos
    // Devemos utilizar `mutableList`
    val outstandingBills = mutableListOf<Int>();

    while(true) {
        println("Digite o valor das conta que você deve pagar esse mês: ");
        println("0 - Parar de colocar conta");
        print("R$");
        val value = readln().toInt();

        if(value == 0) break;

        outstandingBills.add(value);
    }

    // methods mutableListOf

    var total = 0;
    var high = 0;
    var low = 0;
    var i = 0;

    outstandingBills.forEach{
        if(i == 0) {
            high = it;
            low = it;
        }

        if(high < it) {
            high = it;
        }

        if(low > it) {
            low = it;
        }

        total += it;
        i++;
    }

    println("O total foi de R$$total");
    println("A média das contas foram: R$${total / outstandingBills.size}");
    println("A conta mais barata a pagar é a de R$$low");
    println("A conta mais cara a pagar é a de R$$high");
}
