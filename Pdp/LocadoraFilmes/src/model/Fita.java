package model;

public class Fita {
	  private TIPO tipo;
	  private String título;
	  private int códigoDePreço;

	  public Fita(String título, TIPO tipo) {
	    this.título = título;
	    this.tipo = tipo;
	  }
	  public String getTítulo() {
	    return título;
	  }

	public TIPO getTipo() {
		return tipo;
	}
	public void setTipo(TIPO tipo){
	  	this.tipo = tipo;
	}


	}

