import java.util.*;

public class SomaColecao {
    public static void main(String[] args) {
        int lista[] = new int[100];

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1;num>0;i++){
            lista[i] = num;
            num = scan.nextInt();
        }
        int soma=0;
        for(int i=1;i<100;i++){
            soma += lista[i];
        }
        System.out.printf("%d",soma);

        scan.close();

    }
}
