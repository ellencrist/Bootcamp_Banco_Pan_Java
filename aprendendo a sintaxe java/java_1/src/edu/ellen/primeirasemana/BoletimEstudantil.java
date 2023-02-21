package edu.ellen.primeirasemana;



public class BoletimEstudantil {
    public static void main(String[] args) {
       int mediaFinal = 9;
        
        if(mediaFinal<6)
            System.out.println("Reprovado");
        else if(mediaFinal==6)
            System.out.println("Na média");
        else
            System.out.println("Aprovado");



    }
}
