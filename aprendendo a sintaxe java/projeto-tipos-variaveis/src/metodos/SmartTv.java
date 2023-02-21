package metodos;

public class SmartTv {
        
        boolean ligada = false;
        int canal = 1;
        int volume = 26;


        public void mudarCanal(int novoCanal){
            canal = novoCanal;
        }

        public void avancarCanal() {
            canal++;
        }

        public void voltarCanal() {
            canal--;
        }


        public void aumentarVolume() {
             //volume = volume +1;
             volume++;
            System.out.println("Aumentando o volume para: "+ volume);
           
        }

        public void diminuirVolume(){
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        }


        public void ligar() {
            ligada = true;

        }
    
        public void desligar() {
            ligada = false;
        }

}
