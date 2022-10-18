public class App {
	public static void main(String[] args) {
		UsoDeVaga uso = new UsoDeVaga("A1");
		UsoDeVaga uso2 = new UsoDeVaga("A2");

		uso.registrarEntrada(12, 0);
		uso.registrarSaida(13, 31);

		uso2.registrarEntrada(12, 0);
		uso2.registrarSaida(13, 0);

		int tempo = uso.tempoDeUso();
		System.out.println("Tempo de Uso1: " + tempo);
		System.out.println("Valor de Uso1: " + uso.valorUso());

		int tempo2 = uso2.tempoDeUso();
		System.out.println("Tempo de Uso2: " + tempo2);
		System.out.println("Valor de Uso2: " + uso2.valorUso());

		Patio patio = new Patio();
		patio.adicionarUso(uso);
		patio.adicionarUso(uso2);

		System.out.println("Total Arrecadado: " + patio.totalArrecadado());
		System.out.println("Tempo Médio: " + patio.tempoMedioPorVaga());
	}
}
