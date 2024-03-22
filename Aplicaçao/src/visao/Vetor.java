package visao;

public class Vetor {

    private int[] vetor;
    private int tamanho;
    private int quantidadeElementos;

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new int[tamanho];
        this.quantidadeElementos = 0;
    }

    public void adicionarElemento(int elemento) {
        if (quantidadeElementos < tamanho) {
            vetor[quantidadeElementos] = elemento;
            quantidadeElementos++;
        } else {
            System.out.println("O vetor está cheio!");
        }
    }

    public void mostrarVetor() {
        for (int i = 0; i < quantidadeElementos; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
