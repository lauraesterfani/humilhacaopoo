import java.util.Scanner;
public class parte3 {
    public static void main(String[]args){
        Scanner decidir=new Scanner(System.in);

                for(int opcao=0;opcao!=3;){
                    System.out.println("opções");
                    System.out.println("1. Calcular IMC");
                    System.out.println("2. Calcular metabolismo");
                    System.out.println("3. Sair");
                    System.out.println("escolha uma opção");
                    opcao=decidir.nextInt();
                    decidir.nextLine();
                    switch(opcao){
                        case 1:
                            calcularIMC(decidir);
                            break;
                        case 2:
                            calcularMetabolismo(decidir);
                            break;
                        case 3:
                            System.out.println("encerrando programa");
                                    break;
                        default:
                            System.out.println("opção inválida");
                    }
                }
    }
    public static void calcularIMC(Scanner decidir){
        String nome;
        double peso;
        double altura;

        System.out.println("Digite o nome: ");
        nome=decidir.nextLine();
        System.out.println("Digite o peso: ");
        peso=decidir.nextDouble();
        System.out.println("Digite o altura: ");
        altura=decidir.nextDouble();

        double resulimc=peso/Math.pow(altura,2);
                System.out.println("oiii, "+nome+ " seu IMC é de "+String.format("%.2f",resulimc));
                if(resulimc<19){
                    System.out.println("abaixo do peso");
                }
                else if(resulimc>=19&&resulimc<=25){
                    System.out.println("peso normal");
                }
                else if(resulimc>=25&&resulimc<=30){
                    System.out.println("sobrepeso");
                }
                else if(resulimc>=30&&resulimc<=40){
                    System.out.println("diabete do tipo I");
                }
                else if(resulimc>=40){
                    System.out.println("obesidade mórbida");
                }
        decidir.nextLine();
        System.out.println("Pressione Enter para continuar...");
        decidir.nextLine();
    }
    public static void calcularMetabolismo(Scanner decidir){
        String nome, genero;
        double peso, metabolismo=0;
        int idade;

        System.out.println("Digite o nome: ");
        nome=decidir.nextLine();
        System.out.println("Digite o genero: ");
        genero=decidir.nextLine();
        System.out.println("Digite o idade: ");
        idade=decidir.nextInt();
        System.out.println("Digite o peso: ");
        peso=decidir.nextDouble();

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
        System.out.print("oii, "+nome+" seu metabolismo é de "+String.format("%.2f",metabolismo));
        decidir.nextLine();
        System.out.println("Pressione Enter para continuar...");
        decidir.nextLine();
    }
}
