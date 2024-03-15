import java.util.LinkedList;
import java.util.List;

public class Metodos {

    List<String> nomes = new LinkedList<>();
    private String nome;

    public Metodos(String nome) {
        setNome(nome);
    }

    public Metodos() {

    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrar(String nome) {
        nomes.add(nome);
    }

    public void listar() {
        int i = 0;
        for (String n : nomes) {
            System.out.println((i + 1) + " - " + n);
            i++;
        }

    }
}
