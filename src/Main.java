public class Main {

    public static void main(String[] args) {

        Banco virtBank = new Banco(null, null);

        virtBank.cadastrarConta();
        virtBank.cadastrarConta();

        virtBank.listarClientes(virtBank.listaContas);

        virtBank.exibirContaUnica(virtBank.acessarConta());




    }
}
