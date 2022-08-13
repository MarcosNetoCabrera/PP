import java.util.*;

public class TanqueCombustivel {
    public static void main(String[] args) {

        double pi = Math.PI,v=0;
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int x = scan.nextInt();
        int tipo = scan.nextInt();

        if(tipo == 1){
            
            v = (pi/3.0)*Math.pow(x,2)*(3*r-x);
        
        }else if(tipo == 2){
            
            v = (4.0/3.0)*pi*Math.pow(r,3);
            v = v - (pi/3.0)*Math.pow(x,2)*(3*r-x);
        }
        
        System.out.printf("%.4f",v);

        scan.close();

    }
}
