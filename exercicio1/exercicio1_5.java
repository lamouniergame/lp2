public class exercicio1_5{
    public double a = 45;
    public double b = 20;
    public double c = 3;
    public double soma = a+b+c;
    public double multi = a*b*c;
    public double div = a/b/c;
    public double sub = a-b-c;
            
    public void imprimir(){
        System.out.println("O valor da soma foi: " +soma);
        System.out.println("O valor da multiplicaçao foi: " +multi);
        System.out.println("O valor da divisao foi: " +div);
        System.out.println("O valor da subtraçao foi: " +sub);
    }
    
    public static void main(String [] args){
        exercicio1_5 ex5 = new exercicio1_5();
        
        ex5.imprimir();
    }
}
