package domain;

public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;


    public void media (double num1, double num2, double num3) {
        double mediaDouble = (num1 + num2 + num3);
        double notaFaltante;
        System.out.println("A média anual do aluno " + this.nome + " é " + mediaDouble);
        if (mediaDouble >= 60) {
            System.out.println(this.nome + " está aprovado!");
        } else {
            notaFaltante = 60 - mediaDouble;
            System.out.println(this.nome + " está reprovado. Você precisa de " + notaFaltante + " pontos para passar.");
        }
    }
}
