import java.util.*;

public class FCFS {
    
    public ArrayList<Processos> process;

    //construtor
    FCFS(ArrayList<Processos> process){
       this.process = process;
    }

    public String descricaoFCFS(){

        // declaração das variaveis que vão ser utilizadas
        double tempoMedioExc=0;
        double tempoMedioEsp=0;
        double tempoInicial[] = new double[process.size()];
        double tempoFinal[] = new double[process.size()];

        // primeiro tempo da lista de ingressos começa como o tempo atual
        double tempoAtual = process.get(0).ingresso;

        // laço para calcular o tempo do escalonamento de processesos
        for(int i=0;i<process.size();i++){
            if(process.get(i).ingresso > tempoAtual){
                tempoAtual = process.get(i).ingresso;
            }

            // adiciona os tempos iniciais dos processos em um vetor
            tempoInicial[i] = tempoAtual;

            // vai somando o tempo total de duração
            tempoAtual += process.get(i).duracao;

            // adiciona os tempos finais dos processos em um vetor
            tempoFinal[i] = tempoAtual;
        }

        // faz o calculo do tempo total de execução e o tempo total de espera
        for (int i = 0; i < process.size(); i++) {
            tempoMedioExc += tempoFinal[i] - process.get(i).ingresso;
            tempoMedioEsp += tempoInicial[i] - process.get(i).ingresso;
        }
        // eh tirada as medias do tempo total de execução e de espera, os dois dividido pelo numero de tarefas
        tempoMedioExc = tempoMedioExc / process.size();
        tempoMedioEsp = tempoMedioEsp / process.size();

        // mostra as informações do escalonador ao usuario
        String str = "Escalonamento FCFS:\n";
        for(Processos a: process){
            str += a.tarefa+" ";
        }
        str += "\nTempo médio de execução: "+tempoMedioExc+"\n"
                +"Tempo médio de espera: "+tempoMedioEsp+"\n";
        return str;
    }
}
