package Utilites;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("************************************");
        System.out.println("******* Extrato Bancario ***********");
        super.infosComuns();
    }
}
