package br.edu.icomp.ufam.lab_heranca;
import java.util.*;

public class FormasMain {
    public static void main(String args[]){
        ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>(); 
        
        Circulo cir = new Circulo(4,1,2.5);
        formas.add(cir);
        Retangulo ret = new Retangulo(10,7,2.5,3.7);
        formas.add(ret);
        Quadrado qd = new Quadrado(10,5,2.5);
        formas.add(qd);
        
        for(FormaGeometrica a :formas){
            System.out.println(a.toString());
        }
    }
}
