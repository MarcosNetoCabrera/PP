package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
    private int posX,posY,digito;

    public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException{
        this.posX = posX;
        this.posY = posY;
        this.digito = digito;

        if(posX < 0 || posY < 0) throw new CoordenadaNegativaException();

        else if(posX > 30000 || posY > 30000) throw new CoordenadaForaDosLimitesException();

        int sum = (posX+posY)%10;
        if(sum != digito) throw new DigitoInvalidoException();
    }

    public int getPosX(){
        
        return posX;
    }
    
    public int getPosY(){
        
        return posY;
    }
    public double distancia(Coordenada coordenada){
        
        
        double d = Math.sqrt(Math.pow(coordenada.posX - posX,2)+Math.pow(coordenada.posY-posY,2));

        return d;
    }
    public String toString() {

        return ""+posX+", "+posY+"";

    }
}
