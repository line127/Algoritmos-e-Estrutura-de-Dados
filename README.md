***1) O que é estrutura de dados?***

Estrutura de dados é um conjunto de formatos e regras que estabelece como os dados são organizados e como diversas operações podem ser efetivadas neles. É um modo de gerenciar, organizar e armazenar dados de uma maneira que permite o acesso eficiente e a manipulação eficaz desses dados.

***2) Qual sua importância?***

A estrutura de dados pode fazer diferença na eficiência e no desemprenho de um programa se for escolhida corretamente.
 
***3)Explique e exemplifique as estruturas: array (estático e dinâmico), lista, fila e pilha.***

Array: 

Lista:

Fila: Fila ou **Queue** se comporta da maneira FIFO (First-In-First-Out). Basicamente, o primeiro dado inserido na fila será o primeiro dado a ser removido. Nesse modo de estrutura não é permitido elementos duplicados e possui também métodos especificos para operações como: **add(E elemento)** para adicionar um elemento ao final da fila, **remove()** para remover o elemento da fila e **peek()** para retornar o elemente na frente sem removê-lo. É util estar usando o método fila para agendar tarefas em um sistema de computação distribuído. **Exemplos:** fila da impressão, pedidos de uma fila de atendimento.

`Queue <String> fila = new LinkedList<>();`

`fila.add("Alice");`

`fila.add("Barbara");`

`String removido = fila.remove();`

Pilha: Pilha ou **Stack** se comporta da maneira LIFO (Last-In-First-Out), parecido com o comportamento do fila, porém o stack é de maneira contrária, o último dado a entrar é o primeiro dado a sair. O padrão de pilha é comumente utilizado em programação para realizar operações como desfazer ações (undo), rastreamento de chamadas de função, análise de expressões matemáticas e muito mais. Seus métodos são **push, pop e peek**, em sequencia, adiciona um elemento ao topo da lista, remove e retorna um elemento para o topo e retorna o elemento no topo da pilha sem removê-lo. É util usar pilha quando você precisa processar itens de ordem reversa. **Exemplos:** histórico de ações em um editor de texto (desfazer), navegação de páginas de navagador (voltar).

`Stack<String> pilha = new Stack<>()`

`pilha.push("Elemento 1")`

`pilha.push("Elemento 2")`

`System.out.printl("Exibindo o topo da pilha sem remover" + pilha.peek());`

`while (!pilha.isEmpty()){`

`String  elementoRemovido = pilha.pop();`

`System.out.printl("Elemento removido:" + elementoRemovido);`





