import java.util.Scanner;

public class ClasseAlunos {

    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner ler = new Scanner(System.in );

        System.out.println("Digite o Nome do Aluno 1");
        nome = ler.next();
        System.out.println("Digite a Idade do Aluno 1");
        idade = ler.nextInt();
        while (idade<=0||idade>120){
            System.out.println("Idade invalida, digite novamente, entre 1 e 120");
            idade = ler.nextInt();
        }
        Alunos al_1 = new Alunos(nome,idade);
        al_1.registraAluno();

        System.out.println("Digite o Nome do Aluno 2");
        nome = ler.next();
        System.out.println("Digite a Idade do Aluno 2");
        idade = ler.nextInt();
        while (idade<=0||idade>120) {
            System.out.println("Idade invalida, digite novamente, entre 1 e 120");
            idade = ler.nextInt();
        }
        Alunos al_2 = new Alunos(nome,idade);
        al_2.registraAluno();

        System.out.println("Digite o Nome do Aluno 3");
        nome = ler.next();
        System.out.println("Digite a Idade do Aluno 3");
        idade = ler.nextInt();
        while (idade<=0||idade>120) {
            System.out.println("Idade invalida, digite novamente, entre 1 e 120");
            idade = ler.nextInt();
        }
        Alunos al_3 = new Alunos(nome,idade);
        al_3.registraAluno();

        System.out.println("Os Nomes dos Alunos : \n"
                + al_1.getNome() + " " + al_1.getIdade() + "\n"
                + al_2.getNome() + " " + al_2.getIdade() + "\n"
                + al_3.getNome() + " " + al_3.getIdade() + "\n");

        System.out.println("O numero de Alunos é: ");

        System.out.println(Alunos.contagem);

        System.out.println("Para alterar, digite outro Nome para Aluno 1:");
        nome = ler.next();
        al_1.setNome(nome);
        System.out.println("Para alterar, digite outra Idade para Aluno 1:");
        idade = ler.nextInt();
        while (idade<=0||idade>120) {
            System.out.println("Idade invalida, digite novamente, entre 1 e 120");
            idade = ler.nextInt();
        }
        al_1.setIdade(idade);

        System.out.println("Para alterar, digite outro Nome para Aluno 2:");
        nome = ler.next();
        al_2.setNome(nome);
        System.out.println("Para alterar, digite outra Idade para Aluno 2:");
        idade = ler.nextInt();
        while (idade<=0||idade>120) {
            System.out.println("Idade invalida, digite novamente, entre 1 e 120");
            idade = ler.nextInt();
        }
        al_2.setIdade(idade);

        System.out.println("Para alterar, digite outro Nome para Aluno 3:");
        nome = ler.next();
        al_3.setNome(nome);
        System.out.println("Para alterar, digite outra Idade para Aluno 3:");
        idade = ler.nextInt();
        while (idade<=0||idade>120) {
            System.out.println("Idade invalida, digite novamente, entre 1 e 120");
            idade = ler.nextInt();
        }
        al_3.setIdade(idade);

        System.out.println("Os aluno agore estão assim: \n"
                + al_1.getNome() + " " + al_1.getIdade() + "\n"
                + al_2.getNome() + " " + al_2.getIdade() + "\n"
                + al_3.getNome() + " " + al_3.getIdade() + "\n");
    }
}