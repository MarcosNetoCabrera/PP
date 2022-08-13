import java.util.*;

public class SJF {
    public ArrayList<Processos> process;

    //construtor
    public SJF(ArrayList<Processos> process){
        this.process = process;
    }

    public String descricaoSJF(){

        //declaração das variaveis que vão ser utilizadas
        double tempoMedioExc=0;
        double tempoMedioEsp=0;
        String escalonamentoOrdem = "";
        int size = process.size();
        int exc;
        int num_processos = size;

        double tempoInicial[] = new double[size];
        double tempoFinal[] = new double[size];
        ArrayList processos = new ArrayList();
        double ingressos[] = new double[size];
        double duracoes[] = new double[size];

        //criando vetores com os tempos de ingresso e duração
        for(int i = 0; i< size; i++){
            duracoes[i]=(process.get(i).duracao);
            ingressos[i]=(process.get(i).ingresso);
        }
        //primeiro tempo da lista de ingressos começa como o tempo atual
        double tempoAtual = process.get(0).ingresso;

        //laço com para escalonar todos os processos
        while (num_processos > 0) {

            // procura no vetor de ingressos os processos que ingressaram no tempoatual
            // se ele encontrar é adicionado na lista de processos
            processos = new ArrayList();
            for (int i = 0; i < size; i++) {
                if (ingressos[i] != -1 && ingressos[i] <= tempoAtual) {
                    processos.add(i);
                }
            }
            // partimos do principio que o primeiro na lista é o de menor duração
            if (processos.isEmpty()) {
                tempoAtual++;
            } else {
                exc = (int) processos.get(0);
                // passamos por toda lista de processos verificando a duração do processo atual
                for (int i = 0; i < processos.size(); i++) {
                    int pAtual = (int) processos.get(i); // processo atual
                    // se o processo atual tiver a a duração menor do que a menor encontrada
                    if (duracoes[pAtual] < duracoes[exc]) {
                        // entao eh alterado o processo que sera executo
                        exc = (int) processos.get(i);
                    }
                }
                // adiciona os tempos iniciais dos processos em um vetor
                tempoInicial[exc] = tempoAtual;

                // vai somando o tempo total de duração
                tempoAtual += duracoes[exc];

                // adiciona os tempos finais dos processos em um vetor
                tempoFinal[exc] = tempoAtual;

                // o tempo de ingresso executado eh substituido por -1 indicando
                // que o processo que ingressou naquele tempo ja foi escalonado
                ingressos[exc] = -1;

                // cria uma variavel contando a ordem em que os processos foram escalonados
                escalonamentoOrdem += "P" + (exc + 1) + " ";

                //diminui o numero de processos
                num_processos--;
            }
        }
        // faz o calculo do tempo total de execução e o tempo total de espera
        for(int i = 0; i < size; i++) {
            tempoMedioExc += tempoFinal[i] - process.get(i).ingresso;
            tempoMedioEsp += tempoInicial[i] - process.get(i).ingresso;
        }
        // eh tirada as medias do tempo total de execução e de espera, os dois dividido pelo numero de tarefas
        tempoMedioExc = tempoMedioExc / size;
        tempoMedioEsp = tempoMedioEsp / size;

        // mostra as informações do escalonador ao usuario
        String str = "Escalonamento SJF:\n";
        str += escalonamentoOrdem;
        str += "\nTempo médio de execução: "+tempoMedioExc+"\n"
                +"Tempo médio de espera: "+tempoMedioEsp+"\n";
        return str;
    }
}
