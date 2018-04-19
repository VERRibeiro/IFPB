package model;

import java.util.*;
public class Cliente {
	
  private String nome;
  private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();
  
  public Cliente(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return nome;
  }
  public void adicionaAluguel(Aluguel aluguel) {
    fitasAlugadas.add(aluguel);
  }
  public String extrato() {
    final String fimDeLinha = System.getProperty("line.separator");
    double valorTotal = 0.0;
    int pontosDeAlugadorFrequente = 0;
    Iterator<Aluguel> alugueis = fitasAlugadas.iterator();
    String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;
    while(alugueis.hasNext()) {
      Aluguel cada = (Aluguel)alugueis.next();
      // determina valores para cada linha

      // trata de pontos de alugador frequente
      pontosDeAlugadorFrequente++;
      // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
      if(cada.testarAlugadorFrequente()) {
         pontosDeAlugadorFrequente++;
      }

      // mostra valores para este aluguel
      resultado += "\t" + cada.getFitaName() + "\t" + cada.valorParcial() + fimDeLinha;
      valorTotal += cada.valorParcial();
    } // while
    // adiciona rodapé
    resultado += "Valor total devido: " + valorTotal + fimDeLinha;
    resultado += "Voce acumulou " + pontosDeAlugadorFrequente +
              " pontos de alugador frequente";
    return resultado;
  }
}

