package operadores;
public class OperadoresArit{
    public static void main (String[] args){
        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        
        //conversao para positivo
        numero = numero * -1;
        System.out.println(numero);
        

        //incremento
        int numero1 = 5;

        //x repeticao
        
        //numero1++;//numero1 = numero + 1
        
        System.out.println(++numero1);//aplicando o incremento proimeiro
        System.out.println(numero1 --);//decremento
        System.out.println(numero1);

    }
}