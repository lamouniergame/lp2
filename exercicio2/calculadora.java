public class calculadora{
    public int a;
    public int b;
            
    public void imprimirSoma(){
        int soma = a+b;
        System.out.println("O valor da soma foi: " +soma);
    }
    
    public void imprimirMulti(){
        int multi = a*b;
        System.out.println("O valor da multiplicacao foi: " +multi);
    }
    
    public void imprimirDiv(){
        int div = a/b;
        System.out.println("O valor da divisao foi: " +div);
    }
    
    public void imprimirSub(){
        int sub = a-b;
        System.out.println("O valor da subtracao foi: " +sub);
    }
    
    public static void main(String [] args){
        calculadora c1 = new calculadora();
        c1.a = 10;
        c1.b = 5;
        c1.imprimirSoma();
        c1.imprimirDiv();
        c1.imprimirMulti();
        c1.imprimirSub();
        
		calculadora c2 = new calculadora();
        c2.a = 25;
        c2.b = 10;
        c2.imprimirSoma();
        c2.imprimirDiv();
        c2.imprimirMulti();
        c2.imprimirSub();
		
		calculadora c3 = new calculadora();
        c3.a = 12;
        c3.b = 3;
        c3.imprimirSoma();
        c3.imprimirDiv();
        c3.imprimirMulti();
        c3.imprimirSub();
    }
}
