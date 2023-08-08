package Banco;

public class ContaCorrente {

    private String numero, tipo;
    private Cliente primeiroTitular, segundoTitular;
    private double saldo, limiteTotal;

    public ContaCorrente(String numero, String tipo, Cliente primeiroTitular, double saldo, double limiteTotal) {
        this.numero = numero;
        this.tipo = tipo;
        this.primeiroTitular = primeiroTitular;
        this.saldo = saldo;
        this.limiteTotal = limiteTotal;
        this.segundoTitular = null;
    }

    public ContaCorrente(String numero, String tipo, Cliente primeiroTitular, Cliente segundoTitular, double saldo, double limiteTotal) {

        this.numero = numero;
        this.tipo = tipo;
        this.primeiroTitular = primeiroTitular;
        this.segundoTitular = segundoTitular;
        this.saldo = saldo;
        this.limiteTotal = limiteTotal;

    }

    public void resumo() {
        System.out.println("--Dados da conta--");
        System.out.println("Numero da conta: " + getNumero());
        System.out.println("Numero do primero titular: " + primeiroTitular.getNome());
        if (segundoTitular != null) {
            System.out.println("Numero do segundo titular: " + segundoTitular.getNome());
        }
        System.out.println("Saldo atual: " + getSaldo());
        System.out.println("Limite atual: " + (getLimiteTotal() - getSaldo()));
        System.out.println("Limite Total: " + getLimiteTotal());


    }

    public boolean estaDevedor() {
        return saldo < 0;
    }

    public void credito(double valor) {

        setSaldo(valor);
    }

    public void debito(double valor) {
        setSaldo(-valor);
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getPrimeiroTitular() {
        return primeiroTitular;
    }

    public void setPrimeiroTitular(Cliente primeiroTitular) {
        this.primeiroTitular = primeiroTitular;
    }

    public Cliente getSegundoTitular() {
        return segundoTitular;
    }

    public void setSegundoTitular(Cliente segundoTitular) {
        this.segundoTitular = segundoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = this.saldo + saldo;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }
}
