package com.company;

import java.util.ArrayList;

public class Triangulo extends FiguraComposta {
    private ArrayList<Reta> lados = new ArrayList<Reta>();
    private double altura;

    public Triangulo(double altura) {
        this.altura = altura;

    }

    public ArrayList<Reta> getLados() {
        return lados;
    }

    public void setLados(ArrayList<Reta> lados) {
        this.lados = lados;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void add(Reta lado){
        lados.add(lado);
    }
    public void remove(Reta r){
        lados.remove(r);
    }
    public double areaFigura(){
        return (this.lados.get(0).perimetroFigura() * this.altura) / 2.0;
    };

    @Override
    public void desenhaFigura() {
        System.out.println("Triangulo Área = " + areaFigura()+": Perimetro = " + perimetroFigura());
    }
}
