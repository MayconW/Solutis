package Heranca;


public class Main {


    static void imprime_fornecedor(Fornecedor fornecedor) {

        System.out.println("-------------------------------------------------");
        System.out.println("Fornecedor, Nome: " + fornecedor.getNome());
        System.out.println("Endereco: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
        System.out.println("Valor de Credito: " + fornecedor.getValorCredito());
        System.out.println("Valor de Divida: " + fornecedor.getValorDivida());
    }

    private static void dados(Empregado empregado) {
        System.out.println("Endereco: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Codigo Setor: " + empregado.getCodigoSetor());
        System.out.println("Salario Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
    }


    static void imprime_empregado(Empregado empregado) {

        System.out.println("-------------------------------------------------");
        System.out.println("Empregado, Nome: " + empregado.getNome());
        dados(empregado);
        System.out.println("Salario Liquido: " + empregado.calcularSalario());

    }


    static void imprime_administrador(Administrador administrador) {

        System.out.println("-------------------------------------------------");
        System.out.println("Administrador, Nome: " + administrador.getNome());
        dados(administrador);
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salario Administrador: " + administrador.calcularSalario());

    }

    static void imprime_operario(Operario operario) {

        System.out.println("-------------------------------------------------");
        System.out.println("Operario, Nome: " + operario.getNome());
        dados(operario);
        System.out.println("Valor Producaoo: " + operario.getValorProducao());
        System.out.println("Comissao: " + operario.getComissao() + "%");
        System.out.println("Salario Operario: " + operario.calcularSalario());

    }

    static void imprime_vendedor(Vendedor vendedor) {
        System.out.println("-------------------------------------------------");
        System.out.println("Vendedor Nome: " + vendedor.getNome());
        dados(vendedor);
        System.out.println("Valor Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissao: " + vendedor.getComissao() + "%");
        System.out.println("Salario Vendedor: " + vendedor.calcularSalario());
    }


    public static void main(String[] args) {

        Fornecedor tcp = new Fornecedor("TCP", "Rua IP", "192-168-0-1", 1000.0, 300.0);
        Fornecedor fornecedor = new Fornecedor("Tekpix", "Avenida Brasil", "0800-777-7000", 10000.0, 500.0);
        Empregado empregado = new Empregado("Maycon", "Rua Sao Jose", "98800-0000", 1, 1400, 10.0);
        Administrador administrador = new Administrador("Carminha", "Rua Avenida Brasil", "98877-6655", 2, 3000, 25, 200.0);
        Operario operario = new Operario("Lee Sin", "Rua Ionia", "4444-3333", 3, 2000, 5, 5000.0, 5.0);
        Vendedor vendedor = new Vendedor("Cleber", "Rua Augusta", "1234-5678", 4, 1500.0, 10, 7000.0, 3.0);

        imprime_fornecedor(tcp);
        imprime_fornecedor(fornecedor);
        imprime_empregado(empregado);
        imprime_administrador(administrador);
        imprime_operario(operario);
        imprime_vendedor(vendedor);

    }
}
