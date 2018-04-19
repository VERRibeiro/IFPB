package model;

public class Aluguel {
	private Fita fita;
	private int diasAlugada;
	public Aluguel(Fita fita, int diasAlugada) {
		this.fita = fita;
		this.diasAlugada = diasAlugada;
	}
	public Fita getFita() {
		return fita;
	}
	public int getDiasAlugada() {
		return diasAlugada;
	}

	public boolean testarAlugadorFrequente() {
		if(fita.getTipo() == TIPO.LANÇAMENTO && this.getDiasAlugada() > 1) {
			return true;
		}else
			return false;
	}
	public String getFitaName() {
		return this.fita.getTítulo();
	}

	public double valorParcial() {
		return this.fita.getTipo().calculcarPagmento(diasAlugada);
	}
}



