import java.util.Scanner;
public class parte2 {
    public static void main(String[]args){
        String nome, genero;
        double peso, metabolismo=0;
        int idade;
        Scanner meta=new Scanner(System.in);

        System.out.println("Digite o nome: ");
        nome = meta.nextLine();
        System.out.println("Digite o genero: ");
        genero = meta.nextLine();
        System.out.println("Digite o peso: ");
        peso = meta.nextDouble();
        System.out.println("Digite o idade: ");
        idade = meta.nextInt();

        if(genero.equalsIgnoreCase("Homem")){
            if(idade>=18 && idade<=30){
                metabolismo=15.057*peso+679;
            }
            else if(idade>=30 && idade<=60){
                metabolismo=11.6*peso+879;
            }
            else if(idade>=60){
                metabolismo=13.5*peso+487;
            }
        }
        if(genero.equalsIgnoreCase("Mulher")){
            if(idade>=18 && idade<=30){
                metabolismo=14.7*peso+486.6;
            }
            else if(idade>=30 && idade<=60){
                metabolismo=8.7*peso+829;
            }
            else if(idade>=60){
                metabolismo=10.5*peso+596;
            }
        }
        System.out.println(nome+ "seu metabolismo é: "+String.format("%.2f",metabolismo));
    }
}
