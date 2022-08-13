import java.util.*;

public class LRU{
    int NumFalhas;
    int NumQuadros;
    LinkedList quadros;

    public LRU(int NumQuadros) {
        //super(NumQuadros);
        NumFalhas = 0;
        this.NumQuadros = NumQuadros;
        this.quadros = new LinkedList();
    }

    public void inserir(String NumPag) {

        int frq = quadros.indexOf(NumPag);
        if (frq == -1) {

            if (quadros.size() < NumQuadros) {
                //Se ainda tiver quadros disponiveis
                //ele vai adicionado as paginas
                quadros.add(NumPag);
            } else {
                //caso todos as pagians tenham a mesma frequencia de uso
                //ele remove a pagina mais antiga
                //e adiciona uma nova pagina em seu quadro
                quadros.remove(0);
                quadros.add(NumPag);
            }
            NumFalhas++;
        } else {
            //remove o processo menos utilizado
            //e adicona um novo em seu quadro
            quadros.remove(frq);
            quadros.add(NumPag);
        }
    }
    public int getNumFalhas(){
        return NumFalhas;
    }
}
