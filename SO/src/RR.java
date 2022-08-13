import java.util.*;
public class RR {
    public ArrayList<Processos> process;
    public int Quantum;

    //construtor
    public RR(ArrayList<Processos> process,int Quantum){
        this.process = process;
        this.Quantum = Quantum;
    }

    public String descricaoRR(){

        //declaração das variaveis que vão ser utilizadas
        double tempoMedioExc=0;
        double tempoMedioEsp=0;
        int size = process.size();
        double tempoInicial[] = new double[size];
        double tempoFinal[] = new double[size];
        ArrayList processos = new ArrayList();
        double ingressos[] = new double[size];
        double duracoes[] = new double[size];
        double temposExecucao[] = new double[size];
        int num_processos=size;
        int exc = 0;
        String escalonamentoOrdem = "";

        //criando vetores com os tempos de ingresso e duração
        for(int i = 0; i< size; i++){
            duracoes[i]=(process.get(i).duracao);
            ingressos[i]=(process.get(i).ingresso);
        }
        //primeiro tempo da lista de ingressos começa como o tempo atual
        double tempoAtual = process.get(0).ingresso;

        //laço com para escalonar todos os processos
        while (num_processos > 0) {
            // verifica antes de iniciar o processo se ele ja foi executado
            for (int i = 0; i < size; i++) {
                // se ele ainda não foi executado e se seu tempo de ingresso eh menor que o tempo atual
                if (ingressos[i] != -1 && (ingressos[i] <= tempoAtual)) {
                    // o processo eh adicionado a lista de processos
                    processos.add(i);
                    // recebe -1 no seu ingresso para mostrar que ja foi iniciado
                    ingressos[i] = -1;
                }
            }
            // se a lista de processos tiver vazia ele aumenta o tempo atual
            if (processos.isEmpty()) {
                tempoAtual++;
            }else{
                // o processo que vai ser executado eh removido da lista de processos
                exc = (int) processos.remove(0);
                escalonamentoOrdem += "P" + (exc + 1) + " ";
                int q = Quantum;

                //faz a execução do processo de acordo com o tempo disponivel (Quantum)
                while ((q > 0) && (duracoes[exc] > 0)) {
                    tempoAtual++;
                    q--;
                    double novaDuracao = (duracoes[exc] - 1);
                    duracoes[exc] = novaDuracao;
                }
                // verifica se algum processo entrou durante o tempo de execucao
                if (duracoes[exc] > 0) {
                    for (int i = 0; i < size; i++) {
                        if (ingressos[i] != -1 && ingressos[i] <= tempoAtual) {
                            processos.add(i);
                            ingressos[i] = -1;
                        }
                    }
                    processos.add(exc);
                } else {
                    // o processo acabou
                    tempoFinal[exc] = tempoAtual;
                    num_processos--;
                }
            }
        }
        // faz o calculo do tempo total de execução e o tempo total de espera
        for(int i = 0; i < size; i++) {
            temposExecucao[i] = tempoFinal[i] - process.get(i).ingresso;
            tempoMedioExc += temposExecucao[i];
            tempoMedioEsp += temposExecucao[i] - process.get(i).duracao;
        }
        // eh tirada as medias do tempo total de execução e de espera, os dois dividido pelo numero de tarefas
        tempoMedioExc = tempoMedioExc / size;
        tempoMedioEsp = tempoMedioEsp / size;

        // mostra as informações do escalonador ao usuario
        String str = "Escalonamento RR: \n";
        str += escalonamentoOrdem;
        str += "\nTempo médio de execução: "+tempoMedioExc+"\n"
                +"Tempo médio de espera: "+tempoMedioEsp+"\n";
        return str;
    }
}
