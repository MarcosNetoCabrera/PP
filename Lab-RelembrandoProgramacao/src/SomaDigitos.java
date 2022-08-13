import java.util.*;

public class SomaDigitos {
    public static void main(String[] args) {
        int num = 0,soma = 0,multi = 10,cont =1,div=1;

        Scanner scan = new Scanner(System.in);
        int princ = scan.nextInt();
        num = princ;
        while(num>0){
            if(num-multi<0){
                multi = multi/10;
                break;
            }
            multi = multi*10;
            cont++;
        }
        for(int i=0;i<cont;i++){
            
            soma = soma + princ/(multi/div);
            princ = princ%(multi/div);

            div = div*10;
        }
        
        System.out.printf("%d",soma);
        scan.close();
    }
}
