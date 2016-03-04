public class exercicio1_4{
    public float a = 45;
    public float b = 20;
    public float c = 3;
    public float soma = a+b+c;
    public float multi = a*b*c;
    public float div = a/b/c;
    public float sub = a-b-c;
            
    public void imprimir(){
        System.out.println("O valor da soma foi: " +soma);
        System.out.println("O valor da multiplicaçao foi: " +multi);
        System.out.println("O valor da divisao foi: " +div);
        System.out.println("O valor da subtraçao foi: " +sub);
    }
    
    public static void main(String [] args){
        exercicio1_4 ex4 = new exercicio1_4();
        
        ex4.imprimir();
    }
}

