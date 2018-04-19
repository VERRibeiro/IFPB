package locadora;

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
	      switch(this.getFita().getCódigoDePreço()) {
	      case Fita.NORMAL:
	        valorCorrente += 2;
	        if(this.getDiasAlugada() > 2) {
	          valorCorrente += (this.getDiasAlugada() - 2) * 1.5;
	        }
	        return valorCorrente;
	      case Fita.LANÇAMENTO:
	        valorCorrente += this.getDiasAlugada() * 3;
	        return valorCorrente;
	      case Fita.INFANTIL:
	        valorCorrente += 1.5;
	        if(this.getDiasAlugada() > 3) {
	          valorCorrente += (this.getDiasAlugada() - 3) * 1.5;
	        }
	        return valorCorrente;
	      }
	      return valorCorrente;
	  }
	}
