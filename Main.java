import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        Metodos m = new Metodos();

        while (opcao != 3) {

            System.out.println("----------");
            System.out.println("1. Cadastro");
            System.out.println("2. Listar");
            System.out.println("3. Finalizar sistema");
            System.out.println("----------");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Nome para cadastro: ");
                    String nome = ler.next();
                    m.cadastrar(nome);
                    break;
                case 2:
                    m.listar();
                    break;
                case 3:
                    System.out.println("Sistema finalizado");
                    break;
                default:
                    System.out.println("Invalido. Tente novamente");
                    opcao = ler.nextInt();
                    break;
            }

        }

    }
}