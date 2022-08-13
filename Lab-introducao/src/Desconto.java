import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        double media = 0;
        if(num > 200){
            media = num - (num*0.05);
            System.out.printf("%.2f\n", media);
        }else{
            System.out.printf("%.2f\n", num);
        }
        scan.close();
    }
}
