import java.util.Random;

public class oitavo {
    public static void main(String[] args) {
        int soma=0;
        int[] numeros= new int[100];
        Random aleatorios =new Random();

        for(int i=0;i<100;i++){
            numeros[i]=aleatorios.nextInt(100)+1;
            soma+=numeros[i];
        }
        double resultado=soma/100;
        System.out.println("A média é de: "+String.format("%.2f", resultado));
    }
}
