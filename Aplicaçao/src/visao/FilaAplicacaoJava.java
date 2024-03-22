package visao;

import javax.swing.JOptionPane;

public class FilaAplicacaoJava {

	int inicio;
	int fim;
	int tamanho;
	int quantidadePessoas;
	String F[];

	public FilaAplicacaoJava() {
		inicio = fim = -1;
		tamanho = 4;
		F = new String[tamanho];
		quantidadePessoas = 0;
	}

	public boolean estaCheia() {
		if (quantidadePessoas == tamanho - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void incluirNaFila(String e) {
		if (!estaCheia()) {
			if (inicio == -1) {
				inicio = 0;
			}
			fim++;
			F[fim] = e;
			quantidadePessoas++;
		} else {
			JOptionPane.showMessageDialog(null, "A fila está cheia!");
		}
	}

	public void mostrarFila() {
		String pessoas = "";
		for (int i = inicio; i <= fim; i++) {
			pessoas += F[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, pessoas);
	}
}

