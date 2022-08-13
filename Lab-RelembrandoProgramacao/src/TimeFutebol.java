import java.util.*;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x[] = new int[100];
        int y[] = new int[100];

        int num = 0;
        int cont = 0;  
        num = scan.nextInt();
        while(num >= 0){
            x[cont] = num; 
            num = scan.nextInt();
            cont++;
        }
        cont = 0;
        num = scan.nextInt();
        while(num >= 0){
            y[cont] = num; 
            num = scan.nextInt();
            cont++;
        }
        int vitorias=0,derrotas=0,empate=0;
        for(int i=0;i<cont;i++){
            if(x[i]>y[i]){
                vitorias++;
            }else if(x[i]==y[i]){
                empate++;
            }else{
                derrotas++;
            }
        }
        System.out.printf("%d %d %d",vitorias,empate,derrotas);

        scan.close();
    }
}
