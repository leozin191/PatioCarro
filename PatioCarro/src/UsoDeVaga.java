public class UsoDeVaga {
	public static final double VALOR_FRACAO = 3.0;
	public static final int FRACAO_MINUTOS = 15;

	protected String identificador;
	protected int horaEntrada;
	protected int horaSaida;
	protected int minutoEntrada;
	protected int minutoSaida;

	public UsoDeVaga(String identificador) {
		this.identificador = identificador;
	}

	public void registrarEntrada(int hora, int min) {
		this.horaEntrada = hora;
		this.minutoEntrada = min;
	}

	public void registrarSaida(int hora, int min) {
		this.horaSaida = hora;
		this.minutoSaida = min;
	}

	public int tempoDeUso() {
		int totalMinutos = 0;
		int auxHoras = this.horaSaida - this.horaEntrada;
		totalMinutos += auxHoras * 60;
		totalMinutos += this.minutoSaida - this.minutoEntrada;

		return totalMinutos;
	}

	double totalFracao;

	public double valorUso() {
		double totalFracao = Math.ceil((double) this.tempoDeUso() / FRACAO_MINUTOS);
		return totalFracao * VALOR_FRACAO;
	}

}
