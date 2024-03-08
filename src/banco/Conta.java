package banco;

public class Conta {

    private int numeroConta;
    private String nome;
    private double saldo;


    public Conta() {
    }

    public Conta(int numeroConta, String nome, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public Conta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }


    public int getNumeroConta() {
        return numeroConta;
    }
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }


    public double deposito(double valor){
        return this.saldo += valor;
    }

    public double saque(double valor){
        valor += 5;
        return  this.saldo -= valor;
    }

    public String toString(){
        return "Account " +
                String.format("%d", numeroConta) +
                ", Holder: " +
                nome +
                ", Balance: $ " +
                String.format("%.2f", saldo);
    }
    
}
