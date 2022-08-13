import java.util.*;

public class Mediana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vet[] = new double[100];
        double mediana = 0;
        double num = scan.nextDouble();
        int cont = 0;
        while(num!=-1){
            vet[cont] = num;
            cont++;
            num = scan.nextDouble();
        }
        if(cont%2==0){
            mediana = (vet[cont/2-1] + vet[(cont/2)])/2.0;
        }else{
            mediana = vet[cont/2];
        }
        System.out.printf("%.1f",mediana);

        scan.close();
    }
}
