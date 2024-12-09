import kotlin.system.exitProcess

fun printTodos(todos: MutableMap<Int, Pair<String, Boolean>>) {
    todos.forEach{
        println("${it.key} - ${it.value.first} - Feita?${it.value.second}\n")
    }
}


fun main() {
    val todos = mutableMapOf<Int, Pair<String, Boolean>>()

    println("----- TODO -----")
    while(true) {
        println("1 - Ver tarefas")
        println("2 - Adicionar tarefas")
        println("3 - Alterar status")
        println("4 - Remover tarefa")
        println("5 - Sair")

        val option = readln().toInt()

        when(option) {
            1 -> {
                printTodos(todos);
            }

            2 -> {
                println("A fazer: ")

                val todo = readln()

                if(todo.length == 0) {
                    println("Tarefa inválida!")
                    continue;
                }

                todos.put(todos.size, Pair(todo, false));

                println("Tarefa adicionada!")
            }

            3 -> {
                println("Selecione a tarefa que deseja alterar o status:")
                printTodos(todos);

                val todo = readln().toInt();

                if(todo < 0 || todo >= todos.size) {
                    println("Tarefa inválida!")
                    continue
                }

                val selectedTodo = todos.get(todo);

                if (selectedTodo != null) {
                    todos.set(todo, Pair(selectedTodo.first, !selectedTodo.second))
                };

            }

            4 -> {
                println("Selecione a tarefa que deseja remover:")
                printTodos(todos);

                val todo = readln().toInt();

                if(todo < 0 || todo >= todos.size) {
                    println("Tarefa inválida!")
                    continue
                }

                todos.remove(todo);
                println("Tarefa removida com sucesso!")
            }

            5 -> {
                exitProcess(0)
            }
        }
    }
}