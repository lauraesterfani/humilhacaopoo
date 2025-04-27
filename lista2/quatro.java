import java.util.Scanner;

public class quatro {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner maior = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        numero1 = maior.nextInt();
        System.out.print("Digite um numero: ");
        numero2 = maior.nextInt();

        if(numero1>numero2){
            System.out.println("\no "+numero1+" é maior que o "+numero2);
        }
        if(numero1<numero2){
            System.out.println("\no "+numero2+" é maior que o "+numero1);
        }
        else {
            System.out.println("\nambos são iguais");
        }
    }
}
