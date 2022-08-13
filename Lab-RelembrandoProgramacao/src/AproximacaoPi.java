import java.util.*;

public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double pi = 3.0;
        double num1=2.0,num2=3.0,num3=4.0;
        for(double i=1.0;i<x+1.0;i++){
            if(i==1.0){
                System.out.printf("%.6f\n",pi);
            }else if(i%2.0==0.0){
                pi = pi + 4.0/(num1*num2*num3);
                System.out.printf("%.6f\n",pi);
                num1+=2.0;
                num2+=2.0;
                num3+=2.0;
            }else if(i%2.0!=0.0){
                pi = pi - 4.0/(num1*num2*num3);
                System.out.printf("%.6f\n",pi);
                num1+=2.0;
                num2+=2.0;
                num3+=2.0;
            }
        }
        //System.out.printf("%.6f",pi);
        scan.close();
    }
}

