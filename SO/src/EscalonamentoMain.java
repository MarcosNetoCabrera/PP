import java.io.*;
import java.util.*;

//Aluno: José Marcos Cabrera Neto - 21953043

public class EscalonamentoMain {
    public static void main(String args[]) throws FileNotFoundException{
        int Quantum = 1;
        char saida = ' ';

        while (saida != 'n'){ // laco para inserir novos arquivos enquanto o usuario quiser
            int tipo1=0,tipo2=0,tipo3=0,flag=0;

            Scanner scan = new Scanner(System.in);

            //lendo o arquivo

            System.out.print("Informe o nome do arquivo: ");
            String Arquivo = scan.next();
            File file = new File(Arquivo);
            Scanner f = new Scanner(file);

            ArrayList<Processos> listaProcessos = new ArrayList<Processos>();

            while (f.hasNextLine()) {

                String processo = f.nextLine();

                //separando os tipos das variaveis do arquivo

                String str = processo;
                String[] result = str.split(" ");

                String nome = result[0];
                int ingresso = Integer.parseInt(result[1]);
                int duracao  = Integer.parseInt(result[2]);
                int prioridade = Integer.parseInt(result[3]);
                int tipo = Integer.parseInt(result[4]);

                //verificacao do tipo
                if(tipo == 1){
                    tipo1++;
                    flag = 1;
                }
                else if(tipo == 2){
                    tipo2++;
                    flag = 2;
                }
                else if(tipo == 3){
                    tipo3++;
                    flag = 3;
                }

                Processos pr = new Processos(nome,ingresso,duracao,prioridade,tipo);
                listaProcessos.add(pr);
            }
            System.out.println(tipo1+" processo(s) do tipo 1 (CPU-Bound)");
            System.out.println(tipo2+" processo(s) do tipo 2 (IO-Bound)");
            System.out.println(tipo3+" processo(s) do tipo 3 (Ambos)");
            System.out.println("Algoritmos de Escalonamento de Tarefas disponiveis:");
            System.out.println("1. FCFS");
            System.out.println("2. SJF");
            System.out.println("3. RR");
            System.out.println("4. Prioridade fixa");
            System.out.print("Escolha uma opcao acima: ");
            int opc = scan.nextInt();

            //verificação da escolha do usario
            if(opc==1){
                if(flag == 1 || flag == 3){
                    FCFS p1 = new FCFS(listaProcessos);
                    System.out.print(p1.descricaoFCFS());
                }else{
                    System.out.print("Não há processo(s) do tipo 1 (CPU-Bound)");
                }
            }else if(opc==2){
                if(flag == 1 || flag == 3){
                    SJF p2 = new SJF(listaProcessos);
                    System.out.print(p2.descricaoSJF());
                }else{
                    System.out.print("Não há processo(s) do tipo 1 (CPU-Bound)");
                }
            }else if(opc==3){
                if(flag==2 || flag ==3){
                    System.out.print("Digite um valor de Quantum: ");
                    Quantum = scan.nextInt();
                    RR p3 = new RR(listaProcessos,Quantum);
                    System.out.print(p3.descricaoRR());
                }else{
                    System.out.print("Não há processo(s) do tipo 2 (IO-Bound)");
                }
            }else if(opc==4){
                if(flag==2 || flag == 3){
                    System.out.print("Digite um valor de Quantum: ");
                    Quantum = scan.nextInt();
                    Prioridade p4 = new Prioridade(listaProcessos,Quantum);
                    System.out.print(p4.descricaoPrioridade());
                }else{
                    System.out.print("Não há processo(s) do tipo 2 (IO-Bound)");
                }
            }
            System.out.print("\nVocê deseja inserir um novo arquivo (s/n) ? ");
            saida = scan.next().charAt(0);
            System.out.println();
        }
    } 
}
