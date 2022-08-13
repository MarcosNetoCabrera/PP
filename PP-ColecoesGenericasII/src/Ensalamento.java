import java.util.*;

public class Ensalamento {
    ArrayList<Sala> salas;
    ArrayList<Turma> turmas;
    ArrayList<TurmaEmSala> ensalamento;

    public Ensalamento(){
        this.salas = new ArrayList<Sala>();
        this.turmas = new ArrayList<Turma>();
        this.ensalamento = new ArrayList<TurmaEmSala>();
    }
    public void addSala(Sala sala){
        salas.add(sala);
    }
    public void addTurma(Turma turma){
        turmas.add(turma);
    }
    public Sala getSala(Turma turma){
        for(TurmaEmSala a : ensalamento){
            if(a.turma==turma){
                return a.sala;
            }
        }
        return null;
    }
    public boolean salaDisponivel(Sala sala, int horario){
        for(TurmaEmSala a: ensalamento){
            if(a.sala==sala){
                if(a.turma.horarios.contains(horario)==true){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios){
        
        boolean disp = true;

        for(int a: horarios){
            if(salaDisponivel(sala,a)==false){
                disp = false;
                break;
            }
        }
        return disp;
    }
    public boolean alocar(Turma turma, Sala sala){
        
        TurmaEmSala a = new TurmaEmSala(turma,sala);
        
        if(turma.acessivel==true){
            if(sala.acessivel==true){
                if(turma.numAlunos <= sala.capacidade){
                    if(salaDisponivel(sala, turma.horarios)==true){
                        ensalamento.add(a);
                        return true;
                    }
                }
            }       
        }else{
            if(turma.numAlunos <= sala.capacidade){
                if(salaDisponivel(sala, turma.horarios)==true){
                    ensalamento.add(a);
                    return true;
                }
            }
        }
        return false;
    }
    
    public void alocarTodas(){
        
        for(int i=0;i<turmas.size();i++){
            Turma t1 = turmas.get(i);
            for(int y=0;y<salas.size();y++){
                Sala s1 = salas.get(y);
                if(alocar(t1,s1)==true){
                    break;
                }
            }
        }
    }
    public int getTotalTurmasAlocadas(){
        int cont=0;
        for(TurmaEmSala a: ensalamento){
            if(a.sala!=null){
                cont++;
            }
        }
        return cont;
    }
    public int getTotalEspacoLivre(){
        int total = 0;
        for(TurmaEmSala a: ensalamento){
            total += a.sala.capacidade - a.turma.numAlunos;
        }
        return total;
    }
    public String relatorioResumoEnsalamento(){
        int cont_salas=0, cont_turmas=0;
        for(Turma a: turmas){
            cont_turmas++;
        }
        for(Sala b: salas){
            cont_salas++;
        }
        int total = getTotalTurmasAlocadas();
        int livre = getTotalEspacoLivre();

        return ("Total de Salas: "+cont_salas+
        "\nTotal de Turmas: "+cont_turmas+
        "\nTurmas Alocadas: "+total+
        "\nEspaços Livres: "+livre+"\n");
    }
    public String relatorioTurmasPorSala(){

        String str = relatorioResumoEnsalamento()+"\n";
        for(Sala s: salas){
            str += "---"+s.getDescricao()+"---\n";
            for(TurmaEmSala t: ensalamento){
                if(t.sala == s){
                    str += t.turma.getDescricao();
                }
            } 
        }
        return (str + "\n");
    }
    public String relatorioSalasPorTurma(){
        
        String str = relatorioResumoEnsalamento()+"\n";;

        for(Turma t: turmas){
            str += t.getDescricao();
            if(getSala(t)==null){
                str += "Sala: SEM SALA\n";
            }else{
                Sala sala = getSala(t);
                str += "Sala: " + sala.getDescricao() + "\n";
            }
        }
        return (str+"\n");
    }
}
