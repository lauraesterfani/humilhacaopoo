package poo.milestone2.model;

public class App {

    public static void main(String[] args) throws Exception{

        Paciente p1=new Paciente(
            "16497926461",
            "Laura",
            20,
            'F',
            51f,
            1.45f
        );
         Paciente p2=new Paciente(
            "16497926461",
            "José",
            40,
            'M',
            67.25f,
            1.80f
        );

        System.out.println(Paciente.totalPacientes);
        System.out.println(p1.nome+" seu imc é de: "+p1.calcularImc());
        System.out.println(p2.nome+" seu imc é de: "+p2.calcularImc());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("seu metabolismo é de: "+p1.calcularMetabolismo());
        System.out.println("seu metabolismo é de: "+p2.calcularMetabolismo());
    }
}
