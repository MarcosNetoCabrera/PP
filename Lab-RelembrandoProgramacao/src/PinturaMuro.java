import java.util.*;

public class PinturaMuro {
    public static void main(String[] args) {
        
        double altura=3, comprimento=12, material = 100;

        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        double valor = ((altura*comprimento) * num) + material;

        System.out.printf("%.1f",valor);

        scan.close();
    }
}
