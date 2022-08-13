import java.util.*;

public class CaixaEletronico {
    public static void main(String[] args) {
        int notas50=0,notas10=0,notas2=0;

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if((num > 0) && (num%2==0)){
            while(num > 0){
                num = num - 50;
                notas50++;
            }
            num = num + 50;
            notas50 -= 1; 
            while(num>0){
                num = num - 10;
                notas10++;
            }
            num = num + 10;
            notas10 -= 1;
            while(num>0){
                num = num - 2;
                notas2++;
            }
            System.out.printf(""+ notas50 +" notas de R$50, "+ notas10 +" notas de R$10 e "+ notas2 +" notas de R$2");
        }else{
            System.out.printf("Valor Invalido");
        }
        
        scan.close();
    }
}
