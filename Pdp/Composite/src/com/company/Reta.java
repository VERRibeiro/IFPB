package com.company;

public class Reta extends FiguraComposta {
    private Ponto a;
    private Ponto b;

    public Reta(Ponto a, Ponto b) {
        this.a = a;
        this.b = b;
    }

    public Ponto getA() {
        return a;
    }

    public void setA(Ponto a) {
        this.a = a;
    }

    public Ponto getB() {
        return b;
    }

    public void setB(Ponto b) {
        this.b = b;
    }

    public double perimetroFigura(){
        Double x1 = (double) this.getA().getX();
        Double y1 = (double) this.getA().getY();
        Double x2 = (double) this.getB().getX();
        Double y2 = (double) this.getB().getY();
        Double distancia = Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2);

        return distancia.doubleValue();
    };
    @Override
    public String toString() {
        return "Reta{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
