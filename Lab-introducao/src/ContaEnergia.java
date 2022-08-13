import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        char tipo = scan.next().charAt(0);
        if(num<0){
            System.out.printf("-1");
        }
        else if(tipo == 'R'){
            if(num<500){
                num = num*0.40;
            }else{
                num = num*0.65;
            }
            System.out.printf("%.2f\n", num);

        }else if(tipo == 'C'){
            if(num<1000){
                num = num*0.55;
            }else{
                num = num*0.60;
            }
            System.out.printf("%.2f\n", num);

        }else if(tipo == 'I'){
            if(num<5000){
                num = num*0.55;
            }else{
                num = num*0.60;
            }
            System.out.printf("%.2f\n", num);
        }else{
            System.out.printf("-1");
        }
        scan.close();
    }
}
