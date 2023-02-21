package operadores;
public class OperadoresLogic{
    public static void main(String[]args){
        boolean variavel = true;
        
        //System.out.println(!variavel); //inverte o valor da variavel por um tempo para false
        
        variavel = !variavel;//conversao para false
        System.out.println(variavel);
        //////////////////////////////
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && ( 7 > 4)){
            System.out.println("as duas condicoes são verdadeiras");
        }
        
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }
    
        System.out.println("fim");

    }

}