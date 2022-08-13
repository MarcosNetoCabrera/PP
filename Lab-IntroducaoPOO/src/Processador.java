public class Processador {
    String marca, modelo;
    double velocidade;
    int numNucleos;

    Processador(){
        this(" "," ",0.0,0);
    }
    
    Processador(String marca, String modelo, double velocidade, int numNucleos){
        this.marca =  marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.numNucleos = numNucleos;
    }
    double getVelocidadeParalela() {

        return velocidade * numNucleos;
    }
    String getDescricao() {

        return ("Processador: marca=" + marca + ", modelo="+ modelo +", velocidade="+ velocidade +"GHz, numNucleos="+ numNucleos +", velocidadeParalela="+ getVelocidadeParalela() +"GHz.");
    
    }
}
