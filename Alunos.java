/******************************************************************************

 Crie uma classe e insira nela, no mínimo, dois atributos, os quais devem ter um método acessor (get)
 e um método modificador (set) para cada. Defina um objeto para cada atributo e elabore um construtor
 para criar alguma regra.

 A atividade pode ser realizada em qualquer linguagem de programação ou apenas utilizando algoritmos.

 *******************************************************************************/

public class Alunos {
    private String nome;
    private int idade;
    public static int contagem = 0;

    Alunos (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome (String nome){
    this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void registraAluno(){
        contagem++ ;
    }
}
