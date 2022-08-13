import java.util.*;

public class AreaPoligono {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x[] = new double[100];
        double y[] = new double[100];

        double num = 0;
        int cont = 0;  
        num = scan.nextDouble();
        while(num >= 0){
            x[cont] = num; 
            num = scan.nextDouble();
            cont++;
        }
        cont = 0;
        num = scan.nextDouble();
        while(num >= 0){
            y[cont] = num; 
            num = scan.nextDouble();
            cont++;
        }
        double sum = 0;
        for(int i=0;i<=cont-2;i++){
            sum += (x[i+1] + x[i]) * (y[i+1]-y[i]);
        }
        double a = (1.0/2.0) * Math.abs(sum);

        System.out.printf("%.4f",a);

        scan.close();
    }
}
