import java.util.*;

public class Turma {
    String nome, professor;
    int numAlunos;
    boolean acessivel;
    ArrayList<Integer> horarios = new ArrayList<Integer>();
    
    public Turma(){};
    
    public Turma(String nome, String professor, int numAlunos, boolean acessivel){
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
        //this.horarios = new ArrayList<Integer>(); 
    }
    public void addHorario(int horario){
        horarios.add(horario);
    }

    public String verifica(int num, int flag){
        int[] tabela1 = {1,8,15,22,29};
        int[] tabela2 = {2,9,16,23,30};
        int[] tabela3 = {3,10,17,24,31};
        int[] tabela4 = {4,11,18,25,32};
        int[] tabela5 = {5,12,19,26,33};
        int[] tabela6 = {6,13,20,27,34};
        int[] tabela7 = {7,14,21,28,35};
        int horario = 0;

        for(int i=0;i<tabela1.length;i++){
            if(tabela1[i]==num){
                horario = 8;
                break;
            }
            else if(tabela2[i]==num){
                horario = 10;
                break;
            }
            else if(tabela3[i]==num){
                horario = 12;
                break;
            }
            else if(tabela4[i]==num){
                horario = 14;
                break;
            }
            else if(tabela5[i]==num){
                horario = 16;
                break;
            }
            else if(tabela6[i]==num){
                horario = 18;
                break;
            }else if(tabela7[i]==num){
                horario = 20;
                break;
            }
        }
        String dia = "";
        if(num >= 1 && num <= 7){
            dia = "Segunda";
        }
        else if(num >= 8 && num <= 14){
            dia = "terça";
        }
        else if(num >= 15 && num <= 21){
            dia = "quarta";
        }
        else if(num >= 22 && num <= 28){
            dia = "quinta";
        }
        else if(num >= 29 && num <= 35){
            dia = "sexta";
        }

        if(flag==1){
            return ""+ dia +" "+ horario +"hs";    
        }else{
            return ", "+ dia +" "+ horario +"hs";
        }
        
    }
    public String getHorariosString(){
        String fim ="";
        String str = "";
        
        for(int a: horarios){ 

            if(a == horarios.get(0)){
                str = verifica(a,1);
            }else{
                str = verifica(a,0);
            }

            fim = fim.concat(str);
        }

        return fim;
    }

    public String getDescricao(){

        String str1,str2;

        str1 = "Turma: "+ nome +"\n";
        str2 = "Professor: "+ professor +"\n";
        str1 = str1.concat(str2);
        str2 = "Número de Alunos: "+ numAlunos +"\n";
        str1 = str1.concat(str2);
        str2 = "Horário: "+ getHorariosString() +"\n";
        str1 = str1.concat(str2);
        if(acessivel == true){
            str2 = "Acessível: sim\n";
        }else{
            str2 = "Acessível: não\n";
        }
        str1 = str1.concat(str2);

        return str1;
    }
}
