package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class GISMain {
    public static void main(String args[]){
        ArrayList<Localizavel> vetorLocalizaveis = new ArrayList<Localizavel>(); 
        Localizavel vetorLocalizaveis2[] = new Localizavel[2];
        Celular c = new Celular(55, 92, 991372230);
        vetorLocalizaveis.add(c);
        CarroLuxuoso car = new CarroLuxuoso("VAR-1225");
        vetorLocalizaveis.add(car);
        
        for(Localizavel a :vetorLocalizaveis){
            System.out.println(a.getPosicao());
        }
    }
}
