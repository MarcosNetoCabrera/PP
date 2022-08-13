public class Processos {
    public static String p;
    String tarefa;
    int ingresso;
    int duracao;
    int prioridade;
    int tipo;

    public Processos(String tarefa,int ingresso,int duracao, int prioridade, int tipo){
        this.tarefa = tarefa;
        this.ingresso = ingresso;
        this.duracao = duracao;
        this.prioridade = prioridade;
        this.tipo = tipo;
    }
}