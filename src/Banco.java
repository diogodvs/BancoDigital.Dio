import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco extends Conta{
    Scanner dados = new Scanner(System.in);
    List<Conta> listaContas = new ArrayList<Conta>();

    public Banco(Cliente cliente, String tipoConta) {
        super(cliente, tipoConta);
    }

    public void cadastrarConta(){

        System.out.println("Insira seu nome completo: ");
        String nome = dados.nextLine();

        System.out.println("Insira seu Cpf (apenas numeros): ");
        String cpf = dados.nextLine();

        System.out.println("Deseja abrir uma conta Corrente ou Poupança?");
        char tipoConta = dados.nextLine().charAt(0);

        Cliente cliente = new Cliente(nome, cpf);
        Conta conta = new Conta(cliente, getTipoConta());

        listaContas.add(conta);
    }
    public void tiparConta(char tipoConta){

        if(tipoConta == 'C' || tipoConta == 'c'){
            setTipoConta("Corrente");
        } else {
            setTipoConta("Poupanca");
        }
    }
    public Conta acessarConta() {
        System.out.println("-- Acesso Conta --");
        System.out.println("Insira seu Cpf (apenas numeros): ");
        String cpf = dados.nextLine();

        Conta conta = null;
        for (Conta cota : listaContas) {
            if (listaContas.contains(cpf)) {
                conta = listaContas.get(numeroConta);
            }
//            int index = listaContas.indexOf(cpf) -1;
//            Conta conta = listaContas.get(index);
        }

        return conta;
    }

}
