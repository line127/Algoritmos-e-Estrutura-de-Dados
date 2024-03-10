public class Metodos {

    private String[] nomes;
    private int indice;
    private int contagem;

    public Metodos(int contagem) {
        setContagem(contagem);
        nomes = new String[contagem];
        setIndice(0);
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getContagem() {
        return contagem;
    }

    public void setContagem(int contagem) {
        this.contagem = contagem;
    }

    public void cadastrar(String nome) {
        if (indice < contagem) {
            nomes[indice] = nome;
            System.out.println("Cadastro realizado!");
            indice++;
        } else {
            System.out.println("Limite atingido");
        }
    }

    public void listar() {
        for (int i = 0; i < contagem; i++) {
            System.out.println((i + 1) + " - " + nomes[i]);
        }
    }

    public void alterar(int posicao, String novoNome) {
        if (posicao >= 0 && posicao < contagem) {
            nomes[posicao] = novoNome;
            System.out.println("Alteração completa!");
        } else {
            System.out.println("Posição invalida");
        }
    }

    public void excluir(int posicao) {
        for (int i = posicao; i < contagem - 1; i++) {
            nomes[i] = nomes[i + 1];
        }
        indice--;

    }

}
