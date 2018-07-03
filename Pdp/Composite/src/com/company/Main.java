package com.company;

public class Main {

    public static void main(String[] args) {
        Ponto p1 = new Ponto(1,2);
        Ponto p2 = new Ponto(4,10);
        Ponto p3 = new Ponto(10,20);
        Ponto p4 = new Ponto(40,29);
        Reta r1 = new Reta(p1,p2);
        Reta r2 = new Reta(p3,p4);
        Reta r3 = new Reta(p2,p3);
        Reta r4 = new Reta(p1,p4);
        Circulo c1 = new Circulo(r1);
        c1.desenhaFigura();
        Triangulo t1 = new Triangulo(4);
        t1.add(r1);
        t1.add(r3);
        t1.add(r2);
        t1.desenhaFigura();
        Quadrilatero q1 = new Quadrilatero();
        q1.add(r1);
        q1.add(r2);
        q1.add(r3);
        q1.add(r4);
        q1.desenhaFigura();
    }
}
