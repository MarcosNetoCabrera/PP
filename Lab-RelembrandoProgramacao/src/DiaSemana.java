import java.util.*;

public class DiaSemana {
    public static void main(String[] args) {
        int m[][] = new int[100][7];
        Scanner scan = new Scanner(System.in);
        int num = 0; 
        int cont = 0;
        num = scan.nextInt();
        while(num!=-1){
            for(int y=0;y<7;y++){
                m[cont][y] = num;
                num = scan.nextInt();
            }
            cont++;
        }
        int maior = 0, soma =0;
        int dias [] = new int[7];
        
        if(cont==1){
            for(int i=0;i<7;i++){
                if(maior <= m[cont-1][i]){
                    maior = m[cont-1][i];
                    
                }
                 
            }
        }else{   
            for(int i=0;i<7;i++){
                for(int y=0;y<cont;y++){
                    soma += m[y][i]; 
                }
                if(soma >= maior){
                    maior = soma;
                    dias[i] = i+1;
                
                }
                soma=0;
            }
        }
        for(int a: dias){
            if(a > 0){
                System.out.printf("%d \n",a);
            }
        }
        scan.close();
    }
}
