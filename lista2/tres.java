import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        double basemaior, basemenor, altura;
        Scanner area = new Scanner(System.in);

        System.out.println("Digite a base maior: ");
        basemaior = area.nextDouble();
        System.out.println("Digite a base menor: ");
        basemenor = area.nextDouble();
        System.out.println("Digite a altura: ");
        altura = area.nextDouble();

        double AREA=((basemaior+basemenor)*altura)/2;

        System.out.printf("A área é de: %.2f%n", AREA);
    }
}
