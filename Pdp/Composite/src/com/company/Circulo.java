package com.company;

public class Circulo extends FiguraComposta {
    private Reta raio;

    public Circulo(Reta raio) {
        this.raio = raio;

    }

    public Reta getRaio() {
        return raio;
    }

    public void setRaio(Reta raio) {
        this.raio = raio;
    }

    public double perimetroFigura() {
        double resultado = (2 * Math.PI) * this.raio.perimetroFigura();
        return resultado;
    }
    public double areaFigura(){
        double resultado = Math.PI * (this.raio.perimetroFigura() * this.raio.perimetroFigura());
        return resultado;
    }
    public void desenhaFigura(){
        System.out.println("Circulo Área = " + areaFigura()+": Perimetro = " + perimetroFigura());
    };
}
