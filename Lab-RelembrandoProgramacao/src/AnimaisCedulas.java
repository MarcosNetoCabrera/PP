import java.util.*;

public class AnimaisCedulas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x==2){
            System.out.printf("Tartaruga");
        }if(x==5){
            System.out.printf("Garça");
        }if(x==10){
            System.out.printf("Arara");
        }if(x==20){
            System.out.printf("Mico-leão-dourado");
        }if(x==50){
            System.out.printf("Onça-pintada");
        }if(x==100){
            System.out.printf("Garoupa");
        }if(x!=2 && x!=5 && x!=10 && x!=20 && x!=50 &&x!=100){
            System.out.printf("erro");
        }
        
        scan.close();
    }
}
