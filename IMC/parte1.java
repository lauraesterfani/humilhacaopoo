import java.util.Scanner;
public class parte1 {
    public static void main(String[]args){
        String nome;
        double peso;
        double altura;
        Scanner imc = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        nome = imc.nextLine();
        System.out.println("Digite o peso: ");
        peso=imc.nextDouble();
        System.out.println("Digite o altura: ");
        altura = imc.nextDouble();

        double resultimc= peso / Math.pow(altura, 2);//math.pow é pra elevar
        System.out.println("olá, "+nome+" seu IMC é de "+ String.format("%.2f",resultimc));

        if(resultimc>19){
            System.out.println("abaixo do peso");
        }
        else if(19<=resultimc && resultimc<25){
            System.out.println("peso normal");
        }
        else if(25<=resultimc && resultimc<30){
            System.out.println("sobrepeso");
        }
        else if(30<=resultimc && resultimc<40){
            System.out.println("obesidade do tipo I");
        } else if (resultimc >= 40) {
            System.out.println("obesidade mórbida");
        }
    }
}
