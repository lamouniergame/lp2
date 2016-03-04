public class exercicio1_3{
    public int a = 45;
    public int b = 20;
    public int c = 3;
    public int soma = a+b+c;
    public int multi = a*b*c;
    public int div = a/b/c;
    public int sub = a-b-c;
            
    public void imprimir(){
        System.out.println("O valor da soma foi: " +soma);
        System.out.println("O valor da multiplicaçao foi: " +multi);
        System.out.println("O valor da divisao foi: " +div);
        System.out.println("O valor da subtraçao foi: " +sub);
    }
    
    public static void main(String [] args){
        exercicio1_3 ex3 = new exercicio1_3();
        
        ex3.imprimir();
    }
}

