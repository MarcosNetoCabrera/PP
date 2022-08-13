import java.util.*;

public class DataExtenso {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String princ = scan.next();
        System.out.printf("\n",princ);
        String numStr1 = princ.substring(0, 2);
        String numStr2 = princ.substring(2, 4);
        String numStr3 = princ.substring(4, 8);

        int num1 = Integer.parseInt(numStr1); 
        int num2 = Integer.parseInt(numStr2);
        int num3 = Integer.parseInt(numStr3);

        if(num2 == 01){
            System.out.printf("%d de janeiro de %d",num1,num3);
        }else if(num2 == 02){
            System.out.printf("%d de fevereiro de %d",num1,num3);
        }else if(num2 == 03){
            System.out.printf("%d de março de %d",num1,num3);
        }else if(num2 == 04){
            System.out.printf("%d de abril de %d",num1,num3);
        }else if(num2 == 05){
            System.out.printf("%d de maio de %d",num1,num3);
        }else if(num2 == 06){
            System.out.printf("%d de junho de %d",num1,num3);
        }else if(num2 == 07){
            System.out.printf("%d de julho de %d",num1,num3);
        }else if(num2 == 8){
            System.out.printf("%d de agosto de %d",num1,num3);
        }else if(num2 == 9){
            System.out.printf("%d de setembro de %d",num1,num3);
        }else if(num2 == 10){
            System.out.printf("%d de outubro de %d",num1,num3);
        }else if(num2 == 11){
            System.out.printf("%d de novembro de %d",num1,num3);
        }else{
            System.out.printf("%d de dezembro de %d",num1,num3);
        }
        scan.close();
    }
}
