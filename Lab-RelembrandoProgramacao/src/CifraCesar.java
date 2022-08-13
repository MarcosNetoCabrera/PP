import java.util.*;
public class CifraCesar {
    
    public static char cifraChar(int codigo,char c) {
        char cCif;
     
        if (c >= 65 && c <= 90) {
            cCif = (char) ((c - 65 + codigo) % 26 + 65);
        }
        else if (c >= 97 && c <= 122) {
            cCif = (char)((c - 97 + codigo) % 26 + 97);
        }
        else {
            cCif = c;
        }
        return cCif;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int codigo = scan.nextInt();
        String str = scan.nextLine();
        String strCifrada="";
        for (int i = 1; i < str.length(); i++) {
           strCifrada += cifraChar(codigo,str.charAt(i));
        }
        strCifrada = strCifrada.toUpperCase();
        System.out.printf(""+strCifrada+"");
        scan.close();
    }
}
