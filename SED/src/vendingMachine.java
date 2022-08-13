import java.util.*;

public class vendingMachine {
  static Scanner scan = new Scanner(System.in);
  static int produto,opc,moedas;
  static double valor = 0, total = 0, troco = 0;

  public static void pagamento() {
    System.out.println("Selecione uma opção.");
    do {
      // opções de moedas
      System.out.println("0. Parar de inserir moedas");
      System.out.println("1. Inserir moedas na máquina");
      opc = scan.nextInt();
      if (opc == 0) {
        break;
      }
      else if (opc == 1) { 
        System.out.println("Insira moedas nos valores de R$ 25, R$ 50 centavos ou R$ 1 real. Pressione 0 para parar de inserir");
        do {
          moedas = scan.nextInt();
          // moedas
          switch (moedas) {
          case 0:
            break;
          case 25:
            total += 0.25;
            break;
          case 50:
            total += 0.50;
            break;
          case 1:
            total += 1.0;
            break;
          default:
            System.out.println("Valor de moedas inválido, insira moedas nos valores de R$ 25, R$ 50 centavos ou R$ 1 real");
          }
        } while (moedas != 0);
      } else {
        System.out.println("Opção inválida, escolha uma das opções abaixo:");
      }
    } while (opc != 0);
  }

  public static void compra() {

    System.out.println("Escolha o seu produto.");
    // Seleção do produto
    produto = scan.nextInt();

    switch (produto) {
    case 0:
      valor += 0;
      break;
    case 1:
      valor += 0.25;
      break;
    case 2:
      valor += 0.75;
      break;
    case 3:
      valor += 1.25;
      break;
    default:
      System.out.println("Produto inválido");
    }
  }

  public static String troco() {
        String situacao="";
        if (total >= valor) {
          troco = total - valor;
          situacao = ""+ troco +"";
        }
        else {
          situacao ="Valor insuficiente";
        }
        return situacao;
  }
  
  public static void tela() {
    if (total > 1.50){
      total = 1.50;
    }
    System.out.println("Valor do produto : R$ " + valor);
    System.out.println("Valor de moedas inseridas : R$ " + total);
    if(valor>total){
      System.out.println(troco());
    }else if(valor <= total){
      System.out.println("Troco : R$ " + troco());
      System.out.println("Obrigado e volte sempre!");
    }
    
  }
  
  public static void main(String[] args) {
    System.out.println("Bem vindo a Neto Doces!");
    System.out.println("Produtos disponíveis");
    System.out.println("**************************");
    System.out.println("1. Brigadeiro por R$ 0,25");
    System.out.println("2. Cocada por R$ 0,75");
    System.out.println("3. Quindim por R$ 1,25");
    System.out.println("**************************\n");
    
    pagamento();
    compra();
    tela();
  }
}