public class Conta {
    String numero;
    String cpf;
    double saldo;
    double limite;
    double taxa;
    boolean negativado;

    public Conta(String numero, String cpf, double limite){
        this.numero = numero;
        this.cpf = cpf;
        this.limite = limite;
        saldo = 0;
        taxa = 0.03;
        negativado = false;
    }

    public double depositar(double valor){
        if(negativado && valor > 0)
            return saldo += valor - (valor * taxa);

        if(valor > 0)
            return saldo += valor;

        estadoConta();
        return saldo;
    }

    public boolean validarSaque(double valor){
        if(valor > (saldo + limite))
            return false;
        return true;
    }

    public double sacar(double valor){
        if(validarSaque(valor))
            saldo -= valor;
        estadoConta();
        return saldo;
    }

    public void estadoConta(){
        negativado = false;
        if(saldo < 0)
            negativado = true;
    }
}
