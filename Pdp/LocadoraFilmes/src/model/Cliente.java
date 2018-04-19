package model;

import java.util.*;
public class Cliente {
	
  private String nome;
  private int pontosDeAlugadorFrequente = 0;
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
  public void adicionarPontos(int pontos){
    this.pontosDeAlugadorFrequente += pontos;
  }
  public String extrato() {
    final String fimDeLinha = System.getProperty("line.separator");
    double valorTotal = 0.0;
    int pontos = 0;
    Iterator<Aluguel> alugueis = fitasAlugadas.iterator();
    String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;
    while(alugueis.hasNext()) {
      Aluguel cada = (Aluguel)alugueis.next();
      // trata de pontos de alugador frequente
      adicionarPontos(1);
      // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
      if(cada.testarAlugadorFrequente()) {
         adicionarPontos(1);
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

