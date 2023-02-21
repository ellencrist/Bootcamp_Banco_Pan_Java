package operadores;
public class OperadoresTernario {
    public static void main(String[] args) {
        int a, b;
        a= 6;
        b = 6;

        //String resultado= a==b ?"VERDADEIRO":"FALSO";
        int resultado = a == b ? 1 : 0;

        System.out.println(resultado);
    ///////////////////////////////////////////////////////////////////
        String nomeUm = "diego";
        String nomeDois = new String ("diegoo");
        System.out.println("Os nomes são iguais? " + nomeUm.equals(nomeDois));
    
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Numero1 é igual a Numero2? " + simNao);
       
        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        simNao = numero1 != numero2;
        System.out.println("Numero1 é igual a Numero2? "+ simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero1 é igual a Numero2? "+ simNao);
    }
}
