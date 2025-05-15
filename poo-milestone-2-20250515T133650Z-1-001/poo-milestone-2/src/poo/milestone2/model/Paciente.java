package poo.milestone2.model;

public class Paciente {
	
	String cpf;
    String nome;
    int idade;
    char sexo;
    float peso;
    float altura;

    static int totalPacientes=0;

    public Paciente(
        String cpf,
        String nome,
        int idade,
        char sexo,
        float peso,
        float altura
        ){
        this.cpf=cpf;
        this.nome=nome;
        this.idade=idade;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;

        totalPacientes++;
    }
    public String toString(){ return
        "cpf: "+this.cpf+
        ", nome: "+this.nome+
        ", idade: "+this.idade+
        ", sexo: "+this.sexo+
        ", peso: "+this.peso+
        ", altura: "+this.altura;
    }
    
    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public char getSexo(){
        return sexo;
    }

    public float getPeso(){
        return peso;
    }

    public float getAltura(){
        return altura;
    }

    public float calcularImc(){
        return peso/(altura*altura);
    }

    public float calcularMetabolismo(){
        if(this.sexo=='F'){
            if(this.idade>=18&&this.idade<=30){
                return 14.7f*this.peso+409f;
            }
            if(this.idade>=30&&this.idade<=60){
                return 8.7f*this.peso+829f;
            }
            if(this.idade>60){
                return 10.5f*this.peso+596f;
            }
        }
        if(this.sexo=='M'){
            if(this.idade>=18&&this.idade<=30){
                return 15.057f*this.peso+637.01f;
            }
            if(this.idade>=30&&this.idade<=60){
                return 11.6f*this.peso+879f;
            }
            if(this.idade>60){
                return 16.5f*this.peso+487f;
            }
        }
        return 0f;
    }
}
// Nesta atividade, deve-se implementar:
    // - Atributos de instância: cpf (String), nome (String), idade (int), sexo (char), peso (float), altura (float)
    // - Atributo de classe: totalPacientes (static int)
    // - Construtor: inicializar todos os atributos de instância
	// - Incrementar em 1 totalPacientes a cada instância de Paciente criada
    // - Método: calcularImc() retornando peso/(altura*altura), 
	// - Método: calcularMetabolismo() - Cálculo presente no slide #69, Aula 1 - Apresentação da Disciplina
	// - Método: toString (formato padrão do eclipse)