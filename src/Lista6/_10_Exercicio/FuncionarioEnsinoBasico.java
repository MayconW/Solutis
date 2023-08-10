package Lista6._10_Exercicio;

public class FuncionarioEnsinoBasico extends FuncionarioEscolaridade {

    public FuncionarioEnsinoBasico() {

    }

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaEnsinoBasico) {
        super(nome, codigoFuncional, escolaEnsinoBasico, null, null);
    }

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, Double comissao) {
        super(nome, codigoFuncional, comissao);
    }

    @Override
    public double calcularRendaTotal() {
        return getRenda() + getRenda() * 0.1 + getComissao();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\nCódigo Funcional: " + getCodigoFuncional()
                + "\nEscola de Ensino Básico: " + getEscolaEnsinoBasico()
                + "\nRenda: " + calcularRendaTotal();
    }
}
