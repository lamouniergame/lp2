public class ContaBancaria2{
    public int agencia;
    public int contaCorrente;
    public double saldo;
    public double limiteExtra;
    public String titularConta;
    
    public ContaBancaria2(String titular, int agen, int contaCor, double sd, double limite){
        this.agencia = agen;
        this.titularConta = titular;
        this.contaCorrente = contaCor;
        this.saldo = sd;
        this.limiteExtra = limite;
    }
    
    public void imprimirSaldo(){
        System.out.println("Saldo: " +saldo);
    }
    
    public void imprimirContaCorrente(){
        System.out.println("Conta Corrente: " +contaCorrente);
    }
    
    public void imprimirSaldoTotal(){
        System.out.println("Saldo Total: " +(limiteExtra+saldo));
    }
    
    public void imprimirAgencia(){
        System.out.println("Agência: " +agencia);
    }
    
    public void imprimirTitular(){
        System.out.println("Saldo do Cliente: " +titularConta);
    }
    
    public static void main(String [] args){
        ContaBancaria2 c1 = new ContaBancaria2("Afonso",3610,15766,35.54,50.00);
        c1.imprimirTitular();
        c1.imprimirAgencia();
        c1.imprimirContaCorrente();
        c1.imprimirSaldo();
        c1.imprimirSaldoTotal();
        
        ContaBancaria2 c2 = new ContaBancaria2("Zenon",810,6132,42.31,75.00);
        c2.imprimirTitular();
        c2.imprimirAgencia();
        c2.imprimirContaCorrente();
        c2.imprimirSaldo();
        c2.imprimirSaldoTotal();
    }
}
