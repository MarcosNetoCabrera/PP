import java.util.*;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double s = (a+b+c)/2;
        double area =  Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        if(a>0 && b>0 && c>0 && (a+b)>c && (a+c)>b && (b+c)>a){
            System.out.printf("%.2f",area);
        }else{
            System.out.printf("Triangulo invalido");
        }
        scan.close();
    }
}
