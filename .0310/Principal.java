import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Metodos meto = new Metodos(10);
        int escolha;

        do {

            System.out.println("Selecione a ação desejada:");
            System.out.println("1 - Cadastrar");
            System.out.println("2- Listar todos os nomes");
            System.out.println("3 - Alterar");
            System.out.println("4- Remover");
            System.out.println("5 - Finalizar");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome:");
                    String nome = ler.next();
                    meto.cadastrar(nome);
                    break;
                case 2:
                    System.out.println("Listagem de todos os nomes cadastrados:");
                    meto.listar();
                    break;
                case 3:
                    System.out.println("Digite a posição desejada:");
                    int posicao = ler.nextInt();
                    System.out.println("Digite o novo nome:");
                    String novoNome = ler.next();
                    meto.alterar(posicao, novoNome);
                    break;
                case 4:
                    System.out.println("Digite o número da posicao para excluir:");
                    int opcao = ler.nextInt();
                    meto.excluir(opcao);
                    break;
                case 5:
                    System.out.println("Sistema finalizado!");
                    break;
                default:
                    System.out.println("Numero invalido. Tente novamente");
                    escolha = ler.nextInt();
                    break;
            }

        } while (escolha != 5);

    }
}
