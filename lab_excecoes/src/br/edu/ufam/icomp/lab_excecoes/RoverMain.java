package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
    public static void main(String args[]){
        /*try {
            c1 = new Coordenada(5, 13, 8);
            c2 = new Coordenada(9, 8, 7);
            //System.out.println(c1.distancia(c2));
        } catch (CoordenadaNegativaException | CoordenadaForaDosLimitesException | DigitoInvalidoException e) {
            e.printStackTrace();
        }*/
        
        Caminho c = new Caminho(6);
        Coordenada r1;
        try {
            r1 = new Coordenada(23, 55, 8);
            c.addCoordenada(r1);
            System.out.println(c.toString());
        } catch (CoordenadaNegativaException 
                | TamanhoMaximoExcedidoException 
                | DistanciaEntrePontosExcedidaException 
                | CoordenadaForaDosLimitesException 
                | DigitoInvalidoException e) {
            
            e.printStackTrace();
        }
    }
}
