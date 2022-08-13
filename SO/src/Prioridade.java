import java.util.*;

public class Prioridade {
    public ArrayList<Processos> process;
    public int Quantum;

    public Prioridade(ArrayList<Processos> process, int Quantum){
        this.process = process;
        this.Quantum = Quantum;
    }
    public String descricaoPrioridade(){

        //declaração das variaveis que vão ser utilizadas
        double tempoMedioExc=0;
        double tempoMedioEsp=0;
        int size = process.size();
        double tempoFinal[] = new double[size];
        ArrayList processos = new ArrayList();
        double prioridade[] = new double[size];
        double duracoes[] = new double[size];
        double ingressos[] = new double[size];
        double temposExecucao[] = new double[size];
        int num_processos=size;
        int exc = 0;
        int MaiorDeTodas = 0;
        String escalonamentoOrdem = "";

        //criando vetores com os tempos de prioridade e duração
        for(int i = 0; i< size; i++){
            duracoes[i]=process.get(i).duracao;
            prioridade[i]=process.get(i).prioridade;
            ingressos[i] =process.get(i).ingresso;

            //pega a maior prioridade
            if(process.get(i).prioridade > MaiorDeTodas){
                MaiorDeTodas = process.get(i).prioridade;
            }
        }
        //Supondo que o tempo atual eh o primeiro tempo ingressado para começar
        double tempoAtual = process.get(0).ingresso;

        //Supondo que a prioridade inicial eh do primeiro processo
        int prioridadeAtual = process.get(0).prioridade;


        //laço com para escalonar todos os processos
        while (num_processos > 0) {
            // verifica antes de iniciar o processo se ele ja foi executado
            for (int i = 0; i < size; i++) {
                // se ele ainda não foi executado e seu tempo de ingresso eh menor que o tempo atual
                // e se sua prioridade a maior que a prioridade atual
                if (ingressos[i] != -1 && prioridade[i] > prioridadeAtual && ingressos[i] <= tempoAtual) {
                    // o processo eh adicionado a lista de processos
                    processos.add(i);
                    // prioridade atual recebe a prioridade do processo que foi ingressado
                    prioridadeAtual = (int) prioridade[i];
                    // recebe -1 no ingresso para mostrar que ja foi iniciado
                    ingressos[i] = -1;
                }
            }
            if (processos.isEmpty() && prioridadeAtual >= 0) {
                //Diminui a prioridade naquele tempo
                prioridadeAtual--;
            } else if (processos.isEmpty() && prioridadeAtual == 0) {
                // se a lista de processos tiver vazia ele aumenta o tempo atual
                tempoAtual++;
            } else {
                // o processo que vai ser executado eh removido da lista de processos
                exc = (int) processos.remove(0);
                if (prioridadeAtual == MaiorDeTodas) {
                    //nao faz nada
                } else {
                    // monsta a ordem que esta sendo escalonado
                    escalonamentoOrdem += "P" + (exc + 1) + " ";
                }
                int q = Quantum;
                if (prioridadeAtual == MaiorDeTodas) {
                    // Se a prioridade atual for a maior de todas
                    // o processo deve ser executado ate o fim
                    while (duracoes[exc] > 0) {
                        escalonamentoOrdem += "P" + (exc + 1) + " ";
                        tempoAtual++;
                        double novaDuracao = (duracoes[exc] - 1);
                        duracoes[exc] = novaDuracao;
                    }
                } else {
                    // faz a execução do processo de acordo com o tempo disponivel (Quantum)
                    while ((q > 0) && (duracoes[exc] > 0)) {
                        tempoAtual++;
                        q--;
                        double novaDuracao = (duracoes[exc] - 1);
                        duracoes[exc] = novaDuracao;
                    }
                }
                // verifica se algum processo entrou durante o tempo de execucao
                if (duracoes[exc] > 0) {
                    for (int i = 0; i < size; i++) {
                        if (ingressos[i] != -1 && prioridade[i] >= prioridadeAtual && ingressos[i] <= tempoAtual) {
                            processos.add(i);
                            ingressos[i] = -1;
                            prioridadeAtual = (int) prioridade[i];
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
        for (int i = 0; i < size; i++) {
            temposExecucao[i] = tempoFinal[i] - process.get(i).ingresso;
            tempoMedioExc += temposExecucao[i];
            tempoMedioEsp += temposExecucao[i] - process.get(i).duracao;
        }
        // eh tirada as medias do tempo total de execução e de espera, os dois dividido pelo numero de tarefas
        tempoMedioExc = tempoMedioExc / size;
        tempoMedioEsp = tempoMedioEsp / size;

        // mostra as informações do escalonador ao usuario
        String str = "Escalonamento Prioridade: \n";
        str += escalonamentoOrdem;
        str += "\nTempo médio de execução: " + tempoMedioExc + "\n"
                + "Tempo médio de espera: " + tempoMedioEsp + "\n";

        return str;
    }
}
