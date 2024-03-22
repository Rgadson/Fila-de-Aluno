package visao;

public class MinhaClasse {

    public static void main(String[] args) {
        FilaAplicacaoJava fila = new FilaAplicacaoJava();

        fila.incluirNaFila("João");
        fila.incluirNaFila("Maria");
        fila.incluirNaFila("Pedro");

        fila.mostrarFila();
    }
}

