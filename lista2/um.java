import java.util.Scanner;

public class um {
    public static void main(String[]args){
        int numero1;
        long numero2;
        float numero3;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero1=ler.nextInt();
        System.out.println("Digite um numero: ");
        numero2=ler.nextLong();
        System.out.println("Digite um numero: ");
        numero3=ler.nextFloat();

        System.out.printf("o número inteiro digitado foi %d, o número long digitado foi %d, o número float digitado foi %.2f.%n", numero1, numero2,numero3);
    }
}
