import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco extends Conta{
    Scanner dados = new Scanner(System.in);
    List<Conta> listaContas = new ArrayList<Conta>();

    public Banco(Cliente cliente, String tipoConta) {
        super(cliente, tipoConta);
    }

    public List<Conta> cadastrarConta(){

        System.out.println("Insira seu nome completo: ");
        String nome = dados.nextLine();

        System.out.println("Insira seu Cpf (apenas numeros): ");
        String cpf = dados.nextLine();

        System.out.println("Deseja abrir uma conta Corrente ou Poupança?");
        char tipoConta = dados.nextLine().charAt(0);

        Cliente cliente = new Cliente(nome, cpf);
        Conta conta = new Conta(cliente, getTipoConta());

        listaContas.add(conta);
        return listaContas;
    }
    public void tiparConta(char tipoConta){

        if(tipoConta == 'C' || tipoConta == 'c'){
            setTipoConta("Corrente");
        } else {
            setTipoConta("Poupanca");
        }
    }
    public int acessarConta() {
        System.out.println("-- Acesso Conta --");
        System.out.println("Insira seu Cpf (apenas numeros): ");
        String cpf = dados.nextLine();

        int index = -1;
        for (int i = 0; i < listaContas.size(); i++) {
            if (listaContas.get(i).cliente.getCpf().contains(cpf)) {
                index = i + 1;
                break;
            }
        }
        return index;
    }


    public void listarClientes(List<Conta> conta){
        System.out.println(" -- Contas -- ");
        for (int i = 0; i < listaContas.size() ; i++) {
            System.out.println(listaContas.get(i).cliente.toString());
        }

    }

    public void exibirContaUnica(int index){
        System.out.println(" -- Conta -- ");
        listaContas.toString().indexOf(index);
        System.out.println("Agencia: " + listaContas.get(index ).getNumeroAgencia());
        System.out.println("Numero Conta: " + listaContas.get(index ).getNumeroConta());
        System.out.println("Saldo: " + listaContas.get(index).getSaldo());

    }
}

