import java.util.*;
public class RaizDois {
    
    public static double somadoida(double n){
            if (n == 0){
                return 1;
            }else{
                return 1/(2+somadoida(n-1)); 
            }
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double num = scan.nextDouble();
        double raiz = 0;
        raiz = 1.0 + somadoida(num); 

        for(int i = 1;i<=num;i++){
            raiz = 1.0+somadoida(i);
            System.out.printf("%.14f\n",raiz);    
        }
        scan.close();

    }
}
