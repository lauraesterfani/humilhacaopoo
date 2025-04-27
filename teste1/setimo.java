import java.util.Random;

public class setimo {
    public static void main(String[]args){
        int[] numeros = new int[100];
        Random aleatorios = new Random();

        for(int i=0;i<100;i++){
            numeros[i]=aleatorios.nextInt(100);
        }
        int maior=0;
        int menor=0;

        for(int i=0;i<100;i++){
            if(numeros[i]>maior){
                maior=numeros[i];
            }
            if(numeros[i]<menor){
                menor=numeros[i];
            }
        }
        System.out.println("Número maior é: "+maior);
        System.out.println("Numero nemor é: "+menor);
    }
}
