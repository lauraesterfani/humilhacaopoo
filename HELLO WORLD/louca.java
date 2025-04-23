import java.util.Scanner;

public class louca {
    public static void main(String[] args)
    {
       String nome;
       int idade;
       Scanner sc=new Scanner(System.in);

       System.out.println("Digite seu nome: ");
       nome=sc.nextLine();
       System.out.println("Digite sua idade: ");
       idade=sc.nextInt();
       //System.out.println("O seu nome é "+nome+" e sua idade é "+ idade);
        System.out.printf("o seu nome é %s e sua idade é %d ", nome , idade);
    }
}
