import java.util.Random;

public class tres {
    public static void main(String[]args){
        int[]numeros=new int[100];
        Random aleatorios=new Random();

        for(int i=0;i<100;i++){
            numeros[i]=aleatorios.nextInt(100);
        }
        System.out.println("\nNumeros na ordem normal:");
        for(int i=0;i<100;i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println("\nNumeros na ordem inversa: ");
        for(int i=99; i>=0;i--){
            System.out.print(numeros[i]+" ");
        }
    }
}
