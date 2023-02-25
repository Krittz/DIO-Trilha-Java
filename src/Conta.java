public class Conta {

  private int numero;
  private String agencia;
  private String nomeCliente;
  private double saldo;
  
  public Conta(int numero, String agencia, String nomeCliente, double saldo) {
    this.numero = numero;
    this.agencia = agencia;
    this.nomeCliente = nomeCliente;
    this.saldo = saldo;
  }
  public Conta(){

  }


  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getAgencia() {
    return this.agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public String getNomeCliente() {
    return this.nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

}
