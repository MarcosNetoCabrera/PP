import java.util.*;

public class OperacoesInteiros {
    public static void main(String[] args) {
        int lista[] = new int[100];
        int soma = 0,num = 0,cont =0, pares=0, impares=0, maior=0, menor=0;
        double media = 0; //soma / cont
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        maior = num;
        menor = num;
        while(num!=-1){
            while(num!=-1){
                lista[cont] = num;
                cont++;
                if(maior < num){
                    maior = num;
                }
                if(menor > num){
                    menor = num;
                }
                num = scan.nextInt();
            }
            for(int i=0;i<100;i++){
                soma += lista[i];
            }
            for(int i=0;i<cont;i++){
                if(lista[i]%2==0){
                    pares++;
                }else{
                    impares++;
                }
            }
            
            media = (double)soma / (double)cont;
            System.out.printf("%d\n",cont);
            System.out.printf("%d\n",pares);
            System.out.printf("%d\n",impares);
            System.out.printf("%d\n",soma);
            System.out.printf("%.2f\n",media);
            System.out.printf("%d\n",maior);
            System.out.printf("%d\n",menor);
            for(int i=1;i<100;i++){
                lista[i] = 0;
            }
            soma = 0;
            num = 0;
            cont = 0;
            pares = 0;
            impares = 0;
            media = 0;
            num = scan.nextInt();
            maior = num;
            menor = num;
        }
        scan.close();
    }
}
