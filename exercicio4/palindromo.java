//Nome: Afonso Vilhena.
public class palindromo{
    public static void main(String[] args){
//      Variáveis:
        String entry = args[0];
        String probe = entry;
        String pal = probe;
        boolean check = false;
        int tam,tam1,pos,pos1 = 0,cont=0,pos2 = 0;
//      Tamanho:
        tam = probe.length();
//      Percorre a string.
        while(tam > 4 && check == false){
        tam1 = tam;
            for(pos = 0;pos <= pos1; pos++){
                cont = pos + tam1;
                probe = pal.substring(pos, cont);
                StringBuffer x = new StringBuffer(probe);
                x.reverse();
                String esrever = x.toString();
                    if(probe.equals(esrever)){
                        pos2 = cont - 1;
                        System.out.println(probe);
                        System.out.println("O palíndromo esta na posicao " + pos + " - " + pos2);
                        check = true;
                    }
             }
            pos1++;
            tam--;
        }
        if(check == false){
            System.out.println("Não há nenhum palíndromo no texto informado.");
        }
    }
}
