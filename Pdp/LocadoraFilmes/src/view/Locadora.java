package view;

import model.Aluguel;
import model.Cliente;
import model.Fita;

import static model.TIPO.*;

public class Locadora {
	  public static void main(String[] args) {
	    Cliente c1 = new Cliente("Juliana");
	    c1.adicionaAluguel(new Aluguel(new Fita("O Exorcista                   ", NORMAL), 3));
	    c1.adicionaAluguel(new Aluguel(new Fita("Men in Black                  ", NORMAL), 2));
	    c1.adicionaAluguel(new Aluguel(new Fita("Jurassic Park III             ", LANÇAMENTO), 3));
	    c1.adicionaAluguel(new Aluguel(new Fita("Planeta dos Macacos           ", LANÇAMENTO), 4));
	    c1.adicionaAluguel(new Aluguel(new Fita("Pateta no Planeta dos Macacos ", INFANTIL), 10));
	    c1.adicionaAluguel(new Aluguel(new Fita("O Rei Leao                    ", INFANTIL), 30));

	    System.out.println(c1.extrato());
	  }
	}
