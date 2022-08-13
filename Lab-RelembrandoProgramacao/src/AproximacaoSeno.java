import java.util.*;

public class AproximacaoSeno {
    
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
        double angulo = scan.nextDouble();
        double rad = Math.toRadians(angulo);
        double x = rad;
        double k = scan.nextDouble();
        double num=3.0;
        for(double i=1.0;i<k+1.0;i++){
            if(i==1.0){
                System.out.printf("%.10f\n",rad);
            }else if(i%2.0==0.0){
                rad = rad - (Math.pow(x,num)/fatorial(num));
                System.out.printf("%.10f\n",rad);
                num+=2.0;
            }else if(i%2.0!=0.0){
                rad = rad + (Math.pow(x,num)/fatorial(num));
                System.out.printf("%.10f\n",rad);
                num+=2.0;
            }
        }
        //System.out.printf("%.6f",pi);
        scan.close();
    }
}
