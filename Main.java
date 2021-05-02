import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    PilhaEstatica p = new PilhaEstatica(15);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Criei Pilha: " + p.tamanho());

    String entrada = "";
    while (entrada.compareTo("sair")!= 0){
      System.out.println("entrada: ");
      entrada = scanner.nextLine();
      if (p.cheia()){
        System.out.println("Erro, Pilha Cheia");
      }
      else {
        p.inserir(entrada);
      }
    }
    String out;
    while ((out = p.retirar()) != null){
      System.out.println("Retirando: " + out);
    }
    scanner.close();
  }
}  