import java.util.*;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flag = 1;
        String linha = scan.nextLine();
        linha = linha.toUpperCase();
        linha = linha.replace(" ", "");

        int y = 0; 
        for(int i = linha.length()-1;i>=y;i--){
            char carac = linha.charAt(i);
            char carac2 = linha.charAt(y);
            if(carac != carac2){
                flag = 0; 
            }
            y++;
        }
        System.out.print(""+ linha +" "+ flag +"");
        scan.close();
    }
}
