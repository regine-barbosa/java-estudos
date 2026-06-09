package PooLoops01.exercicio03contabancaria;

public class ContaBancaria {
   private double conta;
   private double saldo;

    public ContaBancaria(double conta, double saldo){
        this.conta = conta;
        this.saldo = saldo;
    }
    public ContaBancaria(){}

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Erro, não pode depositar R$ 0,00 ou valor negativo. Tente novamente.");
            return;
        }
        saldo += valor;
        System.out.println("Valor de " + valor + " depositado com sucesso!");
    }
    public void sacar(double valor){
        saldo -= valor;
        if(valor < saldo){
            System.out.println("Não é possível efetuar o saque. Valor insuficiente.");
        } else {
            System.out.println("Saque no valor de " + valor + " efetuado com sucesso!");
            System.out.println(getSaldo());
        }
    }
    public void consultarSaldo(double saldo){
        System.out.println("O saldo atual é de R$" + getSaldo());
    }
}
