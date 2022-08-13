import java.util.*;

public class RotaOrtodromica {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double t1 = scan.nextDouble();
        double radianst1 = Math.toRadians(t1);
        double g1 = scan.nextDouble();
        double radiansg1 = Math.toRadians(g1);
        double t2 = scan.nextDouble();
        double radianst2 = Math.toRadians(t2);
        double g2 = scan.nextDouble();
        double radiansg2 = Math.toRadians(g2);
        double raiz = 6371;

        double d = raiz * Math.acos(Math.sin(radianst1) * Math.sin(radianst2) + Math.cos(radianst1)*Math.cos(radianst2)*Math.cos(radiansg1-radiansg2));

        System.out.printf("A distancia entre os pontos (%f, %f) e (%f, %f) e de %.2f km",t1,g1,t2,g2,d);

        scan.close();

    }
}
