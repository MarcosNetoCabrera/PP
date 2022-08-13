import java.util.*;

public class AprovacaoDisciplina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double notas[] = new double[100];
        int freq[] = new int[100];

        double num = 0;
        int num2 = 0;
        int cont = 0;  
        num = scan.nextDouble();
        while(num >= 0){
            notas[cont] = num; 
            num = scan.nextDouble();
            cont++;
        }
        cont = 0;
        num2 = scan.nextInt();
        while(num2 >= 0){
            freq[cont] = num2; 
            num2 = scan.nextInt();
            cont++;
        }
        
        int carga = scan.nextInt();
        
        int aprovados=0,rep_nota=0,rep_freq=0;
        
        for(int i=0;i<cont;i++){
            if((freq[i]*100/carga)<75){
                rep_freq++;
            }else if(notas[i]<5.0){
                rep_nota++;
            }else{
                aprovados++;
            }
        }

        System.out.printf("%d %d %d",aprovados,rep_nota,rep_freq);

        scan.close();
    }
}
