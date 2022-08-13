package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica{
    public double raio;
    public Circulo(int posX, int posY, double raio){
        super(posX,posY);
        this.raio = raio;
    }
    public double getArea(){
        
        double area;
        double pi = Math.PI;
        area = pi * (raio * raio);
        
        return area;

    }
    public double getPerimetro(){
        
        double c;
        double pi = Math.PI;
        c = 2*pi*raio;
        
        return c;
    }

    public String toString(){

        return "Círculo na "+ getPosString() +" com raio de "+ raio +"cm (área="+ getArea() +"cm2, perímetro="+ getPerimetro() +"cm)";
    }

}
