package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Paciente paciente = new Paciente(); //Maiusculo --> Classe, Minusculo --> Objeto
        double[] alvo = paciente.frequenciaAlvo();

        System.out.print("Nome --> ");
        paciente.nome = entrada.nextLine(); //nextLine --> usar para nome composto, ex: Vinicius Lamenza
        System.out.print("Idade --> ");
        paciente.idade = entrada.nextInt();

        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Frequência Máxima: " + paciente.frequenciaMaxima());
        System.out.println("Frequência Alvo [ " + alvo[0] + ", " + alvo[1] + " ]");

    }
}
