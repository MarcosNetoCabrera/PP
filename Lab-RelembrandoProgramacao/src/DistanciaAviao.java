import java.util.*;

public class DistanciaAviao {
    public static void main(String[] args) {

        int m[][] = {{0,111,222,333,444,555,666,777},
    {111,0,2,11,6,15,11,1},
    {222,2,0,7,12,4,2,15},
    {333,11,7,0,11,8,3,13},
    {444,6,12,11,0,10,2,1},
    {555,15,4,8,10,0,5,13},
    {666,11,2,3,2,5,0,14},
    {777,1,15,13,1,13,14,0}};
        Scanner scan = new Scanner(System.in);
        int cord [] = new int[10];
        int num = 0,cont=0; 
        num = scan.nextInt();
        while(num!=-1){
            cord[cont] = num;
            num = scan.nextInt(); 
            cont++;
        }
        int col=0,lin=0,soma=0;
        for(int i=0;i<cont;i++){
            if(cord[i+1] > 0){
                col = cord[i]/100;
                lin = cord[i+1]/100;
                soma += m[col][lin];
            }
        }
        System.out.print(soma);
        scan.close();
    }
}
