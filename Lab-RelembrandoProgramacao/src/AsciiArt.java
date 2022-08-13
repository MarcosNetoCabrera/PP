import java.util.*;

public class AsciiArt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = 0;
        int esp=0;
        int total = num;
        while(a < total){
            for(int i=0;i<num;i++){
                System.out.print("*");
            }
            if(esp>0){
                for(int y=0;y<esp;y++){
                    System.out.print("  ");
                } 
            }
            for(int i=0;i<num;i++){
                System.out.print("*");
            }        
            System.out.print("\n");
            a++;
            esp++;
            num -= 1;
        }
        scan.close();
    }
}
