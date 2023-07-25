package projetoPrincipal;

        import domain.Estudante;

        import java.util.Scanner;

public class EstudanteNota {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        aluno.nome = sc.nextLine();
        System.out.print("Digite sua nota no 1º trimestre: ");
        aluno.nota1 = sc.nextDouble();
        while (aluno.nota1 > 30){
            System.out.print("Nota inválida. O 1º trimestre só comporta nota até 30 pontos. Digite novamente: ");
            aluno.nota1 = sc.nextDouble();
        }
        System.out.print("Digite sua nota no 2º trimestre: ");
        aluno.nota2 = sc.nextDouble();
        while (aluno.nota2 > 35){
            System.out.print("Nota inválida. O 2º trimestre só comporta nota até 35 pontos. Digite novamente: ");
            aluno.nota2 = sc.nextDouble();
        }
        System.out.print("Digite sua nota no 3º trimestre: ");
        aluno.nota3 = sc.nextDouble();
        while (aluno.nota3 > 35){
            System.out.print("Nota inválida. O 3º trimestre só comporta nota até 35 pontos. Digite novamente: ");
            aluno.nota3 = sc.nextDouble();
        }
        aluno.media(aluno.nota1, aluno.nota2, aluno.nota3);

    }
}
