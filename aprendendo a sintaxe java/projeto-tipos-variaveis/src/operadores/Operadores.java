package operadores;
public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao =  1+1+1+"1";//primeiro soma depois junta com o texto "1"
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;//depois de texto não são realizadas mais operacoes matematicas
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;//somente concatenaçoes, tudo foi convertido em texto
        System.out.println(concatenacao);
        
        concatenacao =  1+"1"+1+"1";//somente concatenaçoes
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);//as operações estão evidenciadas, as operações matematicas foram validadadas e concatenadas com o texto
        System.out.println(concatenacao);
    }
}
