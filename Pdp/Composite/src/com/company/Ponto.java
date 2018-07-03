package com.company;

import java.util.*;

public class Ponto implements Figura {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
        desenhaFigura();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double perimetroFigura(){
        return 0;
    };
    public double areaFigura(){
        return 0;
    };
    public void desenhaFigura(){
        System.out.println("ponto dezenhado");
    };
}
