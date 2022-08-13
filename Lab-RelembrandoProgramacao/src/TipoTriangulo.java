import java.util.*;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>0 && b>0 && c>0 && (a+b)>c && (a+c)>b && (b+c)>a){
            if(a==b && b==c){
                System.out.printf("equilatero");
            }else if(a!=b && b!=c && a!=c){
                System.out.printf("escaleno");
            }else{
                System.out.printf("isosceles");
            }
        }else{
            System.out.printf("invalido");
        }
        scan.close();
    }
}
