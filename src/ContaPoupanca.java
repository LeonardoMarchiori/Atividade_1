public class ContaPoupanca extends ContaEspecial{

    private static final Float TAXA_RENDIMENTO = 0.075f;
    private Integer diasRendimento;

    public Integer getDiasRendimento() {
        return diasRendimento;
    }
    public void setDiasRendimento(Integer diasRendimento) {
        this.diasRendimento = diasRendimento;
    }

    public void calcularNovoSaldo(){

        setSaldo(getSaldo() * TAXA_RENDIMENTO);

    }
}
