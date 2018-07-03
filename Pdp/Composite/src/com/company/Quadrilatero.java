package com.company;

import java.util.ArrayList;

public class Quadrilatero extends FiguraComposta{
    private ArrayList<Reta> lados = new ArrayList<Reta>();;

    public Quadrilatero() {

    }

    public ArrayList<Reta> getLados() {
        return lados;
    }

    public void setLados(ArrayList<Reta> lados) {
        this.lados = lados;
    }

    public void add(Reta lado){
        if(lados.size() <= 4)
            lados.add(lado);
        else
            System.out.println("impossível inserir mais lados");
    }
    public void remove(Reta r){
        lados.remove(r);
    }
    public double areaFigura(){
        double menor = 0;
        for(Reta lado:lados){
            menor = lado.perimetroFigura() + 10;
        }
        return menor;
    };

    @Override
    public void desenhaFigura() {
        System.out.println("Quadrilatero Área = " + areaFigura()+": Perimetro = " + perimetroFigura());
    }
}
