public class Aluno{
    public String nome;
    public int idade;
    public String numeroMatricula;
            
    public Aluno(String nomeAluno, int idadeAluno, String Matricula){
        this.nome = nomeAluno;
        this.idade = idadeAluno;
        this.numeroMatricula = Matricula;
    }
    
    public void imprimirDadosCadastrais(){
        System.out.println("Nome do Aluno: " +nome);
        System.out.println("Idade do Aluno: " +idade);
        System.out.println("Matricula do Aluno: " +numeroMatricula);
    }
    
    public static void main(String [] args){
        Aluno a1 = new Aluno("Afonso",16,"101");
        a1.imprimirDadosCadastrais();
        
        Aluno a2 = new Aluno("Pedro",17,"201");
        a2.imprimirDadosCadastrais();
        
        Aluno a3 = new Aluno("Vitor",17,"301");
        a3.imprimirDadosCadastrais();
        
        Aluno a4 = new Aluno("Zenon",17,"401");
        a4.imprimirDadosCadastrais();
    }
}
