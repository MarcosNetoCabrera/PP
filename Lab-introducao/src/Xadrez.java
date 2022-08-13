import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = 0;
        while(a < num){
            for(int i=0;i<num;i++){
                System.out.print("* ");
            }        
            System.out.print("\n");
            for(int y =0;y<num;y++){
                System.out.print(" *");
            }
            System.out.print("\n");
            a = a + 2; 
        }
        scan.close();
    }
}
