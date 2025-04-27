import java.util.Random;

public class quinto {
    public static void main(String[] args) {
        int [] numeros = new int[100];
        Random aleatorios = new Random();

        for(int i=0;i<100;i++){
            numeros[i]=aleatorios.nextInt(100)+1;
        }
        System.out.println("\nNumeros impares:");
        for(int i=0;i<100;i++){
            if(numeros[i]%2!=0){
                System.out.print(numeros[i]+" ");
            }
        }
    }
}
