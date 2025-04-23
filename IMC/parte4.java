import java.util.Scanner;
public class parte4 {
    public static void main(String[]args){
        Scanner impar=new Scanner(System.in);
        double numero;
        System.out.println("Digite um numero: ");
        numero=impar.nextDouble();

        if(numero%2!=0){
            System.out.println("é impar");
        }
        else{
            System.out.println("é par");
        }
    }
}
