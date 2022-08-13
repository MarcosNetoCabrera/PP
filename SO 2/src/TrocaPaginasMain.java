import java.io.*;
import java.util.*;

// José Marcos Cabrera Neto - 21953043

public class TrocaPaginasMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        char exec = ' ';
        int Nq = 8000;
        while(exec != 'n'){
            System.out.print("Informe o nome do arquivo: ");
            String Arquivo = scan.next();
            File file = new File(Arquivo);
            Scanner f = new Scanner(file);
            String referencia = f.nextLine();

            String[] stringDeReferencia = referencia.split(";");

            //System.out.print("Algoritmo de troca de páginas-FIFO\n");
            FIFO fifo = new FIFO(Nq);
            for (int i = 0; i < (stringDeReferencia.length - 1); i++) fifo.inserir(stringDeReferencia[i]);
            System.out.println("Page Faults: " + fifo.getNumFalhas());

            //System.out.print("Algoritmo de troca de páginas-LRU\n");
            LRU  lru = new LRU (Nq);
            for (int i = 0; i < (stringDeReferencia.length - 1); i++) lru.inserir(stringDeReferencia[i]);
            System.out.println("Page Faults: " + lru.getNumFalhas());

            //System.out.print("Algoritmo de troca de páginas-Segunda chance\n");
            SegundaChance sc = new SegundaChance(Nq);
            for (int i = 0; i < (stringDeReferencia.length - 1); i++) sc.inserir(stringDeReferencia[i]);
            System.out.println("Page Faults: " + sc.getNumFalhas());

            System.out.print("\nVocê deseja inserir um novo arquivo (s/n) ? ");
            exec = scan.next().charAt(0);
            System.out.println();
        }
    }
}
