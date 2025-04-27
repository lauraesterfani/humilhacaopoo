import java.util.Scanner;

public class dois {
    public static void main(String[] args) {
        int[] numeros=new int[10];
        Scanner entrada=new Scanner(System.in);

        for(int i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"º número:");
            numeros[i]=entrada.nextInt();
        }
         System.out.println("\nNumeros na ordem inversa: ");

        for(int i=9;i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
}
