public class ContaBancaria {

    private String cliente;
    private Integer numConta;
    private Float saldo;

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public Integer getNumConta() {
        return numConta;
    }
    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }
    public Float getSaldo() {
        return saldo;
    }
    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Float sacar(Float saque){
        if (saldo > 0){
            this.saldo -= saque;
        }
        return this.saldo;
    }

    public Float depositar(Float deposito){
        return this.saldo += deposito;
    }

}

