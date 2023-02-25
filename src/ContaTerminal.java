import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) throws Exception {
    Conta conta = new Conta();
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, digite o número da Conta!");
    conta.setNumero(Integer.parseInt(sc.nextLine()));
    System.out.println("Por favor, digite o número da Agência!");
    conta.setAgencia(sc.nextLine());
    System.out.println("Por favor, digite o nome do Cliente!");
    conta.setNomeCliente(sc.nextLine());
    System.out.println("Por favor, digite o saldo da Conta!");
    conta.setSaldo(Double.parseDouble(sc.nextLine()));

    // =========================================

    System.out.println(
      "Olá + " +
      conta.getNomeCliente() +
      ", obrigado por criar uma conta em nosso banco, sua agência é " +
      conta.getAgencia() +
      " e seu número de conta é " +
      conta.getNumero() +
      " e seu saldo  " +
      conta.getSaldo() +
      "já está disponível para saque"
    );

    sc.close();
  }
}
