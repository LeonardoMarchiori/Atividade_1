public class ContaEspecial extends ContaBancaria{

    private float limite = 0.3f;

    public Float mostrarSaldoComLimite(){

        return this.limite = getSaldo() * limite;

    }


}
