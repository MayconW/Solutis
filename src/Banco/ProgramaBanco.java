package Banco;

public class ProgramaBanco {
    public static void main(String[] args) {

        Cliente primeiroTitular = new Cliente("434000000", "Maycon", "Rua Turquia", "1997");
        Cliente segundoTitular = new Cliente("434000001", "Lucas", "Rua Lucas", "1997");

        ContaCorrente conta = new ContaCorrente("1", "Basica", primeiroTitular, segundoTitular, 1000, 3000);
        ContaCorrente contaUnica = new ContaCorrente("1", "Basica", primeiroTitular, 1000, 3000);

        conta.credito(300);
        conta.resumo();
        contaUnica.resumo();


    }
}
