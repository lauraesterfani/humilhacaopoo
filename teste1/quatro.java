import java.util.Random;

public class quatro {
    public static void main(String[] args) {
        int [] numeros = new int[100];
        Random aleatorios = new Random();

        for(int i=0;i<100;i++){
            numeros[i] = aleatorios.nextInt(100)+1;
        }
    }
}
