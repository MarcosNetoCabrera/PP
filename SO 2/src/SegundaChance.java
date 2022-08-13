import java.util.*;

public class SegundaChance{
    int NumFalhas;
    int NumQuadros;
    LinkedList quadros;
    LinkedList bit;
    int ponteiro = 0;

    public SegundaChance(int NumQuadros) {
        //super(NumQuadros);
        this.NumQuadros = NumQuadros;
        this.quadros = new LinkedList();
        this.bit = new LinkedList();
        NumFalhas = 0;
    }
    public void inserir(String NumPag) {

        int frq = quadros.indexOf(NumPag);

        // caso a pagina ainda nao esteja na memoria
        if (frq == -1) {
            if (quadros.size() < NumQuadros) {
                quadros.add(NumPag);
                bit.add(0);
            } else {
                //verificando bit de referencia de cada
                //pagina, para saber se ela ja foi acessada
                //recentemente
                while (bit.get(ponteiro).equals(1)) {
                    //Eh concedida uma segunda chance
                    //para a pagina
                    //voltando para o fim da fila
                    //com seu bit de referencia ajustado
                    //para zero
                    bit.set(ponteiro, 0);
                    ponteiro++;

                    // O ponteiro volta para o inicio
                    if (ponteiro == NumQuadros) ponteiro = 0;
                }
                // ajustando todos os bits de referencia para zero
                // escolhendo a primeira pagina da fila
                quadros.remove(ponteiro);
                bit.remove(ponteiro);
                quadros.add(ponteiro, NumPag);
                bit.add(ponteiro, 0);

                ponteiro++;

                // ponteiro voltando ao inicio
                if (ponteiro == NumQuadros) ponteiro = 0;
            }
            NumFalhas++;

            // caso a pagina ja esteja na memoria
        } else bit.set(frq, 1);
    }
    public int getNumFalhas(){
        return NumFalhas;
    }
}
