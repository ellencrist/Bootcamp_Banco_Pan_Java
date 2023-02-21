package edu.ellen.segundasemana;
public class Minhaclasse {
    public static void main(String[] args) {
        String primeiroNome ="ellen" ;
        String segundoNome = "crist";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
       return "resultado do metódo" + primeiroNome.concat(" ").concat(segundoNome);


    }
}
