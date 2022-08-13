package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
    private Coordenada caminho[] = null;
    private int tamanho;

    public Caminho(int maxTam){
       this.tamanho = 0;
       this.caminho = new Coordenada[maxTam];
    }
    public int tamanho(){
        return tamanho;
    }
    public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException,DistanciaEntrePontosExcedidaException{
        int t = caminho.length;
        
        if(caminho[t-1]!=null) throw new TamanhoMaximoExcedidoException();
        
        int i=0;
        for(i=0;i<caminho.length;i++){
            if(caminho.length==1){
                break;
            }else{
                if(caminho[i+1]==null){
                    break;
                }
            }
        }
        if(caminho[0]!=null){
            double d = caminho[i].distancia(coordenada);
            if(d>15) throw new DistanciaEntrePontosExcedidaException();
        }
        for(i=0;i<caminho.length;i++){
            if(caminho[i]==null){
                caminho[i] = coordenada;
                tamanho++;
                break;
            }
        }
    }
    public void reset(){
        for(int i=0;i<tamanho;i++){
            caminho[i] = null;
        }
        this.caminho = new Coordenada[0];
    }
    public String toString(){

        String str = "";
        String str1 = "Dados do caminho:\n"
        +" - Quantidade de pontos: "+tamanho()+"\n"
        +" - Pontos:\n";
        

        if(caminho[0]==null){
            str = "";
            return str1;
        }else{
            for(int i=0;i<tamanho;i++){
                str += "   -> "+caminho[i].getPosX()+", "+caminho[i].getPosY()+"\n";
            }
        return "Dados do caminho:\n"
        +" - Quantidade de pontos: "+tamanho()+"\n"
        +" - Pontos:\n"
        +""+str+"\n";
        }
    }
}
