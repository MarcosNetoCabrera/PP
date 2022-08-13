import java.util.*;

public class NumeroNeperiano {
    
    public static double fatorial(double num){
        double mult=1;

        if(num==0){
            return 1.0;
        }
        while(num>0){
            mult = mult * num;
            num-=1.0;
        }  
        return mult; 
    } 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double k = scan.nextDouble();
        double e=0.0;
        for(double i=0.0;i<k;i++){
            e = e + 1/fatorial(i);
        }

        System.out.printf("%.6f",e);
        scan.close();
    }
}
