import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        double aluno[] = new double[100];
        double gabarito[] = new double[100];
        double ndif=0; 
        int i = 0, y = 0,num;
        num = scan.nextInt();
        while(num!=-1){
            aluno[i] = num; 
            num = scan.nextInt();
            i++;
        }
        int cont = i;
        num = 0;
        num = scan.nextInt();
        gabarito[y] = num;
        while(num!=-1){
            gabarito[y] = num; 
            num = scan.nextInt();
            y++;
        }
        for(i=0;i<aluno.length;i++){
            if(aluno[i]!=gabarito[i]){
                ndif += 1;
            }
        } 
        double acertos = cont - ndif;
 
        //System.out.print(acertos + " " + cont);

        double result = (acertos/cont)*100; 
        System.out.printf("%.2f\n", result);
        
        scan.close();
    }
}
