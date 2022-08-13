import java.util.*;

public class ListaInvertida {
    private Hashtable<String, LinkedList<String>> tabela;

    public ListaInvertida(){
        this.tabela = new Hashtable<String, LinkedList<String>>();
    }
    public boolean insere(String palavra, String documento){
        LinkedList<String> listaDoc = new LinkedList<String>();
        
        if(tabela.get(palavra)!=null){
            
            listaDoc = tabela.get(palavra);

            if(listaDoc.contains(documento)!=true){
                listaDoc.add(documento);
                return true;
            }else{
                return false;
            }
        }else{

            listaDoc.add(documento);
            tabela.put(palavra,listaDoc);
            return true;
        }
    }
    public LinkedList<String> busca(String palavra){
        
        return tabela.get(palavra); 
    }
    public String toString(){

        return tabela.toString();
    }
}
