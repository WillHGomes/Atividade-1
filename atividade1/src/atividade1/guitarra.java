package atividade1;

public class guitarra {

	public static void main(String[] args) {
        Guitarra minhaGuitarra = new Guitarra("Fender", 6);
        minhaGuitarra.tocar();
    }
    
    public static class Guitarra {
        private String marca;
        private int numCordas;

        public Guitarra(String marca, int numCordas) {
            this.marca = marca;
            this.numCordas = numCordas;
        }

        public void tocar() {
            System.out.println("Tocando a guitarra " + this.marca + " de " + this.numCordas + " cordas.");
        }
    }
}