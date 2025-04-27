import java.util.Scanner;

public class um {
    public static void main(String[]args){
        double numero1, numero2, numero3, numero4, numero5;
        Scanner media=new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        numero1=media.nextDouble();
        System.out.println("Digite a segunda nota: ");
        numero2=media.nextDouble();
        System.out.println("Digite a terceira nota: ");
        numero3=media.nextDouble();
        System.out.println("Digite a quarta nota: ");
        numero4=media.nextDouble();
        System.out.println("Digite a quinta nota: ");
        numero5=media.nextDouble();

        double resultado = (numero1+numero2+numero3+numero4+numero5)/5;

        System.out.println("a média é de "+String.format("%.2f", resultado));
    }
}
