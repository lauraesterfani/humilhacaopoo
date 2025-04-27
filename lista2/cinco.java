import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        int numero;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = ler.nextInt();

        if(numero%2==0){
            System.out.println("par");
        }
        if(numero%2!=0){
            System.out.println("impar");
        }
    }
}
