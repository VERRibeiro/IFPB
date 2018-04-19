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
	public double valorParcial() {
		double valorCorrente = 0;
		if(this.fita.testarNormal())
			return calcularPreçoNormal();
		else if(this.fita.testarLançamento())
			return calcularPreçoLançamento();
		else if(this.fita.testarInfantil())
			return calcularPreçoInfantil();
		else
			return valorCorrente;
	}
	public double calcularPreçoNormal(){
		double valorCorrente = 2;
		if(this.getDiasAlugada() > 2) {
			valorCorrente += (this.getDiasAlugada() - 2) * 1.5;
		}
		return valorCorrente;
	}

	public double calcularPreçoLançamento(){
		double valorCorrente = this.getDiasAlugada() * 3;
		return valorCorrente;
	}

	public double calcularPreçoInfantil(){
		double valorCorrente = 1.5;
		if(this.getDiasAlugada() > 3) {
			valorCorrente += (this.getDiasAlugada() - 3) * 1.5;
		}
		return valorCorrente;
	}
	public boolean testarAlugadorFrequente() {
		if(fita.testarLançamento() && this.getDiasAlugada() > 1) {
			return true;
		}else
			return false;
	}
	public String getFitaName() {
		return this.fita.getTítulo();
	}
}



