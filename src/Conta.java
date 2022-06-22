public class Conta implements IConta{
    protected static final int NUMERO_AGENCIA = 1234;
    private static int SEQUENCIAL = 1;
    protected int numeroAgencia;
    protected int numeroConta;
    protected double saldo;
    protected String tipoConta;
    protected Cliente cliente;

    public Conta(Cliente cliente, String tipoConta) {
        this.numeroAgencia = NUMERO_AGENCIA;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = this.cliente;
    }
    @Override
    public void sacar(double value) {
    saldo -= value;
    }

    @Override
    public void depositar(double value) {
    saldo += value;
    }

    @Override
    public void transferir(double value, Conta contaDestino) {
    this.sacar(value);
    contaDestino.depositar(value);
    }

    @Override
    public void imprimirExtrato(Conta conta) {

        System.out.println(" Extrato Conta " + conta.tipoConta);
        System.out.println(" Nome Cliente: " + conta.cliente.getNome());
        System.out.println(" Cpf Cliente: " + conta.cliente.getCpf());
        System.out.println(" Saldo : " + conta.saldo );
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}

