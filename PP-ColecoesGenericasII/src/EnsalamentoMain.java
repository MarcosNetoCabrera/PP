public class EnsalamentoMain {
  public static void main(String args[]){

        
        /*Ensalamento e1 = new Ensalamento();
        Sala s1 = new Sala(2, 101, 50, true);
        Sala s2 = new Sala(2, 102, 100, true);
        Sala s5 = new Sala(2, 203, 50, false);
        Sala s6 = new Sala(2, 204, 100, false);
        e1.addSala(s1);
        e1.addSala(s2);
        e1.addSala(s5);
        e1.addSala(s6);

        Turma t1 = new Turma("Organização de Computadores", "Andrew S. Tanenbaum", 60, false);
        Turma t2 = new Turma("Eletrónica Digital 2", "Grim", 50, false);
        Turma t3 = new Turma("Conversão de Energia", "Rafael", 25, true);
        Turma t4 = new Turma("Sistema de eventos discretos", "PIO", 70, true);
        
        t1.addHorario(7);t1.addHorario(21);t1.addHorario(35);
        t2.addHorario(1);t2.addHorario(15);t2.addHorario(29);
        t3.addHorario(12);t3.addHorario(16);t3.addHorario(26);
        t4.addHorario(2);t4.addHorario(16);t4.addHorario(30);

        e1.addTurma(t2);
        //e1.addTurma(t2);
        //e1.addTurma(t3);
        //e1.addTurma(t4);
        e1.alocar(t1, s1);
        e1.alocar(t2, s1);
        e1.alocar(t3, s1);
        e1.alocar(t4, s1);
        e1.alocar(t1, s2);
        e1.alocar(t2, s2);
        e1.alocar(t3, s2);
        e1.alocar(t4, s2);
        e1.alocar(t1, s5);
        e1.alocar(t2, s5);
        e1.alocar(t3, s5);
        e1.alocar(t4, s5);
        
        e1.alocarTodas();*/
       
        Ensalamento e = new Ensalamento();
        Sala s1 = new Sala(1000, 101, 70, true);
        Sala s2 = new Sala(2000, 201, 100, false);
        Sala s3 = new Sala(3000, 301, 60, true);
        e.addSala(s1);
        e.addSala(s2);
        e.addSala(s3);
        Turma t1 = new Turma("Turma 1", "Prof. 1", 60, true);
        t1.addHorario(2);
        t1.addHorario(16);
        t1.addHorario(30);
        e.addTurma(t1);
        Turma t2 = new Turma("Turma 2", "Prof. 2", 60, true);
        t2.addHorario(2);
        t2.addHorario(18);
        //e.addTurma(t2);
        e.alocarTodas();
        e.ensalamento.size();
        e.getTotalTurmasAlocadas();
              
     
        System.out.println(e.salaDisponivel(s1, 8));
        System.out.println(e.relatorioTurmasPorSala());
      }
}
