public class Patio {
    public String identificador;
    private UsoDeVaga[] usos = new UsoDeVaga[100];

    public void adicionarUso(UsoDeVaga uso) {
        usos[this.tamanhoAtual()] = uso;
    }

    private int tamanhoAtual() {
        int aux = 0;
        for (int i = 0; i < usos.length; i++) {
            if(usos[i] == null){
                aux = i;
                i = usos.length;
            }
        }
        return aux;
    }

    public double totalArrecadado() {
        double total = 0.0;
        for (int i = 0; i < tamanhoAtual(); i++) {
            total += usos[i].valorUso();
        }

        return total;
    }

    public double tempoMedioPorVaga() {
        double tempoTotal = 0;
        for (int i = 0; i < tamanhoAtual(); i++) {
            tempoTotal += usos[i].tempoDeUso();
        }
        return tempoTotal / tamanhoAtual();
    }
}
