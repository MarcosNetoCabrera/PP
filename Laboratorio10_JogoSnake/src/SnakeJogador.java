import java.awt.Point;
import java.util.*;

/**
 * Classe de exemplo para a implementação de um Jogador para o Jogo Snake.
 * Nesta implementação, a próxima direção da cobra é escolhida aleatoriamente
 * entre as direções possíveis (que não geram colisões).
 * <p>
 * Use esta classe como base inicial para a sua solução do jogo. Basicamente
 * você precisará reimplementar o método {@code getDirecao}.
 * 
 * @author Horácio
 */

public class SnakeJogador {
    private Snake jogo;
    ArrayList<Character> posicoesAnteriores = new ArrayList<Character>();

    /**
     * Cria um novo jogador para o jogo passado como parâmetro.
     * @param jogo jogo snake.
     */
    public SnakeJogador(Snake jogo) {
        this.jogo = jogo;
    }

    /**
     * Executado pelo método {@link Snake#inicia()} a cada 'tick' do jogo para
     * perguntar qual a próxima direção da cobra ('C'ima, 'D'ireita, 'B'aixo,
     * 'E'squerda ou 'N'enhum).
     *
     * @return a próxima direção da cobra.
     */
    public char getDirecao() {
        /*
         * IMPLEMENTE AQUI A SUA SOLUÇÃO PARA O JOGO
         */

        ArrayList<Character> possiveisDirecoes = new ArrayList<Character>(4);
        Point cabeca = jogo.getSegmentos().getFirst();

        // Adiciona as possíveis direções na lista
        if (jogo.isCelulaLivre(cabeca.x, cabeca.y-1)) possiveisDirecoes.add('C'); // Cima
        if (jogo.isCelulaLivre(cabeca.x+1, cabeca.y)) possiveisDirecoes.add('D'); // Direita
        if (jogo.isCelulaLivre(cabeca.x, cabeca.y+1)) possiveisDirecoes.add('B'); // Baixo
        if (jogo.isCelulaLivre(cabeca.x-1, cabeca.y)) possiveisDirecoes.add('E'); // Esquerda


        // Não existe mais nenhuma direção disponível
        if (possiveisDirecoes.size() == 0) return 'N';
        int direcao = 0;
        int maior = 0;
        int num=0;


        Point comida = jogo.getComida();

        if (cabeca.x < comida.x //&& jogo.isCelulaLivre(comida.x,cabeca.x)==true
        ){
            direcao = possiveisDirecoes.indexOf('D');
        }else if(cabeca.x > comida.x //&& jogo.isCelulaLivre(cabeca.x,cabeca.y+1)==true
        ){
            direcao = possiveisDirecoes.indexOf('E');
        }else{
            if (cabeca.y < comida.y //&& jogo.isCelulaLivre(comida.y,cabeca.y+1)==true
            ){
                direcao = possiveisDirecoes.indexOf('B');
            }else if(cabeca.y > comida.y //&& jogo.isCelulaLivre(comida.y,cabeca.y)==true
            ){
                direcao = possiveisDirecoes.indexOf('C');
            }
        }

        if(direcao == -1) {
            Point cabecaAux = new Point(cabeca.x,cabeca.y);
            System.out.println("entrou");
            for(int i=0;i<possiveisDirecoes.size();i++){
                boolean aux = morte(comida,cabecaAux,possiveisDirecoes.get(i));
                if(aux==false){
                    direcao = i;
                    break;
                }
           }
            if(possiveisDirecoes.size()==1){
                direcao = 0;
            }
        }
        return possiveisDirecoes.get(direcao);
    }
    public boolean morte(Point comida,Point cabeca, Character direcao){
        int cont=0;
        if(direcao=='C'){
            while(jogo.isCelulaLivre(cabeca.x,cabeca.y-1)==true){
                if(cabeca.y-1==0){
                    return false;
                }
                cabeca.y--;
            }
        }else if(direcao=='B'){
            while(jogo.isCelulaLivre(cabeca.x,cabeca.y+1)==true){
                if(cabeca.y+1==19){
                    return false;
                }
                cabeca.y++;
            }
        }else if(direcao=='D'){
            while(jogo.isCelulaLivre(cabeca.x+1,cabeca.y)==true){
                if(cabeca.x+1==19){
                    return false;
                }
                cabeca.x++;
            }
        }else if(direcao=='E') {
            while (jogo.isCelulaLivre(cabeca.x-1, cabeca.y) == true){
                if(cabeca.x-1==0){
                    return false;
                }
                cabeca.x--;
            }
        }
        return true;
    }
}
