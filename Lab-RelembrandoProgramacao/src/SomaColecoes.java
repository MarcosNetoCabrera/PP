import java.util.*;

public class SomaColecoes {
    public static void main(String[] args) {
        int lista[] = new int[100];
        int soma = 0,num = 0,cont =0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        while(num!=-1){
            while(num!=-1){
                lista[cont] = num;
                cont++;
                num = scan.nextInt();
            }
            for(int i=0;i<100;i++){
                soma += lista[i];
            }
            System.out.printf("%d\n",soma);
            for(int i=1;i<100;i++){
                lista[i] = 0;
            }
            soma = 0;
            num = 0;
            cont = 0;
            num = scan.nextInt();
        }
        scan.close();
    }
}
