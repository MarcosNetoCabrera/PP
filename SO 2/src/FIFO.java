import java.util.*;

public class FIFO{
    int NumFalhas;
    int NumQuadros;
    LinkedList quadros;
    int insere = 0;

    public FIFO(int NumQuadros) {
        //super(NumQuadros);
        this.NumQuadros = NumQuadros;
        this.quadros = new LinkedList();
        NumFalhas = 0;
    }

    public void inserir(String NumPag) {
        // antes de inserir, eh verificado se a pagina ja esta na lista
        if (!quadros.contains(NumPag)) {
            // se a quantidade de paginas na memoria for menor que o numero de
            // quadros ainda ha espaco para inserir
            if (quadros.size() < NumQuadros) quadros.add(NumPag);
            else {
                //remove sempre a pagina mais antiga
                //quando chega no numero maximo de quadros
                quadros.remove(insere);
                quadros.add(insere, NumPag);
                insere++;

                //Quando chega no numero maximo de quadros
                //eh necessario que volte para o primeiro quadro
                if (insere == NumQuadros) insere = 0;
            }
            NumFalhas++;
        }
    }
    public int getNumFalhas(){
        return NumFalhas;
    }
}
