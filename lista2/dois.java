import java.util.Scanner;

public class dois {
    public static void main(String[] args) {
        double peso, altura;
        Scanner imc = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        peso=imc.nextDouble();
        System.out.print("Digite o seu altura: ");
        altura=imc.nextDouble();

        double IMC=peso/(altura*altura);

        System.out.printf("\nSeu imc é de: "+String.format("%.2f",IMC));
    }
}
