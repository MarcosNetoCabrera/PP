import java.util.*;

public class GoogleMain {
    public static void main(String args[]){
        ListaInvertida list = new ListaInvertida();
        list.insere("The", "document2.txt");
        list.insere("Force", "document2.txt");
        list.insere("is", "document2.txt");
        list.insere("strong", "document2.txt");

        System.out.println(list.busca("Force"));

        System.out.println(list.toString());
    }
}
