import java.util.*;

public class MediaColecao {
    public static void main(String[] args) {
        int lista[] = new int[100];
    
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double cont = 0;
        for(int i=1;num>0;i++){
            lista[i] = num;
            cont++;
            num = scan.nextInt();
        }
        double soma=0;
        for(int i=1;i<100;i++){
            soma += lista[i];
        }
        soma = soma/cont;
        System.out.printf("%.2f",soma);
    
        scan.close();
    }
}
